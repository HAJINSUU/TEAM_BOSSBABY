package com.wheresming.member;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class MemberDTO {
	private int mb_seq;
	@NonNull
	private String mb_id;
	@NonNull
	private String mb_pw;
	private String mb_nick;
	private String mb_email;
	private String mb_phone;
	private Timestamp mb_joindate;
	private String mb_type;
}
