

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookList
 */
@WebServlet("/BookList")
public class BookList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pankaj");
		    PreparedStatement ps = con.prepareStatement("select* from Book");
		    ResultSet rs = ps.executeQuery();
		    out.println("<table border ='1' align='center'>");
		    out.println("<tr>");
		    out.println("<th> Book Name </th>");
		    out.println("<th> Book Edition </th>");
		    out.println("<th> Book Price </th>");
		    out.println("<th> Edit </th>");
		    out.println("<th> Delete </th>");
		    out.println("</tr>");
		    
		    while(rs.next())
		    {
		    	 out.print("<tr>");
				    out.println("<td>"+rs.getString(1)+ "</td>");
				    out.println("<td>"+rs.getString(2)+ "</td>");
				    out.println("<td>"+rs.getDouble(3)+ "</td>");
				    out.println("<td><a href ='editure?bookNmae="+rs.getString(1)+"'>Edit</a></td>");
				    out.println("<td><a href ='editure?bookNmae="+rs.getString(1)+"'>Delete</a></td>");
				    out.println("</tr>");
		    }
		    out.println("</table>");
		    
		   
		}
		catch(Exception e)
		{
			out.print(e);
		}
		
		out.println("<center><a href='BookRegistration.html'><h1> Home </h1></a></center>");
			
	}

}
