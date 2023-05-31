package com.yedam.reference;

public class ReferenceEx3 {

	public static void main(String[] args) {
		// 학생 3명의 점수 (89.5, 78.9, 90.4)를 합하고 평균을 구해보고싶다.

		double[] stuscr = { 89.5, 78.9, 90.4 };
		stuscr = new double[] {55.5, 66.6, 77.7, 88.8}; //배열에 새 값을 넣기 위해서는 new로 새로 선언해줘야하는........거각ㅌ다
		double MaxVal = 0;
		//최소점수도 반영...?
		double sum = 0;
		for (double banbok : stuscr) {
			sum += banbok;
			if(banbok>MaxVal) {
				MaxVal = banbok;
			}
		}
		double avg = sum / 3;
		System.out.printf("점수의 합은 %.2f이고, 평균은 %.2f이다.\n", sum, avg);
		System.out.printf("최대값 = %.1f", MaxVal);
	}

}
