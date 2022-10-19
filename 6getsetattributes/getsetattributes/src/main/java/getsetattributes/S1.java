package getsetattributes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 Request : From Client to Server

		Response: From Server to Client

		When your client sends your servlet request, you add object in request and later retrieves it in jsp.The request is passed from servlet to jsp.Your jsp retrieves the object,generates a HTML and sends it as response back to your browser.The same request sent by your client is passed from one servlet or jsp to another jsp or servlet and then these are compiled to generate HTML format and sent to browser as response from server.Setting object in response doesnot make sense because browser just displays HTML.
		 */
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		int sum = n1+n2;
		req.setAttribute("sumOfn1andn2",sum);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("S2");
		requestDispatcher.forward(req, resp);
		
	}
}
