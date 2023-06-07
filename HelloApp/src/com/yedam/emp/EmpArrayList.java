package com.yedam.emp;

import java.util.ArrayList;

public class EmpArrayList extends EmpList {

	ArrayList employees;

	@Override
	void init() {
		employees = new ArrayList();
	}

	@Override
	void input() {
		System.out.printf("%d 사번> ", employees.size());
		int no = scn.nextInt();
		System.out.print("이름> ");
		String name = scn.next();
		System.out.print("급여> ");
		int salary = scn.nextInt();

		employees.add(new Employee(no, name, salary));
	}

	@Override
	String search(int employeeId) {
		for (int i = 0; i < employees.size(); i++) {
			Employee emp = (Employee) employees.get(i);
			if (emp.getEmployeeId() == employeeId) {
				return emp.getName();
			}
		}
		return null;
	}

	@Override
	void print() {
		for (int i = 0; i < employees.size(); i++) {
			System.out.printf("%5d %10s %7d\n", ((Employee) employees.get(i)).getEmployeeId(),
					((Employee) employees.get(i)).getName(), ((Employee) employees.get(i)).getSalary());
		}
	}

}
