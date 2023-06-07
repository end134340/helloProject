package com.yedam.polymorphism;

public class KumhoTire extends Tire {

	KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		setAccumulatedRotation(getAccumulatedRotation() + 1);
		if (getAccumulatedRotation() < getMaxRotation()) {
			System.out.println("금호 타이어: "
					+ (getMaxRotation() - getAccumulatedRotation() + "회 남았습니다." + "타이어의 위치: " + getLocation()));
			return true;
		} else {
			System.out.println("+++금호 타이어 펑크+++" + "타이어의 위치: " + getLocation());
			return false;
		}
	}
}
