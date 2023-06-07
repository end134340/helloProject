package com.yedam.insa;

import java.util.Scanner;

//EmpListApp: main() 실행 클래스
//EmpList	: 사원 정보 등록, 조회, 출력하는 기능을 담고 있는 클래스
//Employee	: 데이터의 입출력을 위한 정보를 담고 있는 클래스.
public class EmpListApp {

	public static void main(String[] args) {
		// EmpList app = new EmpList(); 원래 사용하던 방식
		// 싱글톤(인스턴스를 하나만 만들어 불필요한 메모리 사용을 줄임. 메모리 주소?를 하나만 사용...)
		EmpList app = EmpList.getInstance();
		// EmpList app1 = EmpList.getInstance(); //이렇게 만들어진 app와 app1은 메모리 주소?가 동일.

		Scanner scn = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1. 사원수 | 2. 사원 등록 | 3. 사원 목록 | 4. 검색 | 5. 급여 합계 | 6. 종료");
			System.out.println("==============================================================");
			System.out.print("선택> ");

			selectNo = scn.nextInt();
			System.out.println("--------------------------------------------------------------");

			if (selectNo == 1) { // 초기화?
				app.init();
				//
			} else if (selectNo == 2) {
				app.input();
				//
			} else if (selectNo == 3) {
				app.print();
				//
			} else if (selectNo == 4) {
				System.out.println("조회하실 사원 번호를 입력하세요.");
				int no = scn.nextInt();
				String name = app.search(no);
				System.out.println("이름은 " + name);
				//
			} else if (selectNo == 5) {
				int sum = app.sum();
				System.out.println("급여 합계: " + sum);
				//
			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("--------------------------------------------------------------");
				run = false;
				break;
			}
		} // while 끝
		System.out.println("프로그램이 종료되었습니다.");
		scn.close();
		System.out.println("==============================================================");
	}
}
