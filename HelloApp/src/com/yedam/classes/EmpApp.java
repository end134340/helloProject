package com.yedam.classes;

//사원 정보 저장 
//사원 클래스(Employee) - 부서(Department) 클래스
public class EmpApp {
	public static void main(String[] args) {
		// 생성자?로 바로 값넣기
		Department dept1 = new Department(10, "인사", 120);
		// 각각 값 넣기
		dept1.setDepartmentId(10);
		dept1.setDepartmentName("인사부서");
		dept1.setManagerId(120);

		Department dept2 = new Department(20, "기획");
		dept2.setManagerId(130);

		System.out.println(dept1.toString());
		System.out.println(dept2.toString());

		// 사원
		Employee emp1 = new Employee();
		emp1.setEmployeeId(200);
		emp1.setFirstName("길동");
		emp1.setLastName("홍");
		emp1.setDept(dept1);

		System.out.println("부서정보: " + emp1.getDept().getDepartmentName()); // dept가 가진 부서...?를 통해서.(emp1의)부서정보 확인

		Employee emp2 = new Employee(201, "민수", "김", dept2);

		Employee emp3 = new Employee(203, "이수", "김", new Department(30, "개발", 150));

	}
}
