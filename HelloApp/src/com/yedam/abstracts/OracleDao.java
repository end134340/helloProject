package com.yedam.abstracts;

public class OracleDao extends Dao {
//	void begin() {
//	}
//
//	void end() {
//	}
//
//	void register() {
//	}
//
//	void modify() {
//	}
//
//	void delete() {
//	}

	@Override
	void add() {
		System.out.println("Oracle 등록.");
	}

	@Override
	void modify() {
		System.out.println("Oracle 수정");
	}

	@Override
	void remove() {
		System.out.println("Oracle 삭제");
	}
}
