package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {

	public static void main(String[] args) {
		int[][] intAry = { new int[] { 10, 11 }, new int[] { 20, 21 }, new int[] { 30, 31 } }; // 2차원?배열?

		// intAry[0] = 20; //배열 안에 다른 배열이 있는데 정수를 넣으려고 하면 타입이 달라서 오류가 나옴
		intAry[0] = new int[] { 22, 23 };
		System.out.println(intAry[0][0]); // 배열[0]안의 배열[0]의 값

		// 학생 3명의 영어, 수학 점수
		int[][] stuAry = { new int[] { 80, 90 }, new int[] { 85, 95 }, new int[] { 70, 80 } };
		System.out.printf("홍길동의 영어점수 %d점, 수학 점수 %d점 \n", stuAry[0][0], stuAry[0][1]);
		// 학생들의 영어 점수, 수학점수의 합계 구하기
		int engSum = 0;
		int mathSum = 0;
		// engSum = stuAry[0][0] + stuAry[1][0] + stuAry[2][0];

		for (int i = 0; i < stuAry.length; i++) {
			engSum += stuAry[i][0];
		}
		System.out.println("영어 점수의 합계는 " + engSum);

		for (int i = 0; i < stuAry.length; i++) {
			mathSum += stuAry[i][1];
		}
		System.out.println("수학 점수의 합계는 " + mathSum);

		// 영어와 수학 점수의 합계...
		int totalSum = 0;
		for (int i = 0; i < stuAry.length; i++) {
			for (int j = 0; j < stuAry[i].length; j++) {
				totalSum += stuAry[i][j];
			}
		}
		System.out.printf("학생들의 점수의 합은 %d점\n", totalSum);
		Scanner scn = new Scanner(System.in);
		String searchName = scn.nextLine();

		String[] nameAry = { "홍길동", "김길동", "박길동" };
		for (int i = 0; i < stuAry.length; i++) {
			if (nameAry[i].equals(searchName)) {
				System.out.printf("%s의 영어점수는 %d점, 수학점수는 %d점\n", nameAry[i], stuAry[i][0], stuAry[i][1]);
				break;
			} else {
				System.out.println("이름이 없습니다.");
			}
		}
	} //
}
