package com.wheresming.review;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReviewViewer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReviewViewer() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = "test2";
		String comment = null;
		
		ReviewDTO vo = new ReviewDTO(id, comment);
		
		
	}

}
