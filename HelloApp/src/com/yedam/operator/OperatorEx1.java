package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {
	// 메소드: 함수인데 객체(object)에 소속되어 있는 함수를 메소드라고 함.
	public static void main(String[] args) {
		/*
		 * 사용자의 값을 num1, num2값을 입력받도록.
		 * num1~2사이의 값의 합계를 구하는 프로그램 작성.
		 */
				
		/*Scanner scn = new Scanner(System.in); // 사용자가 입력하는 시점에서 입력하는 값을 가져와서 반환?해줌...
		System.out.println("숫자를 입력하세요");
		int result = 0;
		try {
			result = scn.nextInt(); // nextInt라는 함수를 실행하시오... 라는 메소드
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요");
		}
		System.out.println("입력값은 " + result + "입니다.");

		String str = null; // String 문자열이면 null이나 ""로 비어있는 초기값을 줄 수 있다.
		// var, let => int, long
		// for(let i=0; i<3; i++){} 자바스크립트의 경우
		// for(int i=0; i<3 i++){} 자바의 경우
		try {
			str = scn.nextLine(); // nextLine = 사용자가 입력하는 값을 문자 타입으로 반환해주겠음
		} catch (Exception e) {
			System.out.println("문자를 입력하세요.");
		}
		System.out.println("입력값은 " + str + "입니다.");
		*/
		//scn.close(); // 사용했던 뭐지 뭘 close해서 java 가상머신에 반환해줘야한다고함... resource 환원.
		
		Scanner mun1 = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num1;
		int num2;
		int result = 0;
		try {
			num1 = mun1.nextInt();
			num2 = mun1.nextInt();

			for (int i = num1; i <= num2; i++) {
				if(i%2==0) {
					result += i;
				}else{
					result += 0;
				}
			}
			System.out.println("결과는 " + result + "입니다.");
		} catch (Exception e) {
		}
		mun1.close();
	}
}
