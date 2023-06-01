package com.yedam.reference;

import java.util.Scanner;

//배열 하나에 학생의 이름과, 영어 수학 점수를 담고싶을때...
class Student {
	String name; // 이름을 담는 String 속성
	int engScore; // 점수를 담을 수 있는 int속성
	int mathScore;
}

public class ReferenceEx9 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.engScore = 90;
		s1.mathScore = 90;

		Student s2 = new Student();
		s2.name = "김길동";
		s2.engScore = 85;
		s2.mathScore = 75;

		Student s3 = new Student();
		s3.name = "박길동";
		s3.engScore = 75;
		s3.mathScore = 95;

		Student[] students = { s1, s2, s3 };
		Scanner scn = new Scanner(System.in);
		String sName = scn.nextLine();
		System.out.println("------------------");

		for (int i = 0; i < students.length; i++) {
			if (students[i].name.equals(sName)) {
				System.out.println(students[i].name);
				System.out.println(students[i].engScore);
				System.out.println(students[i].mathScore);
			}
		}
	}

}
