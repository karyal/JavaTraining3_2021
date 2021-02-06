package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.Contact;
import jdbc.MyDatabase;

/**
 * Servlet implementation class Home
 */

@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Display All Records
		MyDatabase mydb = new MyDatabase();
		List contacts = mydb.get_all();
		//System.out.println(contacts.size());		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<p><a href='form1.jsp'>NEW RECORD</a>");
		out.println("| <a href='form2.jsp'>RECORD SEARCH </a></p>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td>SN </td><td>NAME</td><td>ADDRESS</td><td>EMAIL</td><td>PHONE</td><td>CONTROL</td>");
		out.println("</tr>");
				
		for(int i=0; i<contacts.size(); i++) {
			Contact contact = (Contact) contacts.get(i);
			System.out.println(contact);
			out.println("<tr>");
			out.println("<td>"+ contact.getSn()+"</td><td>"+ contact.getName()+"</td><td>"+ contact.getAddress() +"</td><td>"+contact.getEmail()+"</td><td>"+contact.getPhone()+"</td><td><a href=displayForEdit?sn="+ contact.getSn()+">EDIT</a> | <a href=deleteContact?sn="+ contact.getSn() +">DELETE</a></td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
