package com.yedam.insa;

import java.util.Calendar;

//CalendarEx.java
//CalendarEx.set(int year, int month) 메소드 선언시 static...
//CalendarEx.cal() = > 달력을 그려주는 메소드. 메소드 선언시 static...

public class CalendarExe {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // 실행시점의 날짜정보를 가지고 옴.
		// cal.set(2023, 7, 5); // 날짜 지정. (년,월,일)...2023.08.05
		System.out.printf("%d년도\n", cal.get(1)); // 1: 년도 정보(상수값)
		System.out.printf("%d년도\n", cal.get(Calendar.YEAR));
		System.out.printf("%d월\n", cal.get(Calendar.MONTH) + 1);// 1월달은 0부터 시작.
		System.out.printf("%d일\n", cal.get(Calendar.DATE)); // 오늘 날짜
		System.out.printf("%d요일\n", cal.get(Calendar.DAY_OF_WEEK)); // 아마 요일을 숫자로 표현해주는거같음.
		System.out.printf("이번달의 말일 : %d\n", cal.getActualMaximum(Calendar.DATE));

		CalendarEx.set(2023, 6);
		CalendarEx.cal();

	}
}
