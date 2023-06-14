package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEx {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요.");
		String id = scn.nextLine();
		System.out.println("패스워드를 입력해주세요.");
		String pw = scn.nextLine();
		System.out.println("주소를 입력해주세요.");
		String addr = scn.nextLine();

		// jdbc driver 체크
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "proj";
		String pass = "proj";

		Connection conn = null;
		PreparedStatement psmt = null;
		String sql = "update tbl_users set user_pw = "
//				+ "'3333', user_addr = 'Seoul 100' where user_id = 'user3'";
				+ "?, user_addr = ? where user_id = ?";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);

			psmt = conn.prepareStatement(sql); // 쿼리 자체가 객체를 만들때 정의됨(?)
			psmt.setString(1, pw);
			psmt.setString(2, addr);
			psmt.setString(3, id);
			int r = psmt.executeUpdate(); // 처리된 건수를 반환
			if (r > 0) {
				System.out.println("처리에 성공했습니다.");
			} else {
				System.out.println("처리에 실패했습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}// main
}
