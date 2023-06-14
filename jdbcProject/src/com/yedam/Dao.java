package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;

//db접속도 하고 Connection 기능도 반환해주는 클래스.
public class Dao {

	static String url = "jdbc:oracle:thin:@localhost:1521/xe";
	static String user = "proj";
	static String pass = "proj";
	static Connection conn;

	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}// class
