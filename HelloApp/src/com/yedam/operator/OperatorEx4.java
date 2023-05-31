package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 기본 입력
		// q(113)를 종료의 의미로 사용
		while (true) {
			System.out.println("값을 입력해주세요.");
			try {
				int result = System.in.read();
				// System.out.println(result);
				System.in.read();
				System.in.read(); // 엔터의 값인 13값과 10을 걸러내기 위해 System.in.read();를 두번 실행함
				if (result == 113) {
					break;
				} else if (result >= 48 && result <= 57) {
					System.out.println("숫자입니다.");
				} else if (result >= 65 && result <= 90) {
					System.out.println("대문자입니다.");
				} else if (result >= 97 && result <= 122) {
					System.out.println("소문자입니다.");
				} else {
					System.out.println("지정된 범위가 아닙니다.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("끝");

	}
}