package com.wheresming.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

 

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. id,pw 받기
				request.setCharacterEncoding("UTF-8");
				
				String id = request.getParameter("id");
				String pw = request.getParameter("pw");
				System.out.println(id+pw);
				// 2. Member 객체 생성(id,pw)
				MemberDTO vo = new MemberDTO(id, pw);
				// 3. MemberDAO 객체 생성
				LoginDAO dao = new LoginDAO();
				
				// 4. dao.selectMember() 메서드 호출
				MemberDTO loginMember = dao.selectMember(vo);
				
				
				
				// 5. 세션저장
				
				if(loginMember!=null) {  // 로그인 성공
					System.out.println("로그인성공");
					HttpSession session = request.getSession();
					session.setAttribute("loginMember",loginMember);
					response.sendRedirect("index.html");
				} else { // 로그인 실패
					System.out.println("로그인실패");
					response.sendRedirect("login.jsp");
				}
			
			}
	
	}

