package com.yedam.polymorphism;

public class HankookTire extends Tire {
	// 생성자 지정

//	HankookTire() { //부모의 생성자도 상속?받는데 Tire클래스에 기본 생성자를 만들지 않아서 오류가 남.
//		super(); 
//	}

	HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		setAccumulatedRotation(getAccumulatedRotation() + 1);
		if (getAccumulatedRotation() < getMaxRotation()) {
			System.out.println("한국 타이어: "
					+ (getMaxRotation() - getAccumulatedRotation() + "회 남았습니다." + "타이어의 위치: " + getLocation()));
			return true;
		} else {
			System.out.println("+++한국 타이어 펑크+++" + "타이어의 위치: " + getLocation());
			return false;
		}
	}
}
