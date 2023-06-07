package com.yedam.classes;

// 정수들을 담기 위한 배열 생성(date : int[] => 필드)
// 전체 정보를 출력하기 위한 기능, 합계를 출력하기 위한 기능, 최대값을 알아보는 기능을 메소드로 구현
public class KorScore {
	// 메소드가 아닌 정보들을 담기 위한건 전부 필드
	// 인스턴스 필드(인스턴스가 만들어져야 사용할 수 있음)
	int[] kor = new int[] { 100, 80, 70 };

	// 생성자..를 따로 정의하지 않으면 컴파일러가 (비어있는)기본 생성자를 알아서 만들어줌. => KorScore() {}
	// 비어있는 공간에 인스턴스를 하나 만드는?거?
//	KorScore(int[] scores) {
//		kor = scores;
//	}

	// 인스턴스 메소드(기능) => static이 붙어있지 않은 메소드
	public void print() {
		for (int score : kor) {
			System.out.println(score);
		}
	}

	public void total() {
		int sum = 0;
		for (int score : kor) {
			sum += score;
		}
		System.out.println(sum);
	}

	public void max() {
		int max = 0;
		for (int score : kor) {
			if (max < score) {
				max = score;
			}
		}
		System.out.println(max);
	}
}
