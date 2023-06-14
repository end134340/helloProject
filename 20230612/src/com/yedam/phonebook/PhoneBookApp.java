package com.yedam.phonebook;

//PhoneInfo: 부모클래스(이름/연락처 정보)
//PhoneCompanyInfo: 회사 사람 연락처
//PhoneUnivInfo: 학교 친구 연락처
//PhoneBookManager: 기능
//MenuChoiceException: 예외처리, 메뉴: INIT_MENU, INPUT_SELECT
//MenuViewer: 메뉴 출력 클래스

public class PhoneBookApp {
	public static void main(String[] args) {
		PhoneBookManager app = PhoneBookManager.getInstance();
		int menu;

		UserCheck check = new UserCheck();
		while (true) {
			System.out.println("아이디와 패스워드를 입력해주십시오.");
			String val = MenuViewer.scn.nextLine();
			String[] record = val.split(" ");
			if (check.loginCheck(record[0], record[1])) {
				break;
			}
		}

		// 프로그램 시작 전 아이디/패스워드를 묻고 일치하면 접속.
		while (true) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.scn.nextInt();
				MenuViewer.scn.nextLine();

				if (menu < INIT_MENU.INPUT || menu > INIT_MENU.EXIT) {
					throw new MenuChoiceException(menu);
				}

				switch (menu) {
				case INIT_MENU.INPUT:
					app.inputData();
					break;
				case INIT_MENU.SEARCH:
					app.searchData();
					break;
				case INIT_MENU.DELETE:
					app.deleteData();
					break;
				case INIT_MENU.EXIT:
//					app.storeToFile();
					app.storeToStream();
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
			}
		}
	}
}
