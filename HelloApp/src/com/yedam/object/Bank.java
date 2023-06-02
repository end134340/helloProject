package com.yedam.object;

public class Bank {
	private String accountNo; //중복되는 값이 없어야함
	private String owner; //계좌주인 필드
	private int balance; //잔고
	
	//이클립스에서 자동으로 getters setters 만들어주는걸로 만든거 ↓ 
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	
	/************************메소드 getter(get) / setter(set) 수동으로 만들때 생각해야되는거. 규칙들.**********************************/
//	void setAccountNo(String acNo) { //set이라는 메소드를 만들 때에는 단어 구분을 대문자로 함. void는 따로 값을 반환하지 않고 내부적으로 처리하고 끝이 난다는 뜻
//		accountNo = acNo;
//	}
//	
//	String getAccountNo() { //타입을 선언하고 get사용
//		return accountNo;	//private인 
//	}
//	void setOwner(String owner) { //(매개변수)
//		this.owner = owner; //매개변수와 필드가 다르면 this를 사용하지 않아도 되는데, 필드와 매개변수의 이름이 같으면 필드에 소속되어 있다는 의미로 this 사용.
//	} 
//	
//	String getOwner() {
//		return this.owner;
//	}
//	
//	void setBalance(int balance) {
//		this.balance = balance;
//	}
//	
//	int getBalance() {
//		return this.balance;
//	}
	
	
}
