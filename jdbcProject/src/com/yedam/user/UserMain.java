package com.yedam.user;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		UserDao dao = new UserDao();
		Scanner scn = new Scanner(System.in);
		int menu = 0;

		while (true) {
			System.out.println(" 1. 추가 | 2. 조회 | 3. 수정 | 4. 삭제 | 5. 목록 | 6. 종료 ");
			System.out.println("====================================================");
			System.out.print("선택> ");
			menu = Integer.parseInt(scn.nextLine());
			System.out.println("----------------------------------------------------");
			// 추가
			if (menu == 1) {
				System.out.print("id> ");
				String id = scn.nextLine();
				System.out.print("pw> ");
				String pw = scn.nextLine();
				System.out.print("name> ");
				String name = scn.nextLine();
				UserVO user = new UserVO();

				user.setUserId(id);
				user.setUserPw(pw);
				user.setUserName(name);

				if (dao.add(user)) {
					System.out.println("성공적으로 처리되었습니다.");
				} else {
					System.out.println("처리에 실패했습니다.");
				}
				// 조회
			} else if (menu == 2) {
				System.out.print("id> ");
				String id = scn.nextLine();

				UserVO user = dao.search(id);
				if (user == null) {
					System.out.println("조회된 정보가 없습니다.");
				} else {
					System.out.println(user.toString());
				}
				// 수정
			} else if (menu == 3) {
				System.out.print("id> ");
				String id = scn.nextLine();
				System.out.print("pw> ");
				String pw = scn.nextLine();
				System.out.print("name> ");
				String name = scn.nextLine();
				System.out.print("birth> ");
				String birth = scn.nextLine();
				System.out.print("phone> ");
				String phone = scn.nextLine();
				System.out.print("address> ");
				String addr = scn.nextLine();

				UserVO user = new UserVO();
				user.setUserId(id);
				user.setUserPw(pw);
				user.setUserName(name);
				user.setUserBirth(birth);
				user.setUserPhone(phone);
				user.setUserAddr(addr);

				if (dao.modify(user)) {
					System.out.println("정상적으로 수정되었습니다.");
				} else {
					System.out.println("수정할 대상이 없습니다.");
				}
				// 삭제
			} else if (menu == 4) {
				System.out.print("id> ");
				String id = scn.nextLine();
				UserVO user = new UserVO();
				user.setUserId(id);

				if (dao.remove(user)) {
					System.out.println("정상적으로 삭제되었습니다.");
				} else {
					System.out.println("삭제할 대상이 존재하지 않습니다.");
				}
				// 목록출력
			} else if (menu == 5) {
				List<UserVO> list = dao.list();

				if (list.size() == 0) {
					System.out.println("조회 결과가 존재하지 않습니다.");
				} else {
					for (UserVO user : list) {
						System.out.println(user.toString());
					}
				}
				// 종료
			} else if (menu == 6) {
				break;
			}

		}
		System.out.println("프로그램이 종료되었습니다.");
	}// main
}
