package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3];
		Scanner scn = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1. 등록 2. 계좌번호 조회 3. 예금 4. 출금 5. 종료");
			System.out.println("============================================");
			System.out.printf("선택----->> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			Bank b1 = new Bank();
			//1. 등록
			if(selectNo == 1) {
				System.out.printf("계좌번호를 등록해주세요.");
				String actnum = scn.nextLine();
			b1.accountNo = actnum;
				System.out.printf("이름을 등록해주세요.");
				String oname = scn.nextLine();
			b1.owner = oname;
				System.out.printf("통장 잔고를 등록해주세요.");
				int money = Integer.parseInt(scn.nextLine());
			b1.balance = money;
				
			}
			//2. 조회
			else if(selectNo == 2) {
				System.out.println("조회할 계좌번호를 입력하세요.");
				for(int i = 0; i<accounts.length; i++) {
					
				}
			}
			//3. 예금
			else if(selectNo == 3) {
				
			}
			//4. 출금
			else if(selectNo == 4) {
				
			}
			//5. 종료
			else if(selectNo == 5) {
				run = false;
			}
			
			
		}
		System.out.println("--------------------------------------------");
		System.out.println("프로그램이 종료되었습니다.");

	}
}
