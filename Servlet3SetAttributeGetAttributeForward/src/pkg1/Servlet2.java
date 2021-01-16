package pkg1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h3>Calculator-1");
		out.println("<p>Number 1 : "+ request.getParameter("txt_n1") +"</p>");
		out.println("<p>Number 2 : "+ request.getParameter("txt_n2") +"</p>");
		out.println("<p>Result : "+ request.getAttribute("txt_n3") +"</p>");
		
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='index.jsp'>Index</a>");
		
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
