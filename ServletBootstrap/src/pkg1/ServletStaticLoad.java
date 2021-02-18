package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletStaticLoad extends HttpServlet {
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
		out.println("<html><head>");
		out.println("<title>Bootstrap Test Page</title>");
		//out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1' crossorigin='anonymous'>");
		out.println("<link href='assets/css/bootstrap.min.css' rel='stylesheet' type='text/css'>");
		out.println("</head><body>");
		out.println("<h2>Servlet</h2>");
		out.println("<h3>Image</h3>");
		out.println("<p><img src='assets/images/image1.png' width='50%' border='2'></p>");
		out.println("<p><img src='" + request.getContextPath() + "/assets/images/image2.png' alt='image' border='2'/></p>");
		
		out.println("<h3>Java Script</h3>");
		out.println("<input type='button' value='Click Me' onclick='test()'>");
		
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='index.jsp'>Index</a>");
		

		//out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js' integrity='sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW' crossorigin='anonymous'></script>");
		out.println("<script src='assets/js/bootstrap.bundle.min.js'></script>");	
		out.println("<script src='assets/js/test.js'></script>");
		out.println("</body></html>");
	}
}
