package com.yedam.reference;

class Student {
	String name;
	int age;
}

public class ReferenceEx1 {

	public static void main(String[] args) {
		int age = 25;
		double price = 100.5;

		int age1 = age;
		age = 30;
		//int age2 = null; 초기값으로 null이 들어가지못함.
		//System.out.println("age: " + age + ", age1: " + age1);

		String name = new String("홍길동");
		String name1 = new String("김길동");
		name1 = name;
		// System.out.println("name: " + name + ", name1: " + name1);
		String hobby = "독서";

		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;

		Student s2 = s1; //참조값이 바뀌면 참조하고 있는 값도 바뀐다,,,는 것 같음...
		s1.name = "김길동";
		s1.age = 22;
		s1 = null;
		
		String s3 = null;//참조타입의 초기값으로는 null을 사용가능하다. (기본타입 int의 경우에는 초기값으로 null값을 담는게 불가능함.)		

		System.out.println(s1.name + ", " + s2.name);
	}

}
