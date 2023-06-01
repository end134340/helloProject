package com.yedam.reference;

public class ReferenceEx7 {

	public static void main(String[] args) {
		// a(2), b(4), c반(3) 학생들의 키를 재고 배열에 담기

		double[][] heightAry = { 
				{ 169.5, 193.2 }, 
				{ 176.5, 164.3, 172.1, 178.3 }, 
				{ 175.4, 176.3, 173.7 }, 
				};
		System.out.println(heightAry[0].length);

		// 각 반 별 키의 평균 키 구하기.

		for (int i = 0; i < heightAry.length; i++) {
			double lgSum = 0;
			for (int j = 0; j < heightAry[i].length; j++) {
				lgSum += heightAry[i][j];
			}
			String fmt = "%d번째반의 평균키: %.1f \n";
			System.out.printf(fmt,(i+1), (lgSum/heightAry[i].length));
		}

	}// main

}
