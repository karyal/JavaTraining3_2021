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
 * Servlet implementation class Servlet4
 */
@WebServlet("/servlet4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("txt_id"));
		String full_name = request.getParameter("txt_name");
		String contact_address = request.getParameter("txt_address");
		
		Person person = new Person(id, full_name, contact_address);
		MYJDBC2 jdbc = new MYJDBC2();
		boolean result = jdbc.update_record(person);
		
		if(result ==true) {
			out.println("Record update successfully!");
		}
		
		out.println("<br/><br/><br/><br/><br/>");
		out.println("<a href='servlet2'>Index</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
