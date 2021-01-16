package pkg1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Decalre
		int n1, n2, n3;
		
		try {
			//Receive values from Web Form			
			n1 = Integer.parseInt(request.getParameter("txt_n1"));
			n2 = Integer.parseInt(request.getParameter("txt_n2"));
			
			//Process
			n3 = n1+n2;
			
			//Adding result on request
			request.setAttribute("result", n3);
			
			//Forward Result to Display
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);		
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
