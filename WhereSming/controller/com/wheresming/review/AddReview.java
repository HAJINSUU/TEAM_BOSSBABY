package com.wheresming.review;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wheresming.member.Login;

public class AddReview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddReview() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		int mv_seq = 104;
		String cmt_content = request.getParameter("comment");
		// time : SYSDATE
		String mb_id = "test2";
		int cmt_likes = 1;
		int cmt_score = 1;
		
		AddReviewDAO dao = new AddReviewDAO();
		ReviewDTO vo = new ReviewDTO(mv_seq, cmt_content, mb_id, cmt_likes, cmt_score);

		int cnt = dao.insertReview(vo);
		
		if (cnt > 0) {
			System.out.println("리뷰 작성 성공");
		} else {
			System.out.println("리뷰 작성 실패");
		}

	}

}
