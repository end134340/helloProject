package com.yedam.emp;

import java.util.Scanner;

// EmpArray(배열) EmpArrayList(ArrayList)
public abstract class EmpList {

	Scanner scn = new Scanner(System.in);

	abstract void init(); // 저장 영역 초기화. 배열 = new Employee[10] / ArrayList = new ArrayList();

	abstract void input(); // 사원 정보 입력

	abstract String search(int employeeId);

	abstract void print();// 사원 목록 출력

}
