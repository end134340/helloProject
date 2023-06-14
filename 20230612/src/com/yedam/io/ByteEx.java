package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteEx {
	public static void main(String[] args) {
		// 입력(InputStream) 후 출력(OutputStream).
		try {
			FileInputStream fis = new FileInputStream("c:/temp/VSCode.exe");
			FileOutputStream fos = new FileOutputStream("c:/temp/copy.exe");

			byte[] bytes = new byte[100]; // 반환되는 값은 byte의 크기이므로 한번에 100byte씩 읽어들이겠다는 뜻.
			while (true) {
				int readInt = fis.read(bytes);
				System.out.println(readInt);
				if (readInt == -1) {
					break;
				}
				fos.write(bytes);
			}
			fis.close();
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램이 종료되었습니다.");

	}// main

	public static void write1() {
		// 바이트 출력 스트림 (외부 파일에 저장하겠다는 의미)
		try {
			OutputStream os = new FileOutputStream("c:/temp/data1.dat"); // 외부 파일로 dat의 형태로 저장함
			byte a = 10;
			byte b = 20;
			os.write(a);
			os.write(b);
			os.flush(); // 캐시에 남아있는 정보를 출력 후 비우기
			os.close(); // 리소스 환원
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void read1() {
		try {
			InputStream is = new FileInputStream("c:/temp/data1.dat");
			while (true) {
				int readInt = is.read(); // 더이상 읽어올 값이 없으면 -1이라는 값 return
				if (readInt == -1) {
					break;
				}
				System.out.println(readInt);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}// class