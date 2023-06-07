package com.yedam.abstracts;

//mysql(dbms)로 기능을 구현하다가 몇년이 지난 후 Oracle이라는 dbms로 기능 구현.
//mysql = add() oracle = plus()

public class JdbcExe {

	public static void main(String[] args) {
		Dao dao = new MysqlDao();
		OracleDao odao = new OracleDao();

		dao.start(); // odao.begin();
		dao.add(); // odao.register();
		dao.modify();// odao.modify();
		dao.remove();// odao.delete();
		dao.stop();// odao.end();
	}

}
