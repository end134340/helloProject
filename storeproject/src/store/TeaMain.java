package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.board.BoardVO;
import com.yedam.user.UserVO;

public class TeaMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		TeaDao dao = new TeaDao();
		int select = 0;

		while (true) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("  [1] 상품 등록 | [2] 상품 목록 | [3] 상품 조회 | [4] 상품 입/출고 | [5] 재고 관리 | [6] 종료 ");
			System.out.println("================================================================================");
			System.out.print("*선택 >>  ");
			select = Integer.parseInt(scn.nextLine());
			System.out.println("--------------------------------------------------------------------------------");

			// 등록
			if (select == 1) {
				System.out.println("등록하실 상품의 이름을 입력하세요.");
				String name = scn.nextLine();
				//
				System.out.println("등록하실 상품의 종류을 입력하세요.");
				System.out.println("예) 녹차/홍차/백차/우롱/디카페인");
				String kind = scn.nextLine();
				//
				System.out.println("등록하실 상품의 내용을 입력하세요.");
				String content = scn.nextLine();
				//
				System.out.println("등록하실 상품의 가격을 입력하세요.");
				int price = Integer.parseInt(scn.nextLine());
				//
				System.out.println("등록하실 상품의 재고를 입력하세요.");
				int stock = Integer.parseInt(scn.nextLine());
				//
				System.out.println("등록 날짜를 입력하세요.");
				System.out.println("예) 2023/01/01. 미기재시 오늘 날짜로 등록됩니다.");
				String date = scn.nextLine();

				TeaVO tv = new TeaVO();

				tv.setTea_name(name);
				tv.setTea_kind(kind);
				tv.setTea_content(content);
				tv.setTea_price(price);
				tv.setTea_stock(stock);
				tv.setUp_date(date);

				if (dao.upload(tv)) {
					System.out.println("성공적으로 처리되었습니다.");
				} else {
					System.out.println("처리에 실패했습니다.");
				}

				// 목록
			} else if (select == 2) {
				List<TeaVO> list = dao.list();

				if (list.size() == 0) {
					System.out.println("조회 결과가 존재하지 않습니다.");
				} else {
					for (TeaVO tea : list) {
						System.out.println(tea.toString());
					}
				}
				// 조회
			} else if (select == 3) {
				System.out.println("                 [1] 차 종류로 조회 (모두 조회) [2] 번호로 조회 (상세 조회)");
				System.out.println("================================================================================");
				System.out.print("선택> ");
				int num = Integer.parseInt(scn.nextLine());
				if (num == 1) {
					System.out.println("조회하실 상품의 종류를 선택하세요.");
					System.out.print("종류> ");
					String kind = scn.nextLine();
					TeaVO tvk = dao.searchk(kind);
					if (tvk == null) {
						System.out.println("조회된 정보가 없습니다.");
					} else {
						System.out.println(tvk.toString());
					}
				} else if (num == 2) {
					System.out.println("조회하실 상품의 번호를 선택하세요.");
					System.out.print("번호> ");
					int no = Integer.parseInt(scn.nextLine());
					TeaVO tvn = dao.searchn(no);
					if (tvn == null) {
						System.out.println("조회된 정보가 없습니다.");
					} else {
						System.out.println(tvn.toString());
						System.out.println(tvn.content());
					}
				}

				// 출/입고
			} else if (select == 4) {
				System.out.println("           	   [1] 상품 입고                      [2] 상품 출고");
				System.out.println("================================================================================");
				System.out.print("선택> ");
				int num = Integer.parseInt(scn.nextLine());

				if (num == 1) {
					System.out.println("입고할 상품의 번호를 입력해주세요.");
					System.out.print("번호> ");
					int no = Integer.parseInt(scn.nextLine());
					TeaVO tv = new TeaVO();

					System.out.print("수량> ");
					int plus = Integer.parseInt(scn.nextLine());
					tv.setTea_no(no);
					tv.setTea_stock(plus);

					if (dao.instock(tv)) {
						System.out.println("게시글을 수정했습니다.");
					} else {
						System.out.println("수정하려는 게시글이 존재하지 않습니다.");
					}
				} else if (num == 2) {
					System.out.println("출고된 상품의 번호를 입력해주세요.");
					System.out.print("번호> ");
					int no = Integer.parseInt(scn.nextLine());
					TeaVO tvm = dao.searchn(no);

					if (tvm == null) {
						System.out.println("조회된 정보가 없습니다.");
					} else {
						System.out.print("수량> ");
						int minus = Integer.parseInt(scn.nextLine());
					}
				}
				// 재고 관리
			} else if (select == 5) {

				// 종료
			} else if (select == 6) {
				System.out.println("상품 관리 프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
