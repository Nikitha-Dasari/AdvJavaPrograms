package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		HttpSession session=request.getSession(false);
		writer.println("<html>");
		writer.println("<body  style='background-color:pink;text-align:center;font-style:Times Roman;font-size:20px'>");
		writer.println("<pre>");
		writer.println("<h1>Registration Details</h1>");
		writer.println("Username: "+session.getAttribute("username"));
		writer.println("Age: "+session.getAttribute("age"));
		writer.println("Qualification: "+session.getAttribute("qualification"));
		writer.println("Designation: "+session.getAttribute("designation"));
		writer.println("Email: "+request.getParameter("email"));
		writer.println("Moblie Number: "+request.getParameter("mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
		
	}

}
