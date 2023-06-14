package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.Dao;
import com.yedam.user.UserVO;

public class BoardDao {
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean add(BoardVO bd) {
		sql = "insert into tbl_board (brd_no, brd_title, brd_writer, brd_content, create_date) "//
				+ "values (board_seq.nextval, ?, ?, ?, nvl(?, sysdate))";

		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, bd.getBrd_title());
			psmt.setString(2, bd.getBrd_writer());
			psmt.setString(3, bd.getBrd_content());
			psmt.setString(4, bd.getCreate_date());

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

	public boolean delete(BoardVO bd) {
		sql = "delete from tbl_board "//
				+ "where brd_title = ?";

		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bd.getBrd_title());

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

	public boolean modify(BoardVO bd) {
		sql = "update tbl_board "//
				+ "set brd_title = nvl(?, brd_title), "//
				+ "		brd_content = nvl(?, brd_content), "//
				+ "		create_date = nvl(?, create_date) "//
				+ "where brd_no = ?";
		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, bd.getBrd_title());
			psmt.setString(2, bd.getBrd_content());
			psmt.setString(3, bd.getCreate_date());

			psmt.setInt(4, bd.getBrd_no());

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

	public BoardVO search(String brd_writer) {
		sql = "select * from tbl_board where brd_writer = ?";
		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, brd_writer);
			rs = psmt.executeQuery();
			if (rs.next()) {
				BoardVO bd = new BoardVO();
				bd.setBrd_no(rs.getInt("brd_no"));
				bd.setBrd_title(rs.getString("brd_title"));
				bd.setBrd_writer(rs.getString("brd_writer"));
				bd.setBrd_content(rs.getString("brd_content"));
				bd.setCreate_date(rs.getString("create_date"));
				return bd;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}

	public List<BoardVO> list() {
		List<BoardVO> list = new ArrayList<>();

		sql = "select * from tbl_board";
		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				BoardVO bd = new BoardVO();
				bd.setBrd_no(rs.getInt("brd_no"));
				bd.setBrd_title(rs.getString("brd_title"));
				bd.setBrd_writer(rs.getString("brd_writer"));
				bd.setBrd_content(rs.getString("brd_content"));
				bd.setCreate_date(rs.getString("create_date"));
				list.add(bd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
}// class
