package com.yedam.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.yedam.Member;

public class MapEx {
	public static void main(String[] args) {
		// 키, 값을 지정해야함
		Map<String, Integer> map; // <키값의 타입, 값의 타입>
		map = new HashMap<>();

		map.put("홍길동", 90);
		map.put("김민기", 88);
		map.put("김이수", 85);
		map.put("홍길동", 95); // 중복된 값이 들어오면 기존에 있던 값은 새로 들어온 값으로 변환됨.

//		map.remove("홍길동");
		// 조회 메소드
		Integer result = map.get("홍길동"); // 키 값에 해당되는 value 반환
		System.out.println(result);

		Set<String> keys = map.keySet(); // Key값을 Set컬렉션에 담아 반환해줌.
		// KeySet 확인
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer val = map.get(key);
			System.out.printf("키 값은 : %s, Value는: %d 입니다.\n", key, val);
		}

		// key와 value를 모두 가져오는
		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> iter = entry.iterator(); // 반복자
		while (iter.hasNext()) {// 가져올게있는지 hasNext로 체크
			Entry<String, Integer> ent = iter.next();
			String key = ent.getKey(); // 키를 반환해주는 메소드
			Integer val = ent.getValue(); // value를 반환해주는 메소드
			System.out.printf("키 값: %s, 값: %d\n", key, val);
		}

		// key: Member, val: Integer
		Map<Member, Integer> members = new HashMap<>();
		members.put(new Member("user1", "1111"), 100);
		members.put(new Member("user2", "2222"), 120);
		members.put(new Member("user1", "2222"), 140);
		System.out.println(members.size());

		Integer point = members.get(new Member("user1", "1111"));
		System.out.println(point);

		// containsKey, containsValue 동일한 값이 있는지? 알아보는 메소드?
		Map<String, String> map2 = new HashMap<>();
		map2.put("spring", "11");
		map2.put("summer", "123");
		map2.put("fall", "1234");

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = scn.nextLine();
			System.out.print("비밀번호: ");
			String pw = scn.nextLine();
			System.out.println();
			if (map2.containsKey(id)) {
				if (map2.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력한 아이디가 존재하지 않습니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");

	}//
}//
