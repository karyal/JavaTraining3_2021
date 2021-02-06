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

/**
 * Servlet implementation class UpdateContact
 */
@WebServlet("/updateContact")
public class UpdateContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int sn = Integer.parseInt(request.getParameter("txt_sn"));
		String name = request.getParameter("txt_name");
		String address = request.getParameter("txt_address");
		String email = request.getParameter("txt_email");
		String phone = request.getParameter("txt_phone");
		//System.out.println(", "+name+", "+address+", "+email+", "+phone);
		
		Contact contact = new Contact(sn, name, address, email, phone);		
		MyDatabase mydb = new MyDatabase();		
		boolean result = mydb.update(contact);
		
		if(result == true) {
			out.println("Record update!");
		}
		else {
			out.println("Error to update record!");
		}
		
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='home'>Index</a>");
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
