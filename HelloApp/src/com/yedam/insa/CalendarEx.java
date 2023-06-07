package com.yedam.insa;

import java.util.Calendar;

//set()
//cal()

public class CalendarEx {

	static int year;
	static int month;

	static void set(int year, int month) {
		CalendarEx.year = year;
		CalendarEx.month = month - 1;
	}

	static void cal() {
		Calendar cal = Calendar.getInstance();
		cal.set(CalendarEx.year, CalendarEx.month, 1);

		int firstday = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastday = cal.getActualMaximum(Calendar.DATE);

		String title = "      <<= " + year + "년" + month + "월 =>>";
		String days = "Sun Mon Tue Wed Thr Fri Sat";

		System.out.println(title);
		System.out.println(days);
		System.out.println("============================");

		for (int i = 0; i < firstday; i++) {
			System.out.printf("%3s ", "");
		}

		for (int day = 1; day <= lastday; day++) {
			System.out.printf("%3d ", day);
			if ((firstday + day) % 7 == 0) {
				System.out.println();
			}
		}
	}

}
