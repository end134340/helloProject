package com.yedam.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("user1", 96);
		map.put("user2", 88);
		map.put("user3", 92);

		String name = ""; // 최고 점수를 받은 사람의 이름
		int maxScore = 0; // 최고 점수 저장.
		int totalScore = 0; // 점수 합계 저장

		// EntrySet으로 키와 값을 동시에 가져오는 방식.
		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entry.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> ent = itr.next();
			Integer value = ent.getValue();
			String key = ent.getKey();
			if (value > maxScore) {
				maxScore = value;
				name = key;
			}
			totalScore += value;
		}
		// Set으로 키와 값을 따로 가져오는 방식.
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			if (val > maxScore) {
				maxScore = val;
				name = key;
			}
		}

		System.out.println("점수 합계: " + totalScore);
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 사람: " + name);
	}
}
