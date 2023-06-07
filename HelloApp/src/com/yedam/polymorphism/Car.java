package com.yedam.polymorphism;

public class Car {
	Tire frontLeft = new Tire("앞.왼쪽", 6);
	Tire frontRight = new Tire("앞.오른쪽", 2);
	Tire backLeft = new Tire("뒤.왼쪽", 3);
	Tire backRight = new Tire("뒤.오른쪽", 4);

	// 주행 메소드(타이어가 주행할때 점점 닳고 펑크가 나면 위치를 반환)
	int run() {
		System.out.println("자동차가 달립니다.");
		if (frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}// 클래스 끝
