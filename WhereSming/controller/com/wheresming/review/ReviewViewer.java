package com.wheresming.review;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wheresming.member.MemberDTO;
import com.wheresming.search.Searching;

public class ReviewViewer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReviewViewer() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		int mv_seq = Integer.parseInt(request.getParameter("seq"));
		
		System.out.println(mv_seq);
		
		ReviewViewerDAO dao = new ReviewViewerDAO();
				
		List<ReviewViewerDTO> vo = new ArrayList<ReviewViewerDTO>();
		
		vo = dao.selectAllReview(mv_seq);
		
		System.out.println(vo.get(0).getCmt_content());

	}

}
