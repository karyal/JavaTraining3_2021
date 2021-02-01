package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import unit7.MYJDBC2;
import unit7.Person;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String full_name = request.getParameter("txt_name");
		String contact_address = request.getParameter("txt_address");
		Person person = new Person();
		person.setFull_name(full_name);
		person.setContact_address(contact_address);
		MYJDBC2 jdbc2 = new MYJDBC2();
		jdbc2.insert_record(person);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Insert Record Successfully");
		
		RequestDispatcher rd = request.getRequestDispatcher("servlet2");
		rd.forward(request, response);
		
		//out.println("<br><br><br><br><br><br>");
		//out.println("<a href = 'index.jsp'>Index</a>"); 

		
		out.flush();
		out.close();
		
	}
		
}

