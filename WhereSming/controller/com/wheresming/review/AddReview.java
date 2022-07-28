package com.wheresming.review;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddReview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddReview() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String comment = request.getParameter("comment");
		
		ReviewDTO vo = new ReviewDTO();
		AddReviewDAO dao = new AddReviewDAO();
		
	}

}