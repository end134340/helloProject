package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferEx {
	public static void main(String[] args) {
		try {
			bufferStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void bufferStream() throws IOException {
		// 읽고 쓰는 값들을 버퍼(보조스트림)에 연결해 성능(속도) 향상.
		FileInputStream fis = new FileInputStream("c:/temp/VSCode.exe");
		BufferedInputStream bis = new BufferedInputStream(fis); // 기본스트림의 변수를 보조스트림 생성자의 매개변수로 이용.(보조스트림 사용방법)

		FileOutputStream fos = new FileOutputStream("c:/temp/copy2.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int readBuf = 0;
		while ((readBuf = bis.read()) != -1) {
//			int readBuf = bis.read(); // bis.read()로 읽어들인 값을 readBuf에 저장하겠다는 뜻.
//			if (readBuf == -1) {
//				break;
//			}
			bos.write(readBuf);
		}
		bos.flush();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
}// 클래스의 끝