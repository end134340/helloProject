package com.yedam.classes;

public class Calculator {
	// 인스턴스마다 동일한 값을 가지게만들기... 계산기가 가지고 있는 고유한 값
	static final double PI = 3.14; // 값을 할당하고 나면 값을 바꾸지 못하도록 함... 상수?를 선언할때는 (final이라는 키워드와 함께) 대문자를사용

	// 연산을 하는 계산기 만들기...
	// static(정적)메소드...
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("더한 결과: " + result);
	}

	public static void minus(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("뺀 결과: " + result);
	}

	public static void getArea(int radius) {
		double result = PI * radius * radius;
		System.out.println("원의 넓이: " + result);
	}
}
