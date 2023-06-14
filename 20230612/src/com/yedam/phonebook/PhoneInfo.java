package com.yedam.phonebook;

import java.io.Serializable;

import lombok.Data;

@Data // 편하게 getter setter 만들어주는거
public class PhoneInfo implements Serializable {
	private String name;
	private String phoneNumber;

	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
	}

	// 논리적 동일한 객체 처리(HashCode, equals)
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		PhoneInfo info = (PhoneInfo) obj;
		if (info.name.compareTo(this.name) == 0) { // 문자열 값을 리턴해주는데 같은 경우 0, 다를 경우 -1, 혹은 1
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return INPUT_SELECT.NORMAL + ", " + name + ", " + phoneNumber + "\n";
	}

}
