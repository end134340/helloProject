package com.yedam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date today = new Date();

		System.out.println(today.getTime()); // 현재의 시간을 정수값으로 반환... 1970.1.1 00:00:00을 기준으로 함.
		// *24*60*60*1000

		long curr = 1686283310294L / (24 * 60 * 60 * 1000);
		System.out.println(today.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String result = sdf.format(today);
		System.out.println(result);
		result = "2022/01/01";
		try {
			Date resultDate = sdf.parse(result);
			System.out.println(resultDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		result = dateToStr(today, "yyyy/MM/dd");
		System.out.println(result);
	}

	public static String dateToStr(Date date, String Pattern) {
		// date 값을 넣으면 pattern의 형식으로 반환해주는 메소드
		SimpleDateFormat sdf = new SimpleDateFormat(Pattern);
		return null;
	}
}
