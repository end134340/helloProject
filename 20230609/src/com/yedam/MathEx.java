package com.yedam;

public class MathEx {
	public static void main(String[] args) {
		Math.random(); // 0~1 사이의 임의의 값 생성.

		for (int i = 0; i <= 5; i++) {
			System.out.println(Math.random());
		}

		System.out.println(Math.round(3.5)); // 반올림
		System.out.println(Math.ceil(3.2)); // 올림값?
		System.out.println(Math.floor(3.7)); // 버림값
		System.out.println(Math.max(10, 20)); // 둘 중 큰 값
		System.out.println(Math.min(10, 20)); // 둘 중 작은 값

		System.out.println(Math.ceil(-2.3)); // -값은 숫자가 작은 쪽이 더 크기 때문에 올림하면 -2
		System.out.println(Math.floor(-2.3)); // -값은 숫자가 작은 쪽이 더 크기 때문에 버림하면 -3

		System.out.println(Math.rint(-2.3)); // 가까운 정수의 값?쪽으로? 채택하겠다는 뜼
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
