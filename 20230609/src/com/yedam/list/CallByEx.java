package com.yedam.list;

class Emp {
	int id;
	String name;
}

public class CallByEx {
	public static void main(String[] args) {
		// value => value에 의한 호출

		int a = 10;
		meth1(a);
		System.out.println(a); // a가 참조되어지는 값이 아니라 실제 값이 들어있기 때문에 원래의 값 유지

		// reference => 참조에 의한 호출(주소값을 참조하기 때문에 직접 값을 바꿔서 영향을 받음)
		Emp emp = new Emp();
		emp.name = "홍길동";
		meth2(emp);
		System.out.println(emp.name);

		String b = "Hello"; // 문자열String 클래스나 Wrapper는 객체이지만 메소드에서 호출될 때에는 참조가 아니라 Value로 취급받음.(값이 변경되지 않음.)
		meth3(b);
		System.out.println(b);

	}// 메인 끝

	public static void meth1(int a) {
		a = a * a;
	}

	public static void meth2(Emp e) {
		e.name = "김길동";
	}

	public static void meth3(String str) {
		str = "world";
	}
}
