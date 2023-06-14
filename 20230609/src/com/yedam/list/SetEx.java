package com.yedam.list;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
//		set.add("Hello");
//		set.add("World");
//		set.add("Hello");
//
//		Iterator<String> iter = set.iterator(); // index로 관리되지 않기 때문에 set에 iterator()라는 반복해주는 메소드가 있음.
//		while (iter.hasNext()) {
//			String str = iter.next();
//			System.out.println(str);
//		}
//
//		for (String str : set) {
//			System.out.println(str);
//		}
//
//		// 중복된 값 제거
//		Set<Integer> iSet = new HashSet<>();
//		iSet.add(100);
//		iSet.add(200);
//		iSet.add(100);
//		System.out.println("------------");
//		for (Integer str : iSet) {
//			System.out.println(str);
//		}

		// 정수를 담을 수 있는 배열을 선언하고, 1~10까지의 임의의 값을 생성해주는 Math.random()기능으로 5개를 저장.
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			int random = (int) (Math.random() * (10 - 1 + 1)) + 1;
			if (numbers[i] == random) {
				i--;
			} else {
				numbers[i] = random;
				System.out.println(numbers[i]);
			}
		}

		HashSet<Integer> iSet = new HashSet<Integer>();
		while (iSet.size() < 5) {
			iSet.add((int) (Math.random() * 10 + 1));
		}
		int idx = 0;
		Iterator<Integer> itr = iSet.iterator();
		while (itr.hasNext()) {
			numbers[idx++] = itr.next();
		}
		System.out.println("==numbers==");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}//
}
