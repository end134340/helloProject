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
	private int tea_stock;
	private String up_date;
	private int click_cnt;

	TeaVO(String tea_name, String tea_kind, String tea_content, int tea_price, int tea_stock, String up_date) {
		this.tea_name = tea_name;
		this.tea_kind = tea_kind;
		this.tea_content = tea_content;
		this.tea_price = tea_price;
		this.tea_stock = tea_stock;
		this.up_date = up_date;
	}

	@Override
	public String toString() {
		return "<Tea>   | " + "no." + tea_no + " | " + tea_name + " | " + tea_kind + " | 가격: " + tea_price + "원 | 재고: "
				+ tea_stock + " | 조회수 " + click_cnt;
	}

	public String content() {
		return "등록일    | " + up_date + "\n내용     | " + tea_content;
	}
}
