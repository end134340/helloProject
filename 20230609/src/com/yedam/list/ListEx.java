package com.yedam.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<String> strList;
		strList = new ArrayList();

		strList.add("Hello");
//		strList.add(100);
		strList.add("World");

		strList.add(0, "Good"); // 위치 지정해서 ArrayList에 담기(index, 값)

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("----------");
		strList.set(0, "Nice"); // 변경
		strList.remove(0); // 제거
		strList.clear(); // 전체 삭제
		for (String word : strList) {
			System.out.println(word);
		}

		// LinkedList
//		long start = System.currentTimeMillis();
//		strList = new ArrayList<>();
//		for (int i = 0; i < 10000; i++) {
//			strList.add(0, "i" + i);
//		}
//		long end = System.currentTimeMillis();
//		System.out.printf("ArrayList 걸린 시간 %d\n", (end - start));
//
//		strList = new LinkedList<String>(); // 인터페이스의 변수에는 모든 구현 클래스를 담을 수 있음
//		start = System.currentTimeMillis();
//		strList = new ArrayList<>();
//		for (int i = 0; i < 10000; i++) {
//			strList.add(0, "i" + i);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("LinkedList 걸린 시간 %d", (end - start));
	}
}
