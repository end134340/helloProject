package com.yedam.object;

//method에 대한 내용
// static(new라는 키워드로 만들어줄 필요 없이 바로 사용 가능) <> instance.(new라는 키워드로 인스턴스를 만들어줘야 사용가능)
public class ObjectEx5Method {

	public static void main(String[] args) { // instance로 메모리에 공간을 만들어주지 않아도 바로 사용할 수 있게 만들어주는게 static이라는 키워드인듯
		int num1 = 10;
		int num2 = 20;
		int result = sum(num1, num2);
		double result2 = div(num1, num2);
		result = sum(new int[] { num1, num2 }); // new는 만들어진 값을 반환한다는 키워드???

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result);

		makePerson("홍길동", 20); // method를 호출하는 부분에서는 값만 넣고, method를 만들 때에는 어떤 값이 들어올지 모르니까 타입을 선언함...
		// makeAry(10);
		int[] resultAry = makeAry(10);
		showNumber(resultAry);
//		ObjectEx5Method o1 = new ObjectEx5Method(); //ObjectEx5Method라는 클래스를 가지고 와서 거기 안에 있는 기능을 사용하겠다?고?
//														//new라고 생성자로 호출하면 메모리에 로딩됨(instance를 만드는거........하놔)
//		o1.sum(num1, num2);
	}

	// static이 없으면 instance method(실체가 있어야 사용되는 메소드)
	// method overloading (메소드를 재정의한다. 그런데 똑같은 값이 오면 오류가 나고... 변수 이름이 중요한게 아니라 매개변수의
	// 타입이 중요함. int받는 메소드가 있는데 int받는게 올수는 없음. 반환되는 값이 다른 타입인것도 인식못함)
	public static int sum(int a, int b) {
		return a + b;
	}

	public static Person makePerson(String name, int age) {
		return new Person(name, age);
	}
	
	public static void showNumber(int[]ary) {//값을 반환하지 않고 배열에 변수가 들어오면 그냥 출력하겠다는뜻
		for(int num : ary) {
			System.out.print(num+" ");
		}
	}

	public static int[] makeAry(int size) { // 배열을 가져오면 배열만큼의 크기를 반환
		int[] ary = new int[size];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) (Math.random() * 10) + 1;
		}
		// return new int[size];
		return ary;
	}

	public static int sum(int[] ary) {
		int result = 0;
		for (int num : ary) {
			result += num;
		}
		return result;
	}

	public static double div(int n1, int n2) {
		return (double) n1 / n2;
	}

}
