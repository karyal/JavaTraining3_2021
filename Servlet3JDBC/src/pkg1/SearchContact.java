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
 * Servlet implementation class SearchContact
 */
@WebServlet("/searchContact")
public class SearchContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");				
		
		String search_term = request.getParameter("txt_search");
		//Contact contact = new Contact(sn, full_name, contact_address, email, phone);
		MyDatabase mydb = new MyDatabase();
		List contacts = mydb.searchV2(search_term);
		
		if(contacts.size() >=1) {
			out.println("Record found");
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<td>ID </td><td>NAME</td><td>ADDRESS</td><td>EMAIL</td><td>PHONE</td>");
			out.println("</tr>");
			
			for(int i=0; i<contacts.size(); i++) {
				Contact contact = (Contact) contacts.get(i);
				System.out.println(contact);
				out.println("<tr>");
				out.println("<td>"+ contact.getSn()+"</td><td>"+ contact.getName()+"</td><td>"+ contact.getAddress() +"</td><td>"+contact.getEmail()+"</td><td>"+contact.getPhone()+"</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			
		}
		else {
			out.println("Record not found!");
		}
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='home'>Index</a>");
		out.close(); 
		
	/*	int sn = Integer.parseInt(request.getParameter("sn"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		MyDatabase mydb = new MyDatabase();  
		Contact contact = mydb.search(sn, name, address, email, phone);
		System.out.println(contact);
		
		//Create web form
		PrintWriter out = response.getWriter();
		out.println("<h3>Contact Search Form</h3>");
		out.println("<form action='searchContact' method='get'>");
		out.println("<input type='text' name='txt_sn' value='"+ contact.getSn() +"'>");
		out.println("<p>SN <input type='text' value='"+ contact.getSn() +"'></p>");
		out.println("<p>NAME <input type='text' name='txt_name' value='"+ contact.getName() +"'></p>");
		out.println("<p>ADDRESS <input type='text' name='txt_address' value='"+ contact.getAddress() +"'></p>");
		out.println("<p>EMAIL <input type='text' name='txt_email' value='"+ contact.getEmail() +"'></p>");
		out.println("<p>PHONE <input type='text' name='txt_phone' value='"+ contact.getPhone() +"'></p>");
		out.println("<p><input type='submit' value='SEARCH'></p>");
		out.println("</form>");
		*/
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
