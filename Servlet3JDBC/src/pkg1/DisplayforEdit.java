package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.Contact;
import jdbc.MyDatabase;


@WebServlet("/displayForEdit")
public class DisplayforEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sn = Integer.parseInt(request.getParameter("sn"));
		MyDatabase mydb = new MyDatabase();  
		Contact contact = mydb.search(sn);
		System.out.println(contact);
		
		//Create web form
		PrintWriter out = response.getWriter();
		out.println("<h3>Contact Update Form</h3>");
		out.println("<form action='updateContact' method='get'>");
		out.println("<input type='hidden' name='txt_sn' value='"+ contact.getSn() +"'>");
		out.println("<p>SN <input type='text' value='"+ contact.getSn() +"' disabled></p>");
		out.println("<p>NAME <input type='text' name='txt_name' value='"+ contact.getName() +"'></p>");
		out.println("<p>ADDRESS <input type='text' name='txt_address' value='"+ contact.getAddress() +"'></p>");
		out.println("<p>EMAIL <input type='text' name='txt_email' value='"+ contact.getEmail() +"'></p>");
		out.println("<p>PHONE <input type='text' name='txt_phone' value='"+ contact.getPhone() +"'></p>");
		out.println("<p><input type='submit' value='UPDATE'></p>");
		out.println("</form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
