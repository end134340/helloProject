package com.yedam.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueEx {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		que.offer("홍길동");
		que.offer("박길동");
		que.offer("김길동");

		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}
