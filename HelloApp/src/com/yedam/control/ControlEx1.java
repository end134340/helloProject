package com.yedam.control;

public class ControlEx1 {

	public static void main(String[] args) {
		//0과 1사이의 임의의 수 생성.
		/*int result = (int) (Math.random() * 10); //0~9까지의 난수
		System.out.println(result);
		if (result %2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}*/
		
		//Math.random을 활용해 10~100까지의 임의의 수 만들기.
		//생성된 값이 100~90: A, ~80 B, ~70 C, 나머지는 D
		
		int record = (int) (Math.random() * (100-10+1)) + 10;
		
		if(record>=90) {
			System.out.printf("점수는 %d점\nA입니다.", record);
		}else if(record>=80) {
			System.out.printf("점수는 %d점\nB입니다.", record);
		}else if(record>=70) {
			System.out.printf("점수는 %d점\nC입니다.", record);
		}else{
			System.out.printf("점수는 %d점\nD입니다.", record);
		}
		
	}
	
}
