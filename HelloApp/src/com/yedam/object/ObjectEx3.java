package com.yedam.object;

public class ObjectEx3 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);//생성자에 기본값을.....매개변수로 주고싶을때?
//		p1.name = "홍길동";
		//p1.setName("홍길동");
//		p1.age = 20;
//		p1.age = -20;
		//p1.setAge(20);
		System.out.println(p1.getName() + ", " + p1.getAge());
		
		p1.showInfo();
		p1.yearAfter();
		p1.yearAfter2(3);
	}
}
