package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import unit7.MYJDBC2;
import unit7.Person;


/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Decalre		
		PrintWriter out = response.getWriter();
		int contact_id; 
		
		//Input
		contact_id = Integer.parseInt(request.getParameter("id"));
		
		//Search Record on database
		MYJDBC2 jdbc = new MYJDBC2();
		Person person = jdbc.search_record(contact_id);
		
		//output
		response.setContentType("text/html");
		
		out.println(person.getId());
		out.println(person.getFull_name());
		out.println(person.getContact_address());
		
		out.println("<h3>Person Update Form</h3>");
		out.println("<form action='servlet4' method='get'>");
		out.println("<input type='hidden' name='txt_id' value='"+ person.getId() +"'>"); //send to other servlet
		out.println("<p>ID <input type='text' value='"+ person.getId() +"' disabled></p>");//only to display
		out.println("<p>NAME <input type='text' name='txt_name' value='"+ person.getFull_name() +"'></p>");
		out.println("<p>ADDRESS <input type='text' name='txt_address' value='"+ person.getContact_address() +"'></p>");
		out.println("<p><input type='submit' value='UPDATE'></p>");
		out.println("</form>");
		
		out.flush();
		out.close();		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
