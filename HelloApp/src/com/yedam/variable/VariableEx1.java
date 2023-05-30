package com.yedam.variable;

//클래스명은 대문자로 시작하는 관례가 있음.
//com.yedam.variable.VariableEx1;
public class VariableEx1 {
	public static void main(String[] args) {
		// 변수 :변하는 값을 저장. 컴퓨터 메모리의 저장공간에 값을 저장.
		int num1; // int는 음의 정수, 0, 양의 정수를 담을 수 있음.
		num1 = 100;
		num1 = -100;

		double num2 = -1.2; // double은 실수를 담을 수 있음.
		num2 = 12.3;
		num2 = 123; // 내부적으로 정수는 실수타입으로 형태가 변환(형변환)이 일어남. 123 -> 123.0으로 취급?

		double result = 0;
		result = (double) num1 + num2; // 같은 데이터 타입 끼리만 연산을 할 수 있음. result도 같은 타입이어야함.
										// 변수의 값을 담을 수 있는 범위 int < double
		System.out.println("결과: " + result);

		// 변수의 종류
		// 정수: byte(1byte), short(2byte), int(4bite), long(8byte)
		// 실수: float(4byte), double(8byte)
		// boolean: true / false
		// 객체(클래스): 문자형(String(크키가 정해지지않음)
		// byte: 8bit ->2*2*2*2*2*2*2*2 : -128~127까지의 범위를 담을 수 있음.
		System.out.println(Integer.MAX_VALUE); // -2147483648, 0, 2147483648 //int의 값
		byte b1 = 127;
		short s1 = 128;
		long l1 = 2147483648L; //정수의 기준이 int이기 때문에 214~를 int라고 이해하기 때문에 뒤에 L(long)이라고 명시해줘야함.
		// 기본 정수연산을 하는 기준은 int타입.
		long result1 = (long) b1 + (long) s1 + l1;
		
		b1++; //b1 = b1 + 1; 기존의 값에다 1을 더해 b1에 담아주겠다는 뜻......
		System.out.println("b1의 값: " + b1); //최대값 범위를 벗어난 값에 +1을 하면 최솟값으로 이동해버림...
	}
}
