package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.MyDatabase;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Getting value from Web Form
		String txt_user = request.getParameter("txt_user");
		String txt_pass = request.getParameter("txt_pass");		
		
		RequestDispatcher rd;
		
		MyDatabase mdb = new MyDatabase();
		boolean result = mdb.login(txt_user, txt_pass);
		
		//if((txt_user.equals("admin")) && (txt_pass.equals("admin@123"))) {
		if (result ==true) {
			out.print("Welcome "+txt_user);
			rd = request.getRequestDispatcher("home");
			rd.forward(request, response);
		}
		else {
			out.print("Error: user name or password!");
			rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}		
	}
}
