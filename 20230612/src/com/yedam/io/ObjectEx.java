package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//사원 정보를 파일로 저장
//사원번호 | 이름 | 부서

class Emp implements Serializable {
	int empNO;
	String empName;
	String dept;

	Emp(int empNo, String empName, String dept) {
		this.empNO = empNo;
		this.empName = empName;
		this.dept = dept;
	}

}

public class ObjectEx {
	public static void main(String[] args) throws Exception {

		method2();

		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void method1() throws Exception {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(101, "홍길동", "인사"));
		list.add(new Emp(102, "김길동", "개발"));
		list.add(new Emp(103, "이길동", "총무"));

		FileOutputStream fos = new FileOutputStream("c:/temp/list.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(list);

		oos.close();
		fos.close();

	}

	public static void method2() throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/list.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		List<Emp> list = (List<Emp>) ois.readObject();
		for (Emp emp : list) {
			System.out.printf("사원번호: %d | 이름: %s | 부서: %s\n", emp.empNO, emp.empName, emp.dept);
		}
	}

}
