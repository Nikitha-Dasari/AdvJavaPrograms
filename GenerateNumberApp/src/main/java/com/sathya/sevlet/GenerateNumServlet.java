package com.sathya.sevlet;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GenerateNumServlet")
public class GenerateNumServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("start"));
		int num2=Integer.parseInt(request.getParameter("end"));
		String operation=request.getParameter("operation");
		int i,j;
		ArrayList<Integer> al=new ArrayList<Integer>();
		switch(operation)
		{
		case "Even":
			for(i=num1;i<=num2;i++)
			{
				if(i%2==0)
					al.add(i);
			}
			break;
		case "Odd":
			for(i=num1;i<=num2;i++)
			{
				if(i%2!=0)
					al.add(i);
			}
			break;
		case "Prime":int flag;
			for(i=num1;i<=num2;i++)
			{
				flag=0;
				for(j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}	
				}
				if(flag==0)
				{
					al.add(i);
				}
			}
			break;
		case "Perfect":int sum;
			for(i=num1;i<=num2;i++)
			{ 
				sum=0;
				for(j=1;j<=i/2;j++)
				{
					if(i%j==0)
					{
						sum=sum+j;
					}
				}
				if(sum==i)
					al.add(i);
			}
			break;
		case "Strong":int s,temp,rem,fact;
			for(i=num1;i<=num2;i++)
			{
				s=0;
				temp=i;
				while(temp>0)
				{
					rem=temp%10;
					if(rem==0 || rem==1)
						fact=1;
					else
					{
						fact=1;
						for(j=1;j<=rem;j++)
							fact=fact*j; 
					}
					s=s+fact;
					temp=temp/10;
				}
		 
				if(i==s)
					al.add(i);
			}
			break;
	
		}
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("<h2> Generating Numbers</h2>");
		writer.println("Start Number: "+num1+"<br><br>");
		writer.println("End Number: "+num2+"<br><br>");
		writer.println("Operation is: "+operation+"<br><br>");
		writer.println("Result: "+al);
		writer.println("</body>");
		writer.println("</html>");
	}

}
