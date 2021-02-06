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

@WebServlet("/insertContact")
public class InsertContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Receive values		
		int sn;
		String full_name, contact_address, email, phone;		
		sn = Integer.parseInt(request.getParameter("txt_sn"));
		full_name=request.getParameter("txt_name");
		contact_address=request.getParameter("txt_address");
		email=request.getParameter("txt_email");
		phone=request.getParameter("txt_phone");
		//Contact contact = new Contact(sn, full_name, contact_address, email, phone);
		MyDatabase mydb = new MyDatabase();
		boolean result = mydb.insert(sn, full_name, contact_address, email, phone);
		if(result == true) {
			out.println("Record Inserted!");
		}
		else {
			out.println("Error to insert record insert!");
		}
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='home'>Index</a>");
		out.close(); 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
