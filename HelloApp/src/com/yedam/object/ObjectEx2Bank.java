package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {

	static Bank[] accounts = new Bank[3];
	static Scanner scn = new Scanner(System.in);

	// 조회하려는 계좌 유무 체크
	public static boolean checkAccount(String accountNo) {
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}

//	public static void printAry() {
//		for (Bank bank : accounts) {
//			System.out.println(bank.getAccountNo());
//		}
//	}

	// 계좌 등록 기능
	public static void registerAccount() {

		System.out.printf("계좌번호를 등록해주세요.");
		String actnum = scn.nextLine();

		// if
		//
		System.out.printf("이름을 등록해주세요.");
		String oname = scn.nextLine();
		//
		System.out.printf("통장 잔고를 등록해주세요.");
		int money = Integer.parseInt(scn.nextLine());
		// 입력된 정보 배열에 담기
		Bank b1 = new Bank();
//			b1.accountNo = actnum;
//			b1.owner = oname;
//			b1.balance = money;
		// 클래스에서 bank를 프라이빗으로 바꾸어서... 선언을 이제 이렇게해야하는듯
		b1.setAccountNo(actnum);
		b1.setOwner(oname);
		b1.setBalance(money);
		// 비어있는 위치를 찾아서 넣어야함
		for (int i = 0; i < accounts.length; i++) { // 배열의 크기만큼 반복
			if (accounts[i] == null) {
				accounts[i] = b1; // 비어있는지 보고 비어있으면(null) b1을 넣음.
				break; // 같은 값을 계속 넣지 않기 위해 break함
			}
		}
	}

	public static void searchAccount() {

		System.out.println("조회할 계좌번호를 입력하세요.");
		String searchac = scn.nextLine();
		boolean isTrue = checkAccount(searchac); // true나 false 반환...
		if (!isTrue) {
			System.out.println("계좌 정보를 조회할 수 없습니다.");
			return;
		}
		for (int i = 0; i < accounts.length; i++) {
			if (isTrue) {
				System.out.printf("계좌번호: %s, 예금주: %s, 통장 잔고: %d\n", accounts[i].getAccountNo(), accounts[i].getOwner(),
						accounts[i].getBalance());
				isTrue = true;
				break;
			}
		}
	}

	public static void desposit() {
		System.out.println("조회할 계좌번호를 입력하세요.");
		String searchac = scn.nextLine();
		// 계좌가 있는지 없는지 체크...
		boolean isTrue = checkAccount(searchac); // true나 false 반환...
		if (!isTrue) {
			System.out.println("계좌 정보를 조회할 수 없습니다.");
			return;
		}

		System.out.println("입금하실 금액을 입력해주세요.");
		int plusMoney = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNo().equals(searchac)) {
				accounts[i].setBalance(accounts[i].getBalance() + plusMoney);
				// accounts[i].balance += plusMoney 는 accounts[i].balance = accounts[i].balance
				// + plusMoney와 똑같은 의미이므로
				// setBalance(getBalance+plusMoney)해야한다.........? get은 값을 가져오는거고 수정하려면 set을
				// 사용해야하는거같음...
				System.out.println("입금되었습니다.");
				System.out.printf("예금주 : %s 통장 잔고: %d원\n", accounts[i].getOwner(), accounts[i].getBalance());
				break;
			}
		}
	}

	public static void withdraw() {
		System.out.println("조회할 계좌번호를 입력하세요.");
		String searchac = scn.nextLine();

		boolean isTrue = checkAccount(searchac); // true나 false 반환...
		if (!isTrue) {
			System.out.println("계좌 정보를 조회할 수 없습니다.");
			return;
		}
		System.out.println("출금하실 금액을 입력해주세요.");
		int minusMoney = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNo().equals(searchac)) {
				accounts[i].setBalance(accounts[i].getBalance() - minusMoney);
				System.out.println("출금되었습니다.");
				System.out.printf("예금주 : %s 통장 잔고: %d원\n", accounts[i].getOwner(), accounts[i].getBalance());
				break;
			}
		}
	}

	public static void removeAccount() {
		// 배열의 삭제(값을 null로 만들어줌)
		System.out.println("삭제할 계좌번호를 입력하세요.");
		String searchac = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(searchac))
				accounts[i] = null;
			System.out.println("정상적으로 삭제되었습니다.");
			break;

		}
	}

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 등록 2. 계좌번호 조회 3. 예금 4. 출금 5. 삭제 6. 종료");
			System.out.println("===============================================");
			System.out.printf("선택----->> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			// 1. 등록
			if (selectNo == 1) {
				registerAccount();
			}
			// 2. 조회
			else if (selectNo == 2) {
				searchAccount();
			}
			// 3. 예금
			else if (selectNo == 3) {
				desposit();
			}
			// 4. 출금
			else if (selectNo == 4) {
				withdraw();
			}
			// 5. 삭제
			else if (selectNo == 5) {
				removeAccount();
			}
			// 6. 종료
			else if (selectNo == 6) {
				run = false;
			}

		}
		System.out.println("--------------------------------------------");
		System.out.println("프로그램이 종료되었습니다.");

	}
}
