package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import unit7.MYJDBC2;
import unit7.Person;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		MYJDBC2 jdbc = new MYJDBC2(); 
		
		ArrayList contacts = jdbc.select_records();
		out.println("<a href='form1.jsp'>ADD NEW</a>");
		out.println("<table border='2'>");
		out.println("<tr>");
		out.println("<td>ID</td><td>NAME</td><td>ADDRESS</td><td>CONTROL</td>");
		out.println("</tr>");
		
		for (int i=0; i<contacts.size(); i++) {
			Person person = (Person) contacts.get(i);
			//System.out.println(person.getId()+",  "+person.getFull_name()+", "+person.getContact_address());
			out.println("<tr>");
			out.println("<td>"+person.getId()+"</td><td>"+person.getFull_name()+"</td><td>"+person.getContact_address()+"</td><td><a href=servlet3?id="+ person.getId() +">EDIT</a> | <a href=servlet5?id="+ person.getId() +">DELETE</a> </td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.flush();
		out.close();
	}
}
