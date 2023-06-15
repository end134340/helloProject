package store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeaDao {

	Connection conn;
	PreparedStatement psmt;
	String sql;
	ResultSet rs;

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

	public boolean upload(TeaVO tv) {
		sql = "insert all into teapot(tea_no, tea_name, tea_kind, tea_price, tea_stock, up_date) "//
				+ "values (tea_seq.nextval, ?, ?, ?, ?, nvl((to_date(?, 'yyyy/mm/dd')), (to_date(sysdate, 'yyyy/mm/dd'))))"//
				+ " into tea_shop (tea_no, tea_content) "//
				+ "values (tea_seq.nextval, ?)" + " select * from dual";

		conn = com.yedam.Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, tv.getTea_name());
			psmt.setString(2, tv.getTea_kind());
			psmt.setInt(3, tv.getTea_price());
			psmt.setInt(4, tv.getTea_stock());
			psmt.setString(5, tv.getUp_date());
			psmt.setString(6, tv.getTea_content());

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

	public List<TeaVO> list() {
		List<TeaVO> list = new ArrayList<>();

		sql = "select * from teapot";
		conn = com.yedam.Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				TeaVO tv = new TeaVO();
				tv.setTea_no(rs.getInt("tea_no"));
				tv.setTea_name(rs.getString("tea_name"));
				tv.setTea_kind(rs.getString("tea_kind"));
				tv.setTea_price(rs.getInt("tea_price"));
				tv.setTea_stock(rs.getInt("tea_stock"));
				tv.setClick_cnt(rs.getInt("click_cnt"));
				list.add(tv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public TeaVO searchk(String tea_kind) {
		sql = "select 	 p.tea_no, p.tea_name, p.tea_kind, p.tea_price, p.tea_stock, p.click_cnt, s.tea_content "//
				+ "from  teapot p, tea_shop s "//
				+ "where p.tea_kind = ? "//
				+ "and   p.tea_no = s.tea_no";
		conn = com.yedam.Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tea_kind);

			rs = psmt.executeQuery();

			while (rs.next()) {
				TeaVO tv = new TeaVO();
				tv.setTea_no(rs.getInt("tea_no"));
				tv.setTea_name(rs.getString("tea_name"));
				tv.setTea_kind(rs.getString("tea_kind"));
				tv.setTea_price(rs.getInt("tea_price"));
				tv.setTea_stock(rs.getInt("tea_stock"));
				tv.setClick_cnt(rs.getInt("click_cnt"));
				tv.setTea_content(rs.getString("tea_content"));
				return tv;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return null;
	}

	public TeaVO searchn(int tea_no) {
		sql = "select 	 p.tea_no, p.tea_name, p.tea_kind, p.tea_price, p.tea_stock, p.up_date, p.click_cnt, s.tea_content "//
				+ "from  teapot p, tea_shop s "//
				+ "where p.tea_no = ? "//
				+ "and   p.tea_no = s.tea_no";
		conn = com.yedam.Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, tea_no);

			rs = psmt.executeQuery();

			while (rs.next()) {
				TeaVO tv = new TeaVO();
				tv.setTea_no(rs.getInt("tea_no"));
				tv.setTea_name(rs.getString("tea_name"));
				tv.setTea_kind(rs.getString("tea_kind"));
				tv.setTea_price(rs.getInt("tea_price"));
				tv.setTea_stock(rs.getInt("tea_stock"));
				tv.setUp_date(rs.getString("up_date"));
				tv.setClick_cnt(rs.getInt("click_cnt"));
				tv.setTea_content(rs.getString("tea_content"));
				return tv;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return null;
	}

	public boolean instock(TeaVO tv) {
		sql = "update teapot "//
				+ "set tea_stock = tea_stock+? "//
				+ "where tea_no = ?";

		conn = com.yedam.Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, tv.getTea_stock());
			psmt.setInt(2, tv.getTea_no());

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

}//
