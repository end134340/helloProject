package com.yedam.abstracts;

public class Cat extends Animal {

	@Override
	void breath() {
		System.out.println("고양이가 숨을 쉽니다.");
	}

	@Override
	void sound() {
		System.out.println("야옹냥웅앩");
	}
}
