package com.yedam.reference;

public class ReferenceEx4 {

	public static void main(String[] args) {
		String[] strAry = { "홍길동", "김민수", "최수민" };
		strAry[0] = "Hong";
		strAry = new String[] { "Hong", "Kim", "Choi" };
		System.out.println(strAry[0]);

//		for (String no : strAry) {
//			System.out.println(no);
//		}

		for (int i = 0; i < strAry.length; i++) {
//			System.out.println(strAry[i]);
			if (strAry[i].equals("Kim")) {
				System.out.printf("%s는 %d번째에 있습니다......\n", strAry[i], (i + 1));
			}
		}

		// 문자열 'Hongkildong'에서 index의 기준으로 값을 반환해주는 메소드
		String s1 = "Hongkildong";
		char result = s1.charAt(0); // charAt()이라는 건 index값을 기준으로 값을 가져와주는 메소드...인듯?
		System.out.println(result);

		int result1 = s1.indexOf("k"); // int타입으로 원하는 글자의 index값을 반환해주는 메소드.
		System.out.println(result1);

		// String 배열에 주민번호 950904-1234567, 950404-2234567
		String[] idAry = { "950904-1234567", "950404-2234567" };
		for (int i = 0; i < idAry.length; i++) {
			//char 타입은 문자 => 'H'
			if(idAry[i].charAt(7)=='2')
				System.out.printf("%d번째에 있습니다.", (i+1));
		}
	}

}
