package com.wheresming.review;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wheresming.member.MemberDTO;

public class ReviewViewer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReviewViewer() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		int mv_seq = 104;
		
		ReviewViewerDAO dao = new ReviewViewerDAO();
		
		

	}

}
