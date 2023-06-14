package com.yedam.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.Dao;

//입력/수정/삭제/목록 가져오는 기능 구현
public class UserDao {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	String sql;

	private void close() {
		try {
			if (conn != null) {
				conn.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// login check (아이디와 비밀번호를 넣어 맞으면 로그인 아니면 로그인하라고뜸)

	public boolean add(UserVO user) {
		sql = "insert into tbl_users(user_id, user_pw, user_name) "//
				+ "values (?,?,?)";
		conn = Dao.getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user.getUserId());
			psmt.setString(2, user.getUserPw());
			psmt.setString(3, user.getUserName());

			int r = psmt.executeUpdate(); // 쿼리 실행
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return false;
	}

	public UserVO search(String userId) {
		sql = "select * from tbl_users where user_id = ?";
		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, userId);
			rs = psmt.executeQuery(); // 조회할 때에는 executeQuery를 사용.
			if (rs.next()) {
				UserVO user = new UserVO();
				user.setUserId(rs.getString("user_id")); // 쿼리한 결과를 가지고 와서 .....머?
				user.setUserPw(rs.getString("user_pw"));
				user.setUserName(rs.getString("user_name"));
				user.setUserBirth(rs.getString("user_birth"));
				user.setUserPhone(rs.getString("user_phone"));
				user.setUserAddr(rs.getString("user_addr"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}

	public boolean modify(UserVO user) {
		sql = "update tbl_users "//
				+ "set user_pw = nvl(?, user_pw), "//
				+ "user_name = nvl(?, user_name), "//
				+ "user_birth = nvl(?, user_birth), "//
				+ "user_phone = nvl(?, user_phone), "//
				+ "user_addr = nvl(?, user_addr)"//
				+ " where user_id = ?";
		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user.getUserPw());
			psmt.setString(2, user.getUserName());
			psmt.setString(3, user.getUserBirth());
			psmt.setString(4, user.getUserPhone());
			psmt.setString(5, user.getUserAddr());

			psmt.setString(6, user.getUserId());

			int r = psmt.executeUpdate(); // 쿼리실행
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return false;
	}

	public boolean remove(UserVO user) {
		sql = "delete from tbl_users "//
				+ "WHERE user_id = ?";
		conn = Dao.getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user.getUserId());

			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return false;
	}

	public List<UserVO> list() {
		List<UserVO> list = new ArrayList<>();

		sql = "select * from tbl_users";
		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				UserVO user = new UserVO();
				user.setUserId(rs.getString("user_id"));
				user.setUserPw(rs.getString("user_pw"));
				user.setUserName(rs.getString("user_name"));
				user.setUserBirth(rs.getString("user_birth"));
				user.setUserPhone(rs.getString("user_phone"));
				user.setUserAddr(rs.getString("user_addr"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
}// class
