package com.yedam.insa;

public class Student {
	private String stdNo;
	private String name;
	private int score;
	// private String gender; //성별 구분
	private Gender gender;

	public Student(String stdNo, String name, int score, Gender gender) {
		super();
		this.stdNo = stdNo;
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
