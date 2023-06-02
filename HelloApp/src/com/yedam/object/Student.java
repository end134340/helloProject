package com.yedam.object;

public class Student {
	private String stuNum;
	private String stuName;
	private String stuGender;
	private int stuScr;

	public Student(String stuNum, String stuName, String stuGender, int stuScr) {
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.stuGender = stuGender;
		this.stuScr = stuScr;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	public int getStuScr() {
		return stuScr;
	}

	public void setStuScr(int stuScr) {
		this.stuScr = stuScr;
	}

	public void showInfo() {
		System.out.printf("> 학생 번호: %s | 이름: %s | 성별: %s | 점수: %d\n", stuNum, stuName, stuGender, stuScr);
	}
}
