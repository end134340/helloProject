package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요.");
		String id = scn.nextLine();
		// jdbc driver 체크
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "proj";
		String pass = "proj";

		Connection conn = null;
		PreparedStatement psmt = null;
		String sql = "delete from tbl_users WHERE user_id = ?";
		try {
			conn = Dao.getConnect();

			psmt = conn.prepareStatement(sql); // 쿼리 자체가 객체를 만들때 정의됨(?)
			psmt.setString(1, id);
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
