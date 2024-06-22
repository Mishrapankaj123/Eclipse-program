

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dispay
 */
@WebServlet("/Dispay")
public class Dispay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		  
        PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><body>");  
        try 
        {  
        	Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pankaj");  
           
            Statement stmt = (Statement) con.createStatement();  
            ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from pankaj");  
            out.println("<table border=1 width=50% height=50%>");  
            out.println("<tr><th>eid</th><th>ename</th><th>esal</th><tr>");  
            while (rs.next()) 
            {  
                int n = rs.getInt("eid");  
                String nm = rs.getString("ename");  
                double  s = rs.getDouble("esal");   
                out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
            }  
            out.println("</table>");  
            out.println("</html></body>");  
            con.close();  
           }  
            catch (Exception e) 
           {  
            out.println("pankaj");  
        }  
    }  

	}


