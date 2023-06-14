package com.yedam;

import java.util.Scanner;

public class TypingSpeedEx {
	public static void main(String[] args) {

		String origin = "There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain...";
		Scanner scn = new Scanner(System.in);
		String[] origins = origin.split(" ");

		System.out.println();
		String taja = scn.nextLine();
		long stime = System.currentTimeMillis();
		for (int i = 0; i < origins.length; i++) {
			if (origins[i] != null) {
				System.out.println(origins[i]);
				String neworg = origin.replace(taja, "");
				System.out.println(neworg);
				origins = neworg.split(" ");
				taja = scn.nextLine();
			} else if (origins[i] == null) {
				System.out.println("완료되었습니다.");
				long etime = System.currentTimeMillis();
				System.out.printf("%d", (etime - stime));
				break;
			}
		}

		// 문장 출력 > 입력 > 문장 출력> 입력……(문장이 다 제거가 될 때까지)
		// 완료 메세지: n분 n초
	}
}
