package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

//추가, 조회, 삭제, 종료(종료 시점에 파일에 저장) 기능
public class PhoneBookManager {

	// 친구 이름이 중복되면 등록을 못하도록 Set컬렉션 사용(개너무함)

	HashSet<PhoneInfo> infoStorage = new HashSet<>();
	File dataFile = new File("c:/temp/phonebook.txt");// 종료시점에 외부 파일로 저장하기 위해 파일 선언?
	File dataStream = new File("c:/temp/phonbook.dat");

	private static PhoneBookManager instance;

	// 싱글톤방식
	private PhoneBookManager() {
//		readFromFile(); // 저장된 정보를 set컬렉션이 초기화
		readFromStream();
	}

	public static PhoneBookManager getInstance() {
		if (instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}

	// 등록
	public void inputData() throws MenuChoiceException {
		System.out.println("연락처 구분");
		System.out.println("1. 일반 | 2. 대학 | 3. 회사");
		System.out.print("선택> ");

		PhoneInfo info = null;

		int menu = MenuViewer.scn.nextInt();
		MenuViewer.scn.nextLine(); // 엔터처리?

		if (menu < INPUT_SELECT.NORMAL || menu > INPUT_SELECT.COMPANY) {
			throw new MenuChoiceException(menu);
		}

		switch (menu) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo();
			break;
		}

		boolean isAdded = infoStorage.add(info); // 중복값 false 정상 true
		if (isAdded) {
			System.out.println("등록되었습니다.");
		} else {
			System.out.println("오류가 발생했습니다.");
		}
	}

	// 일반 친구 추가 메소드
	private PhoneInfo readFriendInfo() {
		System.out.print("이름> ");
		String name = MenuViewer.scn.nextLine();
		System.out.print("연락처> ");
		String phone = MenuViewer.scn.nextLine();
		return new PhoneInfo(name, phone);
	}

	// 학교 친구 추가 메소드
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("이름> ");
		String name = MenuViewer.scn.nextLine();
		System.out.print("연락처> ");
		String phone = MenuViewer.scn.nextLine();
		System.out.print("전공> ");
		String major = MenuViewer.scn.nextLine();
		System.out.print("학년> ");
		int year = MenuViewer.scn.nextInt();
		MenuViewer.scn.nextLine();

		return new PhoneUnivInfo(name, phone, major, year);
	}

	// 회사 친구 추가 메소드
	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("이름> ");
		String name = MenuViewer.scn.nextLine();
		System.out.print("연락처> ");
		String phone = MenuViewer.scn.nextLine();
		System.out.print("회사> ");
		String company = MenuViewer.scn.nextLine();

		return new PhoneCompanyInfo(name, phone, company);
	}

	// 종료 후 파일 저장
	public void storeToFile() {
		System.out.println("프로그램을 종료합니다.");
		try {
			FileWriter fw = new FileWriter(dataFile);
			Iterator<PhoneInfo> iter = infoStorage.iterator();
			while (iter.hasNext()) {
				fw.write(iter.next().toString()); // 이름/연락처 |전공/학년| 회사
			}
			fw.flush();
			fw.close();
			System.out.println("저장을 완료했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// storeToStream() => ObjectOutputStream;
	public void storeToStream() {
		System.out.println("프로그램을 종료합니다.");
		try {
			FileOutputStream fos = new FileOutputStream(dataStream);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dataStream);
			oos.close();
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 시작시점에 파일을 읽는 작업
	public void readFromFile() {
		if (!dataFile.exists()) { // 파일이 있는지 체크하고... 없으면 굳이? 아래구문을 실행하지않음
			return;
		}
		try {
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr); // 한 라인씩 읽어들이는 메소드가 존재

			String str = "";
			PhoneInfo info = null;
			while ((str = br.readLine()) != null) { // null인지 아닌지 체크해서 한 라인씩 읽어들이는...
				String[] record = str.split(","); // ,를 기준으로 구분
				int kind = Integer.parseInt(record[0]);
				switch (kind) {
				case INPUT_SELECT.NORMAL:
					info = new PhoneInfo(record[1], record[2]);
					break;
				case INPUT_SELECT.UNIV:
					info = new PhoneUnivInfo(record[1], record[2], record[3], Integer.parseInt(record[4]));
					break;
				case INPUT_SELECT.COMPANY:
					info = new PhoneCompanyInfo(record[1], record[2], record[3]);
					break;
				}
				infoStorage.add(info);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ObjectInputStream
	public void readFromStream() {
		if (!dataStream.exists()) { // 파일이 있는지 체크하고... 없으면 굳이? 아래구문을 실행하지않음
			return;
		}
		try {
			FileInputStream fis = new FileInputStream(dataStream);
			ObjectInputStream ois = new ObjectInputStream(fis);
			dataStream = (File) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 삭제
	public void deleteData() {
		System.out.println("이름을 입력해주세요.");
		String name = MenuViewer.scn.nextLine();

		Iterator<PhoneInfo> iter = infoStorage.iterator();
		while (iter.hasNext()) {
			PhoneInfo curr = iter.next(); // 하나씩 가져오는 메소드
			if (curr.getName().equals(name)) {
				iter.remove();
				System.out.println("정상적으로 삭제되었습니다.");
				return;
			}
		}
		System.out.println("삭제하려는 이름이 존재하지 않습니다.");
	}

	// 조회
	public void searchData() {
		System.out.println("이름을 입력해주세요.");
		String name = MenuViewer.scn.nextLine();

		PhoneInfo info = search(name);
		if (info == null) {
			System.out.println("찾으려는 이름이 존재하지 않습니다.");
		} else {
			info.showPhoneInfo();
		}
	}

	public PhoneInfo search(String name) {
		Iterator<PhoneInfo> iter = infoStorage.iterator();
		while (iter.hasNext()) {
			PhoneInfo curItem = iter.next();
			if (curItem.getName().equals(name)) {
				return curItem;
			}
		}
		return null;
	}
}//
