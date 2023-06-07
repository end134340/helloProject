package com.yedam.insa;

public class EnumEx {
	public static void main(String[] args) {
		Student s1 = new Student("23-01", "홍길동", 80, Gender.MEN);
		Student s2 = new Student("23-02", "김길동", 83, Gender.MEN);
		Student s3 = new Student("23-03", "무지개", 80, Gender.WOMEN);
		Student s4 = new Student("23-04", "김미지", 83, Gender.WOMEN);

		Student[] students = { s1, s2, s3, s4 };

		for (int i = 0; i < students.length; i++) {
			if (students[i].getGender() == Gender.WOMEN) {
				System.out.printf("이름은 %s, 점수는 %d\n", students[i].getName(), students[i].getScore());
			}
		}
	}
}
