package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();		
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("txt_id"));
		String name = request.getParameter("txt_name");
		
		//Create Session//Initialize Session Object
		HttpSession session = request.getSession();
		
		//Set Value(s) on Session
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		
		//Getting Sessions
		id = (int)session.getAttribute("id");
		name = (String) session.getAttribute("name");
		
		out.println("<p>Session Info</p>");
		out.println("<p>ID : "+id+"</p>");
		out.println("<p>NAME : "+name+"</p>");
		
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='displaysession'>Display Session Variables</a>");
		out.close();
	}
}