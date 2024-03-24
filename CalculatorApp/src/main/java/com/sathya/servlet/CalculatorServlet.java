package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("first"));
		int num2=Integer.parseInt(request.getParameter("second"));
		String operation=request.getParameter("operation");
		int result=0;
		switch(operation)
		{
		case "+":result=num1+num2;
				 break;
		case "-":result=num1+num2;
		 		 break;
		case "*":result=num1+num2;
		         break;
		case "/":result=num1+num2;
		 		 break;
		case "%":result=num1+num2;
		 		 break;
		}
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("<h2> Calculation Result</h2>");
		writer.println("First Number: "+num1+"<br><br>");
		writer.println("Second Number: "+num2+"<br><br>");
		writer.println("Operation is: "+operation+"<br><br>");
		writer.println("Result: "+result);
		writer.println("</body>");
		writer.println("</html>");
	}

}
