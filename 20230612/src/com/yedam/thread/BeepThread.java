package com.yedam.thread;

import java.awt.Toolkit;

//Thread 클래스를 상속받은 하위 클래스 방식
public class BeepThread extends Thread {
	@Override
	public void run() {
//		super.run();
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
}
