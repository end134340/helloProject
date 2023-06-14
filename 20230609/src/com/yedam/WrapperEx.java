package com.yedam;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		int n1 = i1; // 객체가 기본 데이터 타입으로 변경되는 것을 언박싱이라고 함
		i1 = 100; // 기본 데이터 타입에서 객체로 변하는 걸 박싱이라고?함

		n1 = 50;
		Integer result = i1 + n1;

		n1 = Integer.parseInt("100");
		byte b1 = Byte.parseByte("10");

		System.out.println(result);

		System.out.println(b1);

		Byte b2 = Byte.valueOf("10");
		b2.byteValue(); // 객체에서 기본으로 전환

		Short s1 = Short.valueOf("100");
		short s2 = s1.shortValue();

		System.out.println(b2);

		// 포장 객체의 값 비교
		Integer w1 = Integer.valueOf("180");
		Integer w2 = Integer.valueOf("180");

		// 객체의 값을 비교하지 말고 기본 타입으로 변경해서 비교
		System.out.println(w1 == w2); // 값이 -128~127사이의 값인 경우 비교 연산자를 사용해 true값을 얻어낼 수 있지만 그 값을 초과한 경우에는 equals()를 사용해
										// 비교해야 제대로된 값을 얻을 수 있다.
		System.out.println(w1.equals(w2));
	}
}
