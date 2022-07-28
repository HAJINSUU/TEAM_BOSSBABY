package com.wheresming.review;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
/**
 * Servlet implementation class AddReviews
 */
=======
>>>>>>> branch 'master' of https://github.com/HAJINSUU/TEAM_BOSSBABY.git
public class AddReview extends HttpServlet {
	private static final long serialVersionUID = 1L;

<<<<<<< HEAD
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
=======
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
>>>>>>> branch 'master' of https://github.com/HAJINSUU/TEAM_BOSSBABY.git
