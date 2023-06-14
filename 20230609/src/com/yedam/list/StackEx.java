package com.yedam.list;

import java.util.Stack;

public class StackEx { // 후입선출(LIFO)
	public static void main(String[] args) {
		Stack<String> stacks = new Stack<>();
		stacks.push("사과");
		stacks.push("오렌지");
		stacks.push("배");

		System.out.println(stacks.peek()); // 스택에서 데이터를 제거하지 않음.

		while (!stacks.isEmpty()) { // 요소가 비어있는지 알려주는 메소드
			System.out.println(stacks.pop()); // 스택에서 데이터를 출력하고 제거함.
//			System.out.println(stacks.pop());
//			System.out.println(stacks.pop());
		}
	}
}
