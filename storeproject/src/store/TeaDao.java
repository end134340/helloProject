package store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.board.BoardVO;

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
		sql = "insert all into teapot(tea_no, tea_name, tea_kind, tea_price) "//
				+ "values (tea_seq.nextval, ?, ?, ?) "//
				+ " into tea_shop (tea_no, tea_content, up_date) "// foreign키라고 해도 자동적으로 부모키 참조해서 값이 바뀌지 않으므로
																	// null이되고싶지않다면 입력할때함께입력해야됨.
				+ "values (tea_seq.nextval, ?, nvl((to_date(?, 'yyyy/mm/dd')), (to_date(sysdate, 'yyyy/mm/dd'))))"
				+ " select * from dual";

		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, tv.getTea_name());
			psmt.setString(2, tv.getTea_kind());
			psmt.setInt(3, tv.getTea_price());
			psmt.setString(4, tv.getTea_content());
			psmt.setString(5, tv.getUp_date());

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

		sql = "select 	 p.tea_no, p.tea_name, p.tea_kind, p.tea_price, s.click_cnt "//
				+ " from  teapot p, tea_shop s "//
				+ " where p.tea_no = s.tea_no";
		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				TeaVO tv = new TeaVO();
				tv.setTea_no(rs.getInt("tea_no"));
				tv.setTea_name(rs.getString("tea_name"));
				tv.setTea_kind(rs.getString("tea_kind"));
				tv.setTea_price(rs.getInt("tea_price"));
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
		sql = "select 	 p.tea_no, p.tea_name, p.tea_kind, p.tea_price, s.click_cnt, s.tea_content "//
				+ "from  teapot p, tea_shop s "//
				+ "where p.tea_kind = ? "//
				+ "and   p.tea_no = s.tea_no";
		conn = Dao.getConnect();

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
		conn = Dao.getConnect();

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

	public boolean stock_manager(TeaVO tv) {
		sql = "insert into stock_mng "//
				+ "values (?, ?, ?)";

		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, tv.getTea_no());
			psmt.setString(2, tv.getStock_name());
			psmt.setInt(3, tv.getStock_cnt());

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

	public List<TeaVO> stock_list() {
		conn = Dao.getConnect();
		List<TeaVO> list = new ArrayList<>();
		sql = "select p.tea_no, p.tea_name, p.tea_kind, t.stock_name, t.stock_cnt "//
				+ "	from teapot p, stock_mng t "//
				+ " where p.tea_no = t.tea_no ";//

		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				TeaVO tv = new TeaVO();
				tv.setTea_no(rs.getInt("tea_no"));
				tv.setTea_name(rs.getString("tea_name"));
				tv.setTea_kind(rs.getString("tea_kind"));
				tv.setStock_name(rs.getString("stock_name"));
				tv.setStock_cnt(rs.getInt("stock_cnt"));
				list.add(tv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public List<TeaVO> nowStock_list() {
		conn = Dao.getConnect();
		List<TeaVO> sList = new ArrayList<>();
		sql = "select p.tea_no, p.tea_name, p.tea_kind, sum(decode(t.stock_name, '출고', t.stock_cnt*-1, t.stock_cnt)) stock "//
				+ "	from teapot p, stock_mng t "//
				+ " where p.tea_no = t.tea_no "//
				+ " group by p.tea_no, p.tea_name, p.tea_kind, stock_name, stock_cnt";
		// decode로 출고라는 값이 있으면 -1을 곱한 값을 sum하고, 아니면 입력한 수량을 sum한다는거같음. 두개의 저걸 보여주기 위해서
		// join 사용.
		conn = Dao.getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				TeaVO tvs = new TeaVO();
				tvs.setTea_no(rs.getInt("tea_no"));
				tvs.setTea_name(rs.getString("tea_name"));
				tvs.setTea_kind(rs.getString("tea_kind"));
				tvs.setStock(rs.getInt("stock"));
				sList.add(tvs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return sList;
	}

}//
