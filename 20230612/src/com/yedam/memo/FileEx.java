package com.yedam.memo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileEx {
	public static void main(String[] args) {
		try {
//			FileOutputStream fos = new FileOutputStream("sampled.txt"); 
			// 경로를 지정하지 않으면 C:\Dev\workspace\20230612 프로젝트의
			// 제일 상위에 만들어짐.

//			FileOutputStream fos = new FileOutputStream("src/com/yedam/memo/sample.txt"); // memo패키지에 만들려면 이렇게 경로지정을해야함...

//			fos.write(10);
//			fos.close();
			// MemoApp.java 파일을 읽어서 화면에 출력

			InputStream is = new FileInputStream("src/com/yedam/memo/MemoApp.java");
			InputStreamReader isr = new InputStreamReader(is); // byte를 문자로 변환하는 보조스트림.
			BufferedReader br = new BufferedReader(isr);
			String str = "";

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			is.close();
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
