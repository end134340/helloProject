package com.yedam;

public class ObjectEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.equals(obj2));

		String str1 = new String("Hello");
		String str2 = new String("World");
		System.out.println(str1.equals(str2));

		Member m1 = new Member();
		Member m2 = new Member();

		m1.setId("user1");
		m1.setPw("1111");
		m2.setId("user1");
		m2.setPw("1111");

		System.out.println(m1.equals(m2));

		// toString()
		System.out.println(m1.toString());
		System.out.println(m2); // toString()라는 메소드를 붙이지 않아도 뒤에 숨겨져?있기?때문에? 자동적으로 toString()메소드를 활용하여 정보를 보여줌.

		System.out.println(m2.getClass().getName()); // 클래스 정보를 가져올때 getClass로 가져옴. getName은...뭐라고?

	}// 메인끝
}// 클래스끝
