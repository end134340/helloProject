package store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TeaVO {
	private int tea_no;
	private String tea_name;
	private String tea_kind;
	private String tea_content;
	private int tea_price;
	private String up_date;
	private int click_cnt;
	private String stock_name;
	private int stock_cnt;
	private int stock;

	TeaVO(String tea_name, String tea_kind, String tea_content, int tea_price, int tea_stock, String up_date) {
		this.tea_name = tea_name;
		this.tea_kind = tea_kind;
		this.tea_content = tea_content;
		this.tea_price = tea_price;
		this.up_date = up_date;
	}

	TeaVO(int tea_no, String stock_name, int stock_cnt) {
		this.tea_no = tea_no;
		this.stock_name = stock_name;
		this.stock_cnt = stock_cnt;
	}

	@Override
	public String toString() {
		return "<Tea>   | " + "no." + tea_no + " | " + tea_name + " | " + tea_kind + " | 가격: " + tea_price + "원 | "//
				+ "조회수 " + click_cnt;
	}

	public String content() {
		return "<Tea>   | " + "no. " + tea_no + " | " + tea_name + " | " + tea_kind + " | 가격: " + tea_price + "원 | "
				+ "/n등록일    | " + up_date + "조회수 " + click_cnt//
				+ "/n내용     | " + tea_content;
	}

	public String nowStock() {
		return "재고관리  | " + "no." + tea_no + " | " + tea_name + " | " + tea_kind + " | 재고 " + stock;
	}

	public String stockManagement() {
		return "재고관리  | " + "no." + tea_no + " | " + tea_name + " | " + tea_kind + " | " + stock_name//
				+ " | 수량 " + stock;
	}

}
