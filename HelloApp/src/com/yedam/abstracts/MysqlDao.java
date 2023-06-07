package com.yedam.abstracts;

public class MysqlDao extends Dao {
	@Override
	void add() {
		System.out.println("mysql 등록.");
	}

	@Override
	void modify() {
		System.out.println("mysql 수정");
	}

	@Override
	void remove() {
		System.out.println("mysql 삭제");
	}
}
