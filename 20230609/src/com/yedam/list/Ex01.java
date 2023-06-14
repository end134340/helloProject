package com.yedam.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
	int studentNum;
	String name;

	Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
//			return super.hashCode();
		return this.studentNum;
	}

	@SuppressWarnings("unused")
	private boolean eqauls(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		Student students = (Student) obj;
		if (this.studentNum == students.studentNum) {
			return true;
		}
		return false;
	}

}

public class Ex01 {
	public static void main(String[] args) {
		// 학생 번호는 고유한 값으로 중복될 수 없음.
		Set<Student> students = new HashSet<>();

		students.add(new Student(1, "홍길동"));
		students.add(new Student(2, "김길동"));
		students.add(new Student(1, "박길동"));

		Iterator<Student> iter = students.iterator();
		while (iter.hasNext()) {
			Student result = iter.next();
			System.out.printf("%d: %s\n", result.studentNum, result.name);
		}

	}//
}
