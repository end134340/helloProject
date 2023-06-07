package com.yedam.classes;

//실행이 아니라 기능을 담고 있는 라이브러리 클래스
//Object상속
public class Department {
	// 필드
	private int departmentId; // 부서번호
	private String departmentName; // 부서명
	private int managerId; // 부서 장

	// 생성자
	// 기본생성자(선언만함)
	Department() {

	}

	// 부서번호 초기화
	Department(int departmentId) {
		this.departmentId = departmentId;
	}

	// 부서번호 부서명 초기화
	Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	// 부서번호 부서명 부서장 초기화
	Department(int departmentId, String departmentName, int managerId) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}

	// 메소드
	void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	int getDepartmentId() {
		return departmentId;
	}

	String getDepartmentName() {
		return departmentName;
	}

	int getManagerId() {
		return managerId;
	}

	// 부모 클래스의 기능 상속
	@Override
	public String toString() { // 문자열타입을 반환
//		return super.toString(); // super = 부모 클래스.. object가 가진 toString()이라는 메소드 실행
		return "부서 번호: " + departmentId + " | 부서명: " + departmentName + " | 부서장: " + managerId; // (자식이) 재정의
	}

}
