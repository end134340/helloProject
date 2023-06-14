package com.yedam.phonebook;

public class PhoneUnivInfo extends PhoneInfo {
	private String major; // 전공
	private int year; // 학년정보

	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}

	@Override
	public String toString() {
		return INPUT_SELECT.UNIV + ", " + this.getName() + ", " + this.getPhoneNumber() + ", " + major + ", " + year
				+ "\n";
	}
}
