package com.yedam.control;

public class ControlEx3 {

	public static void main(String[] args) {
		int month = 5;
		System.out.printf("%9s=== %d월 ===\n", "", month);
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("============================");
		
		for(int i = 0; i < getFirstDate(month); i++) {
			System.out.printf("%3s ","");}
		for (int day = 1; day <= getLastDate(month); day++) {
			System.out.printf("%3d ", day);
			if ((getFirstDate(month)+day) % 7 == 0)
				System.out.println();
		}
	}
	public static void dal() {
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("============================");
		
		System.out.printf("%3s ", "");
		for (int day = 1; day <= 31; day++) {
			System.out.printf("%3d ", day);
			if (day % 7 == 6)
				System.out.println();
		}
		System.out.println("\n");
		System.out.println(days);
		System.out.println("============================");
		System.out.printf("%15s ", "");
		for (int day = 1; day <= 30; day++) {
			System.out.printf("%3d ", day);
			if (day % 7 == 3)
				System.out.println();
		}
	}

	public static void method1() {
		// 반복문... for, while, do while
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				System.out.printf("i의 값은 %d \n", i);

		}
	}

	public static void method2() {
//		for (int num2 = 2; num2 <= 9; num2++) {
//			int num1 = num2;
//			System.out.printf("\n==구구단 %d 단입니다.==", num1);
//			for (int num = 1; num <= 9; num++) {
//				System.out.printf("%d * %d = %d , ", num1, num, num * num1);
//			}
//		}
		for (int num = 1; num <= 9; num++) {
			for (int num2 = 2; num2 <= 5; num2++) {
				int num1 = num2;
				System.out.printf("%2d * %2d = %2d", num1, num, num1 * num);
			}
			System.out.println();
		}
	}
	
	//4~6월달 달력...switch case구문
	public static int getFirstDate(int month) {
		int fday = 1;
		switch(month) {
		case 4:
			fday = 6;
			break;
		case 5:
			fday = 1;
			break;
		case 6:
			fday = 4;
			break;
		}return fday;
	}
	//4~6월달 달력 switch case 구문
	public static int getLastDate(int month) {
		int lday = 0;
		switch(month) {
		case 4:
			lday = 30;
			break;
		case 5:
			lday = 31;
			break;
		case 6:
			lday = 30;
			break;
		}
		return lday;
	}
	
	
	
}
