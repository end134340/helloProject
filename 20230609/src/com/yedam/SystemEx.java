package com.yedam;

import java.util.Scanner;

public class SystemEx {
	public static void main(String[] args) {

		long stime = System.currentTimeMillis();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1. 출력 2. 종료");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("print");
			} else if (menu == 2) {
				// System.exit(0); // 반복문을 끝내는 게 아니라 프로그램을 강제 종료(아랫부분 코드가 실행되지 않음.)
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		long etime = System.currentTimeMillis();
		System.out.printf("실행 시간: %d\n", (etime - stime));
	}
}
