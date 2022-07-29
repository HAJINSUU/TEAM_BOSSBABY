package com.wheresming.review;

import lombok.Getter;

@Getter
public class ReviewViewerDTO {

	private int cmt_score;
	private String cmt_content;
	private String mb_nick;
	private int cmt_likes;
	
	public ReviewViewerDTO(int cmt_score, String cmt_content, String mb_nick, int cmt_lik) {
		super();
		this.cmt_score = cmt_score;
		this.cmt_content = cmt_content;
		this.mb_nick = mb_nick;
		this.cmt_likes = cmt_lik;
	}
	
	
}
