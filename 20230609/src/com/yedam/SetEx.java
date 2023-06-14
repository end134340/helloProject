package com.yedam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		// 1. ArrayList<T> 인덱스 값으로 저장하기 때문에 중복된 값이 들어감.
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Hello");

		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("---------------------------------------");
		// 2.Set<T> 중복된 값을 담지 않는 것이 특징. 인덱스 값이 따로 없음.
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");

		for (String str : set) {
			System.out.println(str);
		} // Hello라는 값을 두 번 넣었지만 중복을 제거하고 하나만 출력함.

		System.out.println("---------------------------------------");

		Set<Member> members = new HashSet<>();

		members.add(new Member("user1", "1111"));
		members.add(new Member("user2", "2222"));
		members.add(new Member("user1", "1111"));

		for (Member member : members) {
			System.out.println(member.getId() + ", " + member.getPw());
		}
		

		

	}// 메인
}// 클래스
