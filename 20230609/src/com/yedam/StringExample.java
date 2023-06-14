package com.yedam;

import java.io.UnsupportedEncodingException;

public class StringExample {
	public static void main(String[] args) {
		// charAt(index) 특정 위치의 문자 리턴
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(3);
		System.out.println(charValue); // 인덱스 3번의 '프' 리턴

		// equals(Object anObject)
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		String strVar3 = "신민철";

		System.out.println(strVar1 == strVar2); // 다른방식으로 저장되어서 번지수가 달라서 이 방법으로는 문자열 비결 불가능?
		System.out.println(strVar2 == strVar3); // 같은 번지에 저장?됐나?
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar2.equals(strVar3));

		// byte[]
		byte[] bytes = "문자열".getBytes();
		// byte[] bytess = "문자열".getBytes(Charset charset);

		try {
			byte[] bytes1 = "문자열".getBytes("EUC-KR");
			byte[] bytes2 = "문자열".getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {

		}
		// String str = new String(byte[] bytes, String charsetName); //디코딩?

		// indexOf => 문자열이 시작되는 인덱스 리턴. 포함되어 있지 않으면 -1 리턴.
		String subject1 = "자바 프로그래밍";
		int index = subject1.indexOf("프로그래밍");
		System.out.println(index);

		// length() 문자열 길이(문자 수)리턴
		String subject2 = "자바 프로그래밍";
		int length = subject2.length();
		System.out.println(length);

		// replace() => 첫번째 매개값 문자열 찾아 두 번째 매개값 문자열로 대치하여 새로운 문자열 생성해 리턴
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);

		// subString() => 문자열 잘라내 추출
		String ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6); // 주어진 시작, 끝 인덱스 <사이의 문자 추출
		String secondNum = ssn.substring(7); // 주어진 인덱스부터 끝까지 추출

		System.out.println(firstNum);
		System.out.println(secondNum);

		// toLowerCase(), toUpperCase() => 알파벳 대,소문자 변경

		String original = "Java Programming";
		String lowerCase = original.toLowerCase(); // 소문자로 변환
		String upperCase = original.toUpperCase(); // 대문자로 변환

		System.out.println(lowerCase);
		System.out.println(upperCase);

		// trim() 앞 뒤 공백 잘라내기(중간 공백 제거x)
		String oldStr1 = "  자바 프로그래밍  ";
		String newStr1 = oldStr1.trim();

		System.out.println(newStr1);

	}//
}//
