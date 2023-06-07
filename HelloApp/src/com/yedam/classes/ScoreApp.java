package com.yedam.classes;

//실행 클래스: main
//라이브러리 클래스: KorScore
public class ScoreApp {
	public static void main(String[] args) {

		KorScore score = new KorScore(); // (클래스에 인스턴스를 통해 실체를 하나 만듦) (static이 붙지 않아서 인스턴스를 생성해야 다른걸?할수있음)
		System.out.println(score);
		// 메소드 호출
		score.print();
		score.total();
		score.max();

		KorScore score1 = new KorScore();
		System.out.println(score1);

		score1.kor = new int[] { 77, 88, 99 }; // 배열 인스턴스를 하나 만들겠다는 의미?
		score1.print();
		score1.total();
		score1.max();

		// 정적 메소드 활용(굳이 인스턴스를 안만들어도됨)
		// 인스턴스 메소드 호출
//		Calculator cal = new Calculator();
//		cal.sum(score1.kor[0], score1.kor[1]);
		// static메소드 호출
		Calculator.sum(score1.kor[0], score1.kor[1]); // 클래스이름.메소드(사용하려는값)
		Calculator.getArea(3);
	}
}
