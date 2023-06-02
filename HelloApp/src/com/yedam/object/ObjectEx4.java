package com.yedam.object;


//member에 가족정보인 Person클래스를 등록.
public class ObjectEx4 {
	public static void main(String[] args) {
		
		Person[] families = {new Person("아버지", 60)
							,new Person("어머니", 55)
							,new Person("동생", 18)
		}; //Person이라는 클래스가 가진 구조가 와야?됨?
		
		Member m1 = new Member(); 
		m1.memberId = "user1";
		m1.memberName = "홍길동";
		m1.point = 1000;
		m1.families = families;
		
		m1.families[0].getName(); //아버지의 정보
		m1.families[0].getAge(); //아버지의 나이
		
		Member m2 = new Member();
		
		Member[] members = new Member[10];
		members[0] = m1;
		members[1] = m2;
		
		for (int i = 0; i<members.length; i++) {
			String name = members[i].families[0].getName();
		}
	}
}
