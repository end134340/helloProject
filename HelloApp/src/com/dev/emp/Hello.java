package com.dev.emp;

class World{ //한 파일? 내에서 public으로 선언 가능한 클래스는 하나.라서 디폴트로 선언할수밖에없음.
	
}

public class Hello {
	private String name;
	int age;
	public double height;
	
	void setName(String name) {
		this.name = name; //name은 프라이빗으로 선언되어 있지만 동일한 클래스 내에서는 접근이 가능함…
		
	}
}
