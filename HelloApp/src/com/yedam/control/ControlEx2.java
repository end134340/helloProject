package com.yedam.control;

public class ControlEx2 {
	public static void main(String[] args) {

		// 12월
		// 해당되는 월의 마지막 날짜값. (며칠까지 있는지.)
		System.out.printf("1월달의 마지막 날은 " + getLastDate(1) + "일 입니다.");
	}

	public static int getLastDate(int Month) {
		int lday = 0;
		switch(Month){
			case 2:
				lday = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lday = 30;
				break;
			default: 
				lday = 31;
		}return lday; //return해주는값이 없으면,,,,,,,,,,, 안돌아감
	}

	public static void method1() {
		/*
		 * int result = (int) (Math.random() * 3) + 1; switch (result) { case 1:
		 * System.out.println("가위"); break; case 2: System.out.println("바위"); break;
		 * case 3: System.out.println("보"); } System.out.println("End.");
		 */
		int result = (int) (Math.random() * 91) + 10;
		switch (result / 10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}

	}
}