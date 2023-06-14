package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEx {
	public static void main(String[] args) {
		// 데이터베이스 연결, 쿼리
		// jdbc driver 체크
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "proj";
		String pass = "proj";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pass); // 커넥션 객체를 하나 받아옴.

			// db쿼리 실행하고 결과 주고받는
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select user_id, user_name, user_birth from tbl_users"); // 조회... 결과 받아오는건
																										// ResultSet
			while (rs.next()) {
				System.out.println(rs.getString("user_id") + ", " + //
						rs.getString("user_name") + ", " + rs.getDate("user_birth"));
			}
			System.out.println("데이터를 모두 읽어왔습니다.");
			conn.close();
			rs.close();
			stmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
	}
}
