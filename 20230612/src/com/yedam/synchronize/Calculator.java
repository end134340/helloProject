package com.yedam.synchronize;

//user1 user2 작업스레드.
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드명: " + Thread.currentThread().getName() + ": " + memory); // Thread정보를 읽어오는 메소드
	}
}
