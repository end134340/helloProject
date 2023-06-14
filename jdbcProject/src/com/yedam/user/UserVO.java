package com.yedam.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter setter lombok
@AllArgsConstructor // 전체 생성자 생성
@NoArgsConstructor // 기본 생성자 생성
public class UserVO {
	private String userId;
	private String userPw;
	private String userName;
	private String userBirth;
	private String userPhone;
	private String userAddr;

}// class
