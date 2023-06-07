package com.yedam.abstracts;

public class AnimalExe {

	public static void main(String[] args) {

		// 추상 클래스는 실체 클래스를 만들 수 없음(ex => new 키워드 붙여 인스턴스 할당
		Animal animal = null;

		animal = new Bird();
		animal.sound();
		animal.breath();

		Bird bird = new Bird();
		bird.breath();
		bird.sound();

		animal = new Cat();
		animal.breath();
		animal.sound();
	}

}
