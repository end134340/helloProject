package com.yedam.abstracts;

//추상 클래스
public abstract class Animal {
	String kind;

	Animal() {
	}

	Animal(String kind) {
		this.kind = kind;
	}

	void breath() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상 메소드
	abstract void sound(); // 추상 메소드의 앞에는 abstract가 붙고, 선언 부분만 존재해 {}가 붙지 않음(기능 구현하는 부분이 붙지 않음.)
	// 자식 클래스에서 반드시 구현하는 코드가 필요함.
}
