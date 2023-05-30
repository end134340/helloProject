package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//firstMethod();
		//secondMethod();
		System.out.println("두 수의 값을 입력해주세요.");
		int one = scn.nextInt();
		int two = scn.nextInt();
		thirdMethod(one,two);
		scn.close();
	}
	
	
	
		public static void firstMethod() {
			
			// Scanner 사용하여 2개의 입력값을 받기
			// n, n => n의 n제곱 값을 출력
			
			Scanner scn = new Scanner(System.in);
			int num1 = 0;
			int num2 = 0;
			int result = 1;
			try {
				System.out.println("숫자를 입력해주세요.");
				num1 = scn.nextInt();
				
				System.out.println("제곱을 입력하세요.");
				num2 = scn.nextInt();
				for(int i = 1; i<=num2; i++) {
					result = result*i;
				}
			} catch (Exception e) {
				System.out.println("올바른 값이 아닙니다.");
			}
			System.out.println("값은 " + result + "입니다.");
		}
		public static void secondMethod() {		
			//Scanner 활용해서 ""라는 값을 n만큼 반복하기.
			
			Scanner write = new Scanner(System.in);
			String mun = "";
			int ban = 0;
			try {
				System.out.println("문장을 입력해주세요.");
				mun = write.nextLine();
				System.out.println("반복할 횟수를 입력하세요.");
				ban = write.nextInt();
				for(int i=1; i<=ban; i++) {
					System.out.println(mun);
				}
			}catch (Exception e) {
				System.out.println("올바른 형식이 아닙니다..");
			}
			
		}
		public static void thirdMethod(int one, int two) {
			//2개의 수를 더하고 결과를 출력
			int sum = one+two;
			System.out.println("두 수의 합은 " + sum + " 입니다.");
		}
		
}
