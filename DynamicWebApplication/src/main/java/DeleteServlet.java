

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int eid =Integer.parseInt(request.getParameter("id"));
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pankaj");
		    PreparedStatement ps = con.prepareStatement("delete from pankaj where eid=?");
		    ps.setInt(1, eid);
		    int i = ps.executeUpdate();
		   
		    if(i==1)
		    {
		    	out.print("record deleted succesfully");
		    }
		    else
		    {
		    	out.print("record deleted falled");
		    }
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

	

}
