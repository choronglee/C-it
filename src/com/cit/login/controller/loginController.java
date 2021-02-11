package com.cit.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cit.login.service.loginService;

@WebServlet("/loginController")
public class loginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String idStatus = request.getParameter("idStatus");
			
		loginService ls = new loginService();
		int result = ls.loginCheck(id, pw);
	
		if(result == 1 ) {
			HttpSession session = request.getSession(true);
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/main.jsp"); 
			System.out.println("로그인 성공");
			
			if(idStatus != null) {	// 로그인 유지하기 누르면 쿠키 생성
				Cookie c = new Cookie("id", id);
				c.setMaxAge(60*60);
				c.setPath("/");
				response.addCookie(c);
				
				 String id_ = (String)session.getAttribute("id");
				 // 쿠키값을 세션으로 주입해 , 대신하여 로그인과정을 진행한다.
				 Cookie[] cookies = request.getCookies();
				 if(cookies != null){
				   for(Cookie cookie : cookies){
				     if(cookie.getName().equals("id_")){
				        session.setAttribute("id", cookie.getValue());
				  }
				   }
				      }
			}
		}else if(result == -1) {
			System.out.println("비밀번호가 다릅니다");
			response.sendRedirect("/login.jsp");
			
		}else {
			System.out.println("아이디가 없습니다.");
			response.sendRedirect("/login.jsp");
		}
	}
}
