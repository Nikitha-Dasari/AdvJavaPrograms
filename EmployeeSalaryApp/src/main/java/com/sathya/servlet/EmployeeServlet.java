package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read the data
		int empId=Integer.parseInt(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		double empSalary=Double.parseDouble(request.getParameter("empSalary"));
		double hra,da,pf,grossSal;
		
		//Process the data
		if(empSalary>=50000)
		{
			hra=0.3*empSalary;
			da=0.1*empSalary;
			pf=0.06*empSalary;
		}
		else if(empSalary<50000 && empSalary>25000)
		{
			hra=0.2*empSalary;
			da=0.05*empSalary;
			pf=0.03*empSalary;
		}
		else
		{
			hra=0.1*empSalary;
			da=0.03*empSalary;
			pf=0.02*empSalary;
		}
		grossSal=empSalary+hra+da+pf;
		
		//Render the response
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=azure>");
		writer.println("<h1> Employee NetSalary</h1>");
		writer.println("Employee ID: "+empId+"<br><br>");
		writer.println("Employee Name: "+empName+"<br><br>");
		writer.println("Employee Basic Salary: "+empSalary+"<br><br>");
		writer.println("HRA Amount: $"+hra+"<br><br>");
		writer.println("DA Amount: $"+da+"<br><br>");
		writer.println("PF Amount: $"+pf+"<br><br>");
		writer.println("Gross Salary: $"+grossSal);
		writer.println("</body");
		writer.println("</html>");
		
	}

	

}
