package com.dev;

import com.dev.emp.Hello;

public class HelloEx {
	public static void main(String[] args) {
		// 동일한 패키지 클래스
//		Hello hello = new Hello();

//		Hello hello1 = new Hello();

		// com.dev.Hello hello = new com.dev.Hello();
		com.dev.emp.Hello hello1 = new com.dev.emp.Hello(); // 각각 다른 패키지에서 가지고오고 싶은 경우에는 앞에 패키지를 붙여 사용한다.
		//hello1.name = "Hong"; // 클래스 내에서 접근
		//hello1.age = 32; // 동일한 패키지 내에서 접근
		hello1.height = 182.4;// 동일한 패키지이건 아니건 관계없이 접근 가능함.

		//World world = new World(); // World라는 클래스는 다른 패키지에서 default 지시자로 선언되어 같은 패키지 내에서의 접근만 허용하기때문에 다른 패키지에서는
									// 사용할수 x
	}
}
