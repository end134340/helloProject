package com.yedam.polymorphism;

public class DriverExe {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		Driver driver = new Driver();
		// 부모 타입의 변수 유형에는 부모 자신도 가능하지만 자식 인스턴스도 할당이 가능하다.
		driver.drive(vehicle);
		driver.drive(bus); // bus와 taxi는 부모 클래스를 상속받는 자식이기 때문에 인스턴스를 할당받아 매개변수에 들어갈 수 있음.
		driver.drive(taxi);

	}// 메인 끝

}// 클래스 끝
