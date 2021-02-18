package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DisplaySession extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//Getting and Display Session Variables
		PrintWriter out = response.getWriter();		
		response.setContentType("text/html");
						
		//Create Session//Initialize Session Object
		HttpSession session = request.getSession();
		
		if (session != null) {
			//Getting Sessions
			int id = (int)session.getAttribute("id");
			String fullname = (String) session.getAttribute("name");		
		
			out.println("<p>Session Info</p>");
			out.println("<p>ID : "+id+"</p>");
			out.println("<p>NAME : "+fullname+"</p>");
		}
		else {
			out.println("<p>Session doesn't exist</p>");
		}
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='index.jsp'>Index</a>");
		out.close();
		
	}

}
