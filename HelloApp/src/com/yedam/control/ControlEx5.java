package com.yedam.control;

public class ControlEx5 {

	public static void main(String[] args) {
		// while, do while 반복문
		boolean isTrue = false;
		int sum = 0;
		int num = 0;
//		do {
//			//System.out.println("do print");
//			int result = (int) ((Math.random() * 6) + 1);
//			sum += result;
//			num++;
//			if (sum > 100)
//				isTrue = false;
//		} while (isTrue);

		//System.out.println("평균:" + (sum / num));

		isTrue = true;
		num = 0;
		while (isTrue) {
			System.out.println("print");
			if (num++ > 5) {
				isTrue = false;
			}
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				continue; //continue를 붙이면 구문의 아래부분은 실행되지 않고 반복문으로 되돌아감(아마?)
				//System.out.println("홀수입니다.");
			}
		}
		System.out.println("끝.");

	}

}
