package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		// 1에서 100까지의 3의 배수의 합계 method1()
		// Math.random()를 2번 실행 => 두 수의 합이 5가 되면 주사위 중단. method2()
		// 4줄 별찍기............................................

		method1();
		method2();
		method3();
		method4();
	}

	public static void method1() { // void = return 되는 값이 없어도 됨...
		int thr = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				thr += i;
			}
		}
		System.out.println(thr);
	}

	public static void method2() {
		int five = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				five = i + j;
				switch (five) {
				case 5:
					System.out.printf("주사위의 결과는 %d, %d, 합은 %d입니다.", i, j, five);
				}
			}
			System.out.println();
		}

		int dice1 = (int) (Math.random() * (6 - 1 + 1)) + 1;
		int dice2 = (int) (Math.random() * (6 - 1 + 1)) + 1;
		five = 0;
		five = dice1 + dice2;
		if (five == 5) {
			System.out.printf("주사위의 결과는 %d, %d, 합은 %d입니다.", dice1, dice2, five);
		} else {

		}
	}

	public static void method3() {
		for (int i = 0; i < 5; i++) {
			String star = "";
			for (int j = 1; j <= i; j++) {
				star += "*";
			}
			System.out.println(star);
		}
	}

	public static void method4() {
		for (int i = 0; i <=5; i++) {
			String star = "";
			String out = "";
			for (int j = 5; j>i; j--) {
				out += " ";
				}
				for(int k = 1; k<=i; k++) {
					star += "*";
				}
				System.out.println(out+star);
			}
		}
}
