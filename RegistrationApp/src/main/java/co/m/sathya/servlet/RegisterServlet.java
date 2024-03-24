package co.m.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read the data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String[] quals=request.getParameterValues("qualification");
		String country=request.getParameter("country");
		String[] languages=request.getParameterValues("languages");
		String comment=request.getParameter("comments");
		
		//Process the data
		String q=String.join(",",quals);
		String l=String.join("-",languages);
		
		//render the response
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("<h2> Registration Details</h2>");
		writer.println("Your Username: "+username+"<br><br>");
		writer.println("Your Password: "+password+"<br><br>");
		writer.println("Your Mobile Number: "+mobile+"<br><br>");
		writer.println("Your Email ID: "+email+"<br><br>");
		writer.println("Your Gender: "+gender+"<br><br>");
		writer.println("Your Qualification: "+q+"<br><br>");
		writer.println("Your Country: "+country+"<br><br>");
		writer.println("Languages Known: "+l+"<br><br>");
		writer.println("Your Comments: "+comment+"<br><br>");
		writer.println("</body>");
		writer.println("</html>");
		
		
	}

}
