package com.yedam.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable { // 병렬방식.

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
}
