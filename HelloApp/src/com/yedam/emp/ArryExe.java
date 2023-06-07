package com.yedam.emp;

import java.util.ArrayList;

class Member {
	private String memberId;
	private String memberName;
	private int score;

	Member(String memberId, String memberName, int score) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.score = score;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

//배열은 null 값이 있는지 없는지 여부를 체크해야 하고, 크기를 한번 정하면 새로 정해야하지만 컬렉션을 이용하면 보다 편하게 만들 수 있음.
//추가는 add, 수정은 set, 삭제는 remove

//추상클래스를 만들어 반드시 있어야 할 메소드를 추상 메소드로...만들어서 추가수정삭제?를하고싶다고?
public class ArryExe {
	public static void main(String[] args) {

		ArrayList members = new ArrayList();
		members.add(new Member("001", "홍길동", 100));
		members.add(new Member("002", "김길동", 200));

		for (int i = 0; i < members.size(); i++) {
			Member member = (Member) members.get(i);
			if (member.getMemberName().equals("홍길동")) {
				// members.remove(i);
				members.set(i, new Member("010", "김민식", 150));
			}
		}

		ArrayList arry = new ArrayList();
		arry.add("홍길동");
		arry.add("김기동");
//		arry.add(100); // = arry.add(new Integer(100));
		arry.add("박길동");

		arry.set(0, "황길동"); // 수정

//		arry.remove(0); // 지우고 싶은 위치의 인덱스 값을 remove()안에 넣으면됨

		for (int i = 0; i < arry.size(); i++) { // length가 아니라 size를 사용해야함. null인지 여부를 체크하지 않음.
			System.out.println(arry.get(i));
		}

		for (Object name : arry) {
			System.out.println((String) name);
		}

	}// 메인 끝
}// 클래스 끝
