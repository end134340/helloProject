package com.yedam.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		Map<HashMap<Integer, String>, Integer> map = new HashMap<>();

		Scanner scn = new Scanner(System.in);
		System.out.println("ex> 100 홍길동 1000");

		while (true) {
			String input = scn.nextLine();
			String[] inputs = input.split(" ");
			if (inputs[0].equals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (inputs.length != 3) {
				System.out.println("값을 정확하게 입력해 주십시오.");
				continue;
			}
			HashMap<Integer, String> key = new HashMap<>();
			key.put(Integer.parseInt(inputs[0]), inputs[1]);

			map.put(key, Integer.parseInt(inputs[2]));

		} // while

		System.out.println("-------------------------------------");
		Set<HashMap<Integer, String>> keys = map.keySet();
		Iterator<HashMap<Integer, String>> iter = keys.iterator();
		while (iter.hasNext()) {
			HashMap<Integer, String> key = iter.next();
			Integer val = map.get(key);
			Set<Entry<Integer, String>> entry = key.entrySet();
			for (Entry<Integer, String> ent : entry) {
				System.out.printf("사번: %d | 이름: %s | 급여: %d\n", ent.getKey(), ent.getValue(), val);
			}
		}

	}// main
}// class
