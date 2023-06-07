package com.yedam.polymorphism;

public class CarExe {

	public static void main(String[] args) {

		Car car = new Car();

		for (int i = 0; i <= 6; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞.왼쪽을 HankookTire로 교체.");
				car.frontLeft = new HankookTire("앞.왼쪽", 10);
				break;
			case 2:
				System.out.println("앞.오른쪽을 KumhoTire로 교체.");
				car.frontRight = new KumhoTire("앞.오른쪽", 11);
				break;
			case 3:
				System.out.println("뒤.왼쪽을 HankookTire로 교체.");
				car.backLeft = new HankookTire("뒤.왼쪽", 12);
				break;
			case 4:
				System.out.println("뒤.오른쪽을 KumhoTire로 교체.");
				car.backRight = new KumhoTire("뒤.오른쪽", 11);
				break;
			}
			System.out.println("-----------------------------------------");
		}
	}

}
