package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletThree")
public class ServletThree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		Cookie[] cookies=request.getCookies();
		writer.println("<html>");
		writer.println("<body style='background-color:HoneyDew;text-align:center;font-style:Times Roman;font-size:20px'>");
		writer.println("<pre>");
		writer.println("<h1>Registration Details</h1>");
		writer.println("Username: "+cookies[0].getValue());
		writer.println("Age: "+cookies[1].getValue());
		writer.println("Qualification: "+cookies[2].getValue());
		writer.println("Designation: "+cookies[3].getValue());
		writer.println("Email: "+request.getParameter("email"));
		writer.println("Moblie Number: "+request.getParameter("mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
