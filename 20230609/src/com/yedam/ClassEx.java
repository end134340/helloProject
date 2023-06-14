package com.yedam;

import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {
		Class cls = Member.class; // 클래스 정보를 받아오는 방법 1
		try {
			cls = Class.forName("com.yedam.Member"); // 클래스 정보 받아오는법 2
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Member m1 = new Member(); //
		cls = m1.getClass(); // 클래스 정보 받아오는법 3

		System.out.println(cls.getName());

		Method[] methods = cls.getDeclaredMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}

	}
}
