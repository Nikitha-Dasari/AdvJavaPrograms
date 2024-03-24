package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String status;
		if(username.equals("Sathya")&&password.equals("Sathya@123"))
		{
			status="Login Successful";
		}
		else
		{
			status="Login fail";
		}
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Login status</h1>"+status);
		writer.println("</html>");
		/*if(username.equals("Sathya")&&password.equals("Sathya@123"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("Success.html");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("Login fail! check the credentials");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);
		}*/
		/*if(username.equals("Sathya")&&password.equals("Sathya@123"))
		{
			response.sendRedirect("https://www.tcs.com");
		}
		else
			response.sendError(808,"Login fail!!");*/
		/*response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		if(username.equals("Sathya")&&password.equals("Sathya@123"))
		{
			writer.println("Login success <br>");
			writer.println("<a href='http://www.tcs.com'>Click here</a>");
		}
		else
		{
			writer.println("Login fail <br>");
			writer.println("<a href='Login.html'>Click here</a>");
		}*/
	

	
	}

}
