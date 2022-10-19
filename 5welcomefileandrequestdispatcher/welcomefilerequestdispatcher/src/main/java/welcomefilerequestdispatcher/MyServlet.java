package welcomefilerequestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	/*
	 requestdispatcher
	 client -> sends to servlet1 -> forward() requestdispatcher->servlet2
	 
	 */
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1> welcome to myservlet - httpservletdopost</h1>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String condition = req.getParameter("user_condition");
		if(condition != null) {
			if(condition.equals("checked")) {
				out.println("<h1>"+name+"</h1>");
				out.println("<h1>"+password+"</h1>");
				out.println("<h1>"+email+"</h1>");
				RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("SuccessServlet");
				requestDispatcher1.forward(req, resp);
				
			} else {
				out.print("<h1>you have not accepted terms of service</h1>");
				
			} 
		} else {
			out.print("<h1>you have not accepted terms of service</h1>");
			//i want to include output of index.html
			//get the object of request dispatcher
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
			requestDispatcher.include(req, resp);
			
			//in response, we included index.html
			
		}
		
		
	}

	
	
}
