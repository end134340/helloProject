package com.yedam.object;

public class Person {
	//클래스의 속성(어떤 정보를 담는곳)을 필드라고 함. (name, age …)
	private String name;
	private int age;

	//클래스 필드의 초기값을 지정하는 걸 생성자라고 함...
	//Person() 처럼 매개값이 없는 생성자를 기본 생성자라고 함. 정의하지 않으면 자바 컴파일러가 알아서 해줌
	
	Person(){ //필드에 초기값을 주고 싶으면 생성자를 호출하면됨
		name = "기본값";
		age = 10;
	}
	//생성자 호출시 매개변수를 이용해서 값을 채워주고 싶을때
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//클래스의 기능(function)을 메소드라고 함..
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void setAge(int age) {
		if (age < 0) {
			this.age = 10; // 의미 없는 값이 들어오면 초기값으로 10을 넣음
		} else {
			this.age = age;
		}
	}

	int getAge() {
		return this.age;
	}

	void showInfo() { //굳이 어떤 값을 리턴하지 않아도 된다는 void
		System.out.printf("이름은 %s이고, 나이는 %d입니다.\n", name, age);
	}
	
	void yearAfter() {
		System.out.printf("이름은 %s이고, 1년 후 나이는 %d입니다.\n", name, age+1);
	}
	void yearAfter2(int year) { //매개변수를 넣어주면 위의 예시처럼 숫자를 더하지 않고 매개변수(이 경우에는 숫자)를 활용해 바뀐 값을 출력해줌.
		System.out.printf("이름은 %s이고, %d년 후 나이는 %d입니다.\n", name, year, age+year);
	}
	
} // Person 클래스의 끝...
