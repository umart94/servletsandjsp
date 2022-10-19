package getsetattributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 Request : From Client to Server

		Response: From Server to Client

		When your client sends your servlet request, you add object in request and later retrieves it in jsp.The request is passed from servlet to jsp.Your jsp retrieves the object,generates a HTML and sends it as response back to your browser.The same request sent by your client is passed from one servlet or jsp to another jsp or servlet and then these are compiled to generate HTML format and sent to browser as response from server.Setting object in response doesnot make sense because browser just displays HTML.
		 */
		double n1 = Double.parseDouble(req.getParameter("n1"));
		double n2 = Double.parseDouble(req.getParameter("n2"));
		double ProductofN1andN2 = (Double) n1*n2;
		int sumFromS1 = (int)req.getAttribute("sumOfn1andn2");

		PrintWriter out = resp.getWriter();
		out.println("<h1>Sum Is : "+sumFromS1+"</h1>");
		out.println("<h1>Product Is : "+ProductofN1andN2+"</h1>");
		
	}
}
