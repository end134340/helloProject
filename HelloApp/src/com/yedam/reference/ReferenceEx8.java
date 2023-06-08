package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {

	public static void main(String[] args) {
		// 학생의 점수를 입력하면 점수를 출력하고 최고 점수와 평균 점수를 알려주는 프로그램?

		Scanner scn = new Scanner(System.in);
		int studentNum = 0; // 학생수를 지정
		int[] scores = null; // scores = new int[3];
		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println(" 1. 학생 수 2. 점수 입력 3. 점수 리스트 4. 분석 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.printf(">선택 ");

			int selectNo = Integer.parseInt(scn.nextLine()); // parseInt라는 메소드가 받은 값을 숫자로 출력해준다
			if (selectNo == 1) {
				System.out.print("학생 수를 입력하세요. >>");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {// 배열의 크기만큼 학생의 점수
				if (scores == null) {
					System.out.println(">>>>>학생 수가 입력되지 않았습니다.");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]>\n", i);
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo == 3) {// 배열의 점수 출력
				if (scores == null) {
					System.out.println(">>>>>학생 수가 입력되지 않았습니다.");
					continue;
				} else if (scores == null) {
					System.out.println(">>>>>입력된 값이 없습니다.");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			} else if (selectNo == 4) {// 최고점과 평균 분석
				if (scores == null) {
					System.out.println(">>>>>학생 수가 입력되지 않았습니다.");
					continue;
				} else if (scores == null) {
					System.out.println(">>>>>입력된 값이 없습니다.");
					continue;
				}
				int Maxscr = scores[0];
				int Sum = 0;
				for (int i = 0; i < scores.length; i++) {
					Sum += scores[i];
					if (scores[i] > Maxscr) {
						Maxscr = scores[i];
					}
				}
				int Avg = (Sum / scores.length);
				System.out.printf("평균 점수: %d\n", Avg);
				System.out.printf("최고 점수: %d\n", Maxscr);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램이 끝났습니다.");

	}// main

}
