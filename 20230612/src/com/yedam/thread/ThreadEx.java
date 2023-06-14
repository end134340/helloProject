package com.yedam.thread;

import java.awt.Toolkit;

public class ThreadEx {
	public static void main(String[] args) {
		// 1. 멀티 스레드 - 병렬방식 (먼저 호출해주고 처리해야하?는듯)
//		Thread thread = new Thread(new BeepTask());
//		thread.start(); // 실행코드.

		// 2. 멀티 스레드 - Runnable 인터페이스의 익명 구현 객체 방식
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500); // Thread.sleep(); => (0.5)초동안 멈춤 상태를 가지도록 만듦.
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		});
		thread.start();

		// 3. 멀티 스레드 - Thread 클래스를 상속받은 하위 클래스 방식
		thread = new BeepThread();
		thread.start();

		// 화면에 내용을 출력하면서 소리를 출력하는 프로그램.(직렬 방식)
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(500); // Thread.sleep(); => (0.5)초동안 멈춤 상태를 가지도록 만듦.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 시스템에 소리 내기
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for (int i = 0; i < 5; i++) {
//			toolkit.beep();
//			try {
//				Thread.sleep(500); // Thread.sleep(); => (0.5)초동안 멈춤 상태를 가지도록 만듦.
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

	}// main
}
