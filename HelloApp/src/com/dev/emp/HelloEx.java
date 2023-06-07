package com.dev.emp;

public class HelloEx {
	public static void main(String[] args) {

		for (String str : args) {
			System.out.println(str); // Run Configurations->Arguments에 String[]배열 args변수에 값을 넣으면 읽어올수있음
		}

		Hello hello = new Hello();
		// hello.name = "Hong"; // 프라이빗이기 때문에 이렇게해서는 못담음
		hello.age = 20; // default 접근제한(동일한 패키지 내에서는 접근이 가능함.(필드를 만들 때 따로 지시자(public, private)를 선언하지 않은
						// 경우))
		hello.height = 169.9;

		// World world = new World(); // 동일한 패키지 내이기 때문에 default로 선언된 지시자 클래스를 사용할 수 있음.

		System.out.println("프로그램이 종료되었습니다.");
	}
}
