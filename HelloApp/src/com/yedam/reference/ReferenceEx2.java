package com.yedam.reference;

public class ReferenceEx2 {

	public static void main(String[] args) {
		// 배열.

		int[] intAry = { 30, 40, 50 };
		double[] dblAry = { 30, 40, 50 }; // = 30.0, 40.0, 50.0
		String[] strAry = { "H", "E", "L", "L", "O" };
		int[] intAry2 = new int[3]; // 정수형 값을 3개 담을 수 있는 배열. 초기값으로는 0,0,0이 들어있음.

		//intAry[3] = 33; //배열의 크기는 한번 정해지면 변하지 않기 때문에... 코드상에서는 문제가 없어보이지만 실행하면 오류가 뜸.....
		
		System.out.println(intAry2[0]);
		intAry2[0] = 33;
		System.out.println(intAry2[0]);

		int sum = intAry[0] + intAry[1] + intAry[2];
		sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += intAry[i];
		}
		//확장 for.
		for(String str : strAry) { //strAry에 담긴 갯수만큼 반복하겠다.........고?하는걸지도?
			System.out.println(str);
		}
		System.out.println("sum: "+sum);
		double sum1 = dblAry[0] + dblAry[1] + dblAry[2];
		System.out.println(sum1);
	}

}
