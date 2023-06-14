package com.yedam.board;

import java.util.List;
import java.util.Scanner;

import com.yedam.user.UserVO;

//글 등록 삭제 내용수정 목록보기 상세보기
public class BoardMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		BoardDao dao = new BoardDao();
		int select = 0;

		while (true) {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(" 1. 게시글 등록 | 2. 게시글 삭제 | 3. 게시글 수정 | 4. 게시글 목록 | 5. 찾아보기 | 6. 종료 ");
			System.out.println("============================================================================");
			System.out.print("선택> ");
			select = Integer.parseInt(scn.nextLine());
			System.out.println("----------------------------------------------------------------------------");
			// 1등록
			if (select == 1) {
				System.out.print("제목> ");
				String title = scn.nextLine();
				System.out.print("작성자> ");
				String writer = scn.nextLine();
				System.out.print("내용> ");
				String content = scn.nextLine();
				System.out.println("작성 날짜> (미기재시 금일 날짜)");
				String date = scn.nextLine();

				BoardVO bd = new BoardVO();

				bd.setBrd_title(title);
				bd.setBrd_writer(writer);
				bd.setBrd_content(content);
				bd.setCreate_date(date);

				if (dao.add(bd)) {
					System.out.println("성공적으로 처리되었습니다.");
				} else {
					System.out.println("처리에 실패했습니다.");
				}
				// 2삭제
			} else if (select == 2) {
				System.out.println("삭제할 게시글의 제목을 입력하세요.");
				System.out.print("제목> ");
				String title = scn.nextLine();
				BoardVO bd = new BoardVO();

				bd.setBrd_title(title);
				if (dao.delete(bd)) {
					System.out.println("게시글을 삭제했습니다.");
				} else {
					System.out.println("삭제하려는 게시글이 존재하지 않습니다.");
				}
				// 3수정
			} else if (select == 3) {
				System.out.println("수정할 게시글의 번호를 입력하세요.");
				System.out.print("번호> ");
				int no = Integer.parseInt(scn.nextLine());

				System.out.print("제목> ");
				String title = scn.nextLine();
				System.out.print("작성자> ");
				String writer = scn.nextLine();
				System.out.print("내용> ");
				String content = scn.nextLine();
				System.out.println("작성 날짜> (미기재시 금일 날짜)");
				String date = scn.nextLine();
				BoardVO bd = new BoardVO();

				bd.setBrd_no(no);
				bd.setBrd_title(title);
				bd.setBrd_content(content);
				bd.setCreate_date(date);

				if (dao.modify(bd)) {
					System.out.println("게시글을 수정했습니다.");
				} else {
					System.out.println("수정하려는 게시글이 존재하지 않습니다.");
				}
				// 4목록
			} else if (select == 4) {
				List<BoardVO> list = dao.list();

				if (list.size() == 0) {
					System.out.println("조회 결과가 존재하지 않습니다.");
				} else {
					for (BoardVO bd : list) {
						System.out.println(bd.toString());
					}
				}
				// 5상세
			} else if (select == 5) {
				System.out.println("조회하실 작성자를 입력해주세요.");
				System.out.print("작성자> ");
				String writer = scn.nextLine();

				BoardVO bd = dao.search(writer);
				if (bd == null) {
					System.out.println("조회된 정보가 없습니다.");
				} else {
					System.out.println(bd.toString());
				}
				// 6종료
			} else if (select == 6) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
