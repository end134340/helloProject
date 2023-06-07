package com.yedam.emp;

public class Employee {
	private int employeeId; // 사원번호
	private String firstName;
	private String name;
	private int departementId; // 부서번호: 10(인사), 20(개발), 30(영업(기본값))
	private String departmentName;
	private int salary;
	private String email;

	// 생성자
	Employee() {
	};

//	Employee(int empId, String name, int deptId, int salary){ //용도가 달라도 타입의 나열이 같으면 생성자를 만들 수 없음	
//	}

	// 정수, 문자열, 정수, 정수
	Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departementId = departmentId;
		if (departmentId == 10) {
			departmentName = "인사";
		} else if (departmentId == 20) {
			departmentName = "개발";
		} else {
			departmentName = "영업";
		}
	}

	Employee(int employeeId, String name) {
		this(employeeId, name, 0, 30); // 사원 번호와 이름만 있으면 급여의 초기값을 0으로 하고, 부서 번호를 30으로 하겠다는 의미.
	}

	Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30); // 매개값이 3개가 들어오면 사원번호, 이름, 급여를 설정하고 부서 번호를 30으로 하겠다는의미
	}

	// getter, setter
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartementId() {
		return departementId;
	}

	public void setDepartementId(int departementId) {
		this.departementId = departementId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
