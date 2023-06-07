package com.yedam.insa;

import java.util.Scanner;

//사원 정보를 등록하기 위해 배열을 선언하고 등록/조회/출력을 정의하는 클래스
public class EmpList {

	// 싱글톤(인스턴스를 하나만 만들어 불필요한 메모리 사용을 줄임)
	private static EmpList instance = new EmpList();

	public static EmpList getInstance() { // 이 방식으로만 인스턴스를?생성가능.
		return instance;
	}
	// 싱글톤

	// 사원 정보를 저장하기 위한 공간(배열)선언
	Employee[] list;
	int empNum; // 사원 수. 필드에서 선언되어질때 (정수타입의?)초기값은 0
	Scanner scn = new Scanner(System.in);

	// 생성자: 필드의 값들을 초기화해주기 위해 만듦
	private EmpList() {
	} // 기본생성자

	private EmpList(Employee[] list) { // 배열에 담기는 사원 수를...정할때쓰는?
		this.list = list;
		this.empNum = list.length;
	}

	// 프로그램을? 초기화 하는 기능
	public void init() {
		System.out.print("사원수> ");
		int num = scn.nextInt();
		list = new Employee[num]; // 배열의 크기 지정
	}

	// 등록하는 기능
	public void input() {
		if (empNum >= list.length) { // empNum이 배열의 길이보다 커질경우 제한?
			System.out.println("입력이 초과되었습니다.");
			return;
		}

		System.out.printf("%d 사번> ", empNum);
		int no = scn.nextInt();
		System.out.print("이름> ");
		String name = scn.next(); // 엔터값도 읽어옴
		System.out.print("급여> ");
		int sal = scn.nextInt();
		list[empNum++] = new Employee(no, name, sal);
	}

	// 사번을 넣으면 조회
	public String search(int employeeId) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].getEmployeeId() == employeeId) {
				return list[i].getName();
			}
		}
		return "";
	}

	// 전체 출력
	public void print() {
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%5d | %10s | %7d \n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i].getSalary();
		}
		return sum;
	}
}
