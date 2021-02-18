package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookies extends HttpServlet {
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
		
		//Create Cookies
		Cookie cookie1 = new Cookie("user_name", "admin"); //Declare and Initialize
		cookie1.setComment("Comment-1");
		cookie1.setMaxAge(60*60*24);
		//cookie1.setPath("/tmp");
		cookie1.setSecure(true);
		cookie1.setVersion(1);
		response.addCookie(cookie1); //Add Cookies (Store)
		out.println("<h3>Create Cookie!</h3>");

		//Getting Cookies		
		Cookie cookies[] = request.getCookies();
		System.out.println("Total Cookies : "+ cookies.length);
		out.println("Display Cookies!");
		for(int i=0; i<cookies.length; i++) {
			out.println("<p>"+cookies[i].getName()+" = "+cookies[i].getValue()+"</p>");
		}						
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<p><a href='index.jsp'>Index</a></p>");				
		
		out.close();
	}
}