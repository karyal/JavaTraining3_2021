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

/**
 * Servlet implementation class Servlet4
 */
@WebServlet("/servlet5")
public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("id"));		
				
		MYJDBC2 jdbc = new MYJDBC2();
		boolean result = jdbc.delete_record(id);
		
		if(result ==true) {
			out.println("Record delete successfully!");
		}
		RequestDispatcher rd = request.getRequestDispatcher("servlet2");
		rd.forward(request, response);
		//out.println("<br/><br/><br/><br/><br/>");
		//out.println("<a href='servlet2'>Index</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
