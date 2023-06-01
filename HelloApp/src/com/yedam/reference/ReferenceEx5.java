package com.yedam.reference;

public class ReferenceEx5 {

	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		int a = (int) (Math.random() * (100 - 1 + 1)) + 1;
		int b = (int) (Math.random() * (100 - 1 + 1)) + 1;
		int c = (int) (Math.random() * (100 - 1 + 1)) + 1;

		// 위의 수를 intAry라는 배열에 담을 때 제일 큰 수를 먼저 담고싶음.
		int maxvalue = 0;
		int minvalue = 0;
		int midvalue = 0;
		if (a > b) {
			if (a > c) {
				maxvalue = a;
				if (b > c) {
					midvalue = b;
					minvalue = c;
				}
			} else if (a < b) {
				if (b > c) {
					maxvalue = b;
					if (a > c) {
						midvalue = a;
						minvalue = c;
					}
				}
			} else if (a < c) {
				if (a < b) {
					minvalue = a;
					if (b < c) {
						midvalue = b;
						maxvalue = c;
					}
				}
			}
		}
		System.out.println(maxvalue + "," + midvalue + "," + minvalue);
		int[] intAry = { maxvalue, midvalue, minvalue };
		for (int banbok : intAry) {
			System.out.println(banbok);
		}

	}

}
