

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
 * Servlet implementation class BookRregistration
 */
@WebServlet("/BookRregistration")
public class BookRregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BookRregistration() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String bookNmae = request.getParameter("bookNmae");
		String bookEdition = request.getParameter("bookEdition");
		double bookPrice = Double.parseDouble(request.getParameter("bookPrice"));
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pankaj");
		    PreparedStatement ps = con.prepareStatement("insert into Book values(?,?,?)");
		     
		    ps.setString(1, bookNmae);
		    ps.setString(2, bookEdition);
		    ps.setDouble(3, bookPrice);
		    int i = ps.executeUpdate();
		    con.close();
		    if(i==1)
		    {
		    	out.print("<center>Record Inserted Successfully</center>");
		    }
		    else
		    {
		    	out.print("record inserted falled");
		    }
		}
		catch(Exception e)
		{
			out.print(e);
		}
		out.println("<br>");
		out.println("<a href='BookRegistration.html'><center><h5> Home </h5><center></a>");
		out.println("<br>");
		out.println("<a href='BookList'><center><h5> Book List</h5><center></a>");
			
	}
	

}
