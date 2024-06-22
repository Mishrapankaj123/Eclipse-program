

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int count=0;
		int eid =Integer.parseInt(request.getParameter("t3"));
		String ename = request.getParameter("t1");
		double esal = Double.parseDouble(request.getParameter("t2"));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pankaj");
		   //PreparedStatement ps = con.prepareStatement("insert into pankaj values(?,?,?)");
		    Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("select* from pankaj where eid='"+eid+"'");
		    System.out.println(rs);
		    while(rs.next())
		    {
		    	count++;
		    }
		    if(count>0)
		    {
		    	out.println("eid already exist");
		    }
		    else
		    {
		    int i = stmt.executeUpdate("insert into pankaj values(?'?'?)");
		    ((PreparedStatement) stmt).setInt(1, eid);
		    ((PreparedStatement) stmt).setString(2, ename);
		    ((PreparedStatement) stmt).setDouble(3, esal);
		    
		    
		   
		    if(i==1)
		    {
		    	out.print("record inserted succesfully");
		    }
		    else
		    {
		    	out.print("record inserted falled");
		    }
		}
		}
		 
		catch(Exception e)
		{
			out.print(e);
		}
			
		
	}

	
}
