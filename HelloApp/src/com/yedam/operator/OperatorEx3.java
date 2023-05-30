package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx3 {

	public static void main(String[] args) {

		// 변수 balance 선언...
		// balance가 0~100,000 범위 내에서만 추가 혹은 감소되도록 하고싶음. -값도 안됨...
		// 입력값을 판단 (만약 1이라는 값이 들어오면 추가하고, 2라는 값이 들어오면 빼고,
		// 3이라는 값이 들어오면 콘솔을 출력, 4라는 값이 들어오면 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;

		while (true) {
			System.out.println("1.추가 2.차감 3.balance 출력 4.종료");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("추가할 값을 입력하세요.");
				int plus = scn.nextInt();
				
				if(balance+plus > 100000) {
					//System.out.println("더이상 추가할 수 없습니다.");
					System.out.printf("현재 balance값은 %d입니다. %d는 추가할 수 없습니다.\n", balance, plus);
				} else {
					balance += plus;
				}
			} else if (menu == 2) {
				System.out.println("감소할 값을 입력하세요.");
				int minus = scn.nextInt();
				if(balance-minus < 0) {
					//System.out.println("더이상 감소할 수 없습니다.");
					System.out.printf("현재 balance값은 %d입니다. %d만큼 감소할 수 없습니다.\n", balance, minus);
				} else {					
					balance -= minus;
				}
			} else if (menu == 3) {
				System.out.printf("현재 값은 %d 입니다.\n", balance);
			} else if (menu == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("메뉴에 없는 값입니다.");
				break;
			}
		}
		System.out.println("end of program.");
	}

	public static void method1() {
		// 반복처리 while (조건을 만족할 동안은) {반복?}
		int num1 = 1;

//		while (num1 <= 10) {
//			System.out.println(num1++);
//		}

		boolean isOK = false;
		isOK = true;
		num1 = 1;
		while (isOK) {
			System.out.println(num1++);
			if (num1 >= 10)
				isOK = false;
		}
		Scanner scn = new Scanner(System.in);
		// quit 구문을 입력하면 반복종료.
		isOK = true;
		while (isOK) {
			System.out.println("문장을 입력하세요.");
			String str = scn.nextLine();

			if (str.equals("quit")) {
				// isOK = false; //break가 있으면 값을 false로 바꾸지 않아도 자동적으로 빠져나온다.
				break;
			}
			System.out.println("입력값은 " + str + " 입니다.");
		}

		System.out.println("end of program.");
		scn.close();

	}

}
