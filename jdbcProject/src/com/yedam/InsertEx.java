package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEx {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요.");
		String id = scn.nextLine();
		System.out.println("패스워드를 입력해주세요.");
		String pw = scn.nextLine();
		System.out.println("이름을 입력해주세요.");
		String name = scn.nextLine();
		// jdbc driver 체크
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "proj";
		String pass = "proj";

		Connection conn = null;
		Statement stmt = null;
		String sql = "insert into tbl_users (user_id, user_pw, user_name)" +
		// "values ('user4', '4444', 'Choi')";
				" values('" + id + "', '" + pw + "', '" + name + "')";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql); // insert, update, delete 으로 처리된 건수만큼 처리된 정보 반환
			if (r > 0) {
				System.out.println("처리에 성공했습니다.");
			} else {
				System.out.println("처리에 실패했습니다.");
			}
		} catch (Exception e) {
			System.out.println("처리 중 오류가 발생했습니다.");
			e.printStackTrace(); // 오류 위치 보여주는거
		} finally { // 정상적으로 실행되건 예외처리가 되건 반드시 넣고싶은 코드는 여기에 넣음. 대체적으로 resource close를 여기넣어줌
		}
		try {
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}// main
}
