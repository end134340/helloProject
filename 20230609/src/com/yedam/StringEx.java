package com.yedam;

public class StringEx {
	public static void main(String[] args) {

		// 파일명(sample)과 확장명(jpg)를 반환
		String str = "C:/temp/images/sample.jpg";
		int index = str.indexOf("sample");
		String file = str.substring(index);
		System.out.println(file);

		String[] strs = str.split(" "); // split()은 문자열을 배열에 넣어줌. ""안에 있는 걸로 나누어 넣음. " " 는 공백 단위 ","는 쉼표 단위
		for (String word : strs) {
			System.out.println(word);
		}

		// 2023년 기준으로 각 주민번호를 확인해 남/여/null반환
		check("260709-345678");
	}

	public static void check(String stg) {
		String gen = stg;
		gen = gen.replace("-", "").replace(" ", "");
		char c = gen.charAt(7);
		int year = Integer.parseInt(gen.substring(0, 2));
		if (year > 23 && c == '3') {
			System.out.println("잘못된 값이 입력되었습니다.");
		} else if (year > 23 && c == '4') {
			System.out.println("잘못된 값이 입력되었습니다.");
		} else if (gen.charAt(7) == '1' || gen.charAt(7) == '3') {
			System.out.println("입력한 주민번호의 인물은 남자입니다.");
		} else if (gen.charAt(7) == '2' || gen.charAt(7) == '4') {
			System.out.println("입력한 주민번호의 인물은 여자입니다.");
		}
	}
}