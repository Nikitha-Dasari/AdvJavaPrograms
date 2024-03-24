package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Step1: Read the requested data
		int proId=Integer.parseInt(request.getParameter("proId"));
		String proName=request.getParameter("proName");
		double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
		double bill,discount,netAmount;
		
		//Step2:Process the data
		bill=proPrice*proQuantity;
		if(bill<1000)
			discount=0;
		else if(bill>=1000 && bill<5000)
			discount=0.05*bill;
		else if(bill>=5000 && bill<10000)
			discount=0.1*bill;
		else
			discount=1.5*bill;
		
		netAmount=bill-discount;
		
		//Step3:Render the response
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("<h1> Product Invoice</h1>");
		writer.println("Product ID: "+proId+"<br><br>");
		writer.println("Product Name: "+proName+"<br><br>");
		writer.println("Product Price: "+proPrice+"<br><br>");
		writer.println("Product Quantity: "+proQuantity+"<br><br>");
		writer.println("Total Bill Amount: $"+bill+"<br><br>");
		writer.println("Discount Amount: $"+discount+"<br><br>");
		writer.println("Net Amount to pay: $"+netAmount);
		writer.println("</body");
		writer.println("</html>");
		
		
		
	}

	

}
