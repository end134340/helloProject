package com.yedam.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BoardVO {
	private int brd_no;
	private String brd_title;
	private String brd_writer;
	private String brd_content;
	private String create_date;
	private int click_cnt;
}
