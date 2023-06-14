package com.yedam.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {
		// c:/temp/student.txt 파일을 읽어 학생들의 평균을 구하고 최고점수의 학생 이름과 최고점수 출력.
		try {
//			method1();
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}// main

	public static void method1() throws IOException {
		Scanner scn = new Scanner(new File("c:/temp/student.txt"));
		String name = "";
		int sum = 0;
		int cnt = 0;
		int maxscr = 0;
		double avg = 0;
		while (true) {
			String values;

			try {
				values = scn.nextLine();
			} catch (NoSuchElementException e) {
				break;
			}

			String[] valAry = values.split(" ");
			sum += Integer.parseInt(valAry[2]);
			cnt++;

			if (maxscr < Integer.parseInt(valAry[2])) {
				maxscr = Integer.parseInt(valAry[2]);
				name = valAry[1];
			}
		}
		avg = (double) sum / cnt;
		System.out.printf("평균점수: %.2f\n", avg);
		System.out.printf("최고 점수: %d, 학생의 이름은 %s\n", maxscr, name);

	}

	public static void method2() throws IOException {
		InputStream is = new FileInputStream("c:/temp/student.txt");
		InputStreamReader isr = new InputStreamReader(is); // 바이트 기반의 스트림을 char기반으로 읽고 쓰기 위한 보조스트림
		char[] buf = new char[200];
		isr.read(buf); // read 입력스트림을 통해 buf 저장
		String name = "";
		int maxscr = 0, sum = 0;

		String str = new String(buf);
//		System.out.println(str);
		String[] strAry = str.split("\n");
		for (String student : strAry) {
			if (student != null) {
				String[] std = student.split(" ");
				System.out.printf("학생 번호: %s | 이름: %s | 점수: %s\n", std[0], std[1], std[2]);
			}
			if (maxscr < Integer.parseInt(strAry[2])) {
				maxscr = Integer.parseInt(strAry[2]);
				name = strAry[1];
			}
		}

		isr.close();
		is.close();

	}

}// class
