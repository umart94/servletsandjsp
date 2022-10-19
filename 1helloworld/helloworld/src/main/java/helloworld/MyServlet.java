package helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet{
	//localhost:9494/helloworld/web
	ServletConfig configuration;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroyed MyServlet");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.configuration;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This Servlet is created by Muhammad Umar Tariq";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.configuration = config;
		System.out.println("creating object");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("logic processing");
		res.setContentType("text/html");
		PrintWriter printWriterobject = res.getWriter();
		printWriterobject.println("<h1>this is my output"+new Date().toString()+"</h1>");
	}

}
