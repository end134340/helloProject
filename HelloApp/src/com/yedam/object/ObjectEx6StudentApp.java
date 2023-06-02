package com.yedam.object;

import java.util.Scanner;

public class ObjectEx6StudentApp {
	// 학생 정보 관리 어플 제작...
	// 1. 학생정보 등록 2.학생 목록 확인 3. 학생 조회(이름) 4.학생정보 수정(점수) 5.학생 정보 삭제 6. 종료
	// 학생 정보: 번호(00-000)/이름/성별(남/여)/점수
	static Scanner scan = new Scanner(System.in);
	static Student[] students = new Student[3];

	public static boolean checkStudent(String stuNum) {
		boolean check = false;
		for (int i = 0; i < students.length; i++) {
			if (students != null && students[i].getStuNum().equals(stuNum)) {
				check = true;
				break;
			}
		}
		return check;
	}

	public static void register() {
		System.out.println("등록할 정보를 입력해주세요.");

		System.out.print("번호 > ");
		String stunum = scan.nextLine();
		System.out.print("성명 > ");
		String stuname = scan.nextLine();
		System.out.print("성별 > ");
		String stugen = scan.nextLine();
		System.out.print("성적 > ");
		int stuscore = Integer.parseInt(scan.nextLine());

		Student stu = new Student(stunum, stuname, stugen, stuscore);

		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = stu;
				break;
			}
		}
	}

	public static void list() {
		boolean isExist = false;
		int male = 0, women = 0, maxscr = 0;
		String maxname = "";
		for (Student std : students) {
			if (std != null) {
				std.showInfo();
				isExist = true;
				if (std.getStuGender().equals("남")) {
					male++;
				} else {
					women++;
				}
				if (maxscr < std.getStuScr()) {
					maxscr = std.getStuScr();
					maxname = std.getStuName();
				}
			}
		}
		if (isExist) {
			System.out.println("--------------------------------------------------------------------");
			System.out.printf("남자 %d명 | 여자 %d명 | 최고점수 : %d | 성명 %s", male, women, maxscr, maxname);
		} else {
			System.out.println("등록된 정보가 없습니다.");
		}
	}

	public static void search() {
		System.out.println("조회할 학생의 이름을 입력하세요.");
		String stuName = scan.nextLine();
		boolean check = false;
		for (Student student : students) {
			if (student != null && student.getStuName().equals(stuName)) {
				check = true;
			}
		}
		if (!check) {
			System.out.println("조회하려는 학생을 찾을 수 없습니다.");
			return;
		}
		for (int i = 0; i < students.length; i++) {
			if (check) {
				System.out.printf("> 학생 번호: %s | 이름: %s | 성별: %s | 점수: %d\n", students[i].getStuNum(),
						students[i].getStuName(), students[i].getStuGender(), students[i].getStuScr());
				check = true;
				break;
			}
		}
	}

	public static void modify() {
		System.out.println("점수를 수정할 학생 번호를 입력하세요.");
		String checknum = scan.nextLine();
		boolean tch = checkStudent(checknum);

		if (!tch) {
			System.out.println("조회하려는 학생을 찾을 수 없습니다.");
			return;
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStuNum().equals(checknum)) {
				System.out.println("수정할 점수를 입력하세요.");
				int oscore = Integer.parseInt(scan.nextLine());
				students[i].setStuScr(oscore);
				System.out.println("수정되었습니다.");
			}
		}
	}

	public static void remove() {
		System.out.println("삭제할 학생 번호를 입력하세요.");
		String checknum = scan.nextLine();
		boolean tch = checkStudent(checknum);

		if (!tch) {
			System.out.println("삭제하려는 학생을 찾을 수 없습니다.");
			return;
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStuNum().equals(checknum))
				students[i] = null;
			System.out.println("정상적으로 삭제되었습니다.");
			break;
		}

	}

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" 1. 학생 등록 2. 학생 목록 확인 3. 학생정보 조회 4. 학생정보 수정 5. 정보 삭제 6. 종료");
			System.out.println("====================================================================");
			System.out.printf("선택----->> ");
			int selectNo = Integer.parseInt(scan.nextLine());

			// 1. 등록
			if (selectNo == 1) {
				register();

			}
			// 2. 조회
			else if (selectNo == 2) {
				list();
			}
			// 3. 학생정보 조회
			else if (selectNo == 3) {
				search();
			}
			// 4. 학생정보 수정
			else if (selectNo == 4) {
				modify();
			}
			// 5. 정보 삭제
			else if (selectNo == 5) {
				remove();
			}
			// 6. 종료
			else if (selectNo == 6) {
				run = false;
			}

		}
		System.out.println("--------------------------------------------");
		System.out.println("프로그램이 종료되었습니다.");

	}

	// 1.register() 2.list() 3.search() 4.modify() 5.remove() 6.종료
	// 근데 전체 목록이랑 같이 성별마다 몇명 있는지 최고점수를 이름과 함께 보여주기..
}
