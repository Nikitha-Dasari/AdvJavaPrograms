package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//get the data
				String username=request.getParameter("username");
				String age=request.getParameter("age");
				//create cookie object
				Cookie cookie1=new Cookie("username", username);
				Cookie cookie2=new Cookie("age", age);
				//add the cookies to response object
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				//give the next from to client
				RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
				dispatcher.forward(request, response);
	}

}
