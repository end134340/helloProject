package com.yedam.polymorphism;

public class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("Taxi가 달립니다.");
	}
}
