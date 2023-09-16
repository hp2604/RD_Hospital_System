
package com.NHHospital.Management;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class valid extends HttpServlet {
    Connection con=ConnectionProvider.getConnection();
     
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {   
        PrintWriter out=   response.getWriter();
        response.setContentType("text/html");
        String username=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String query="select * from user where username=? and passwords=?";
        try {
             PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2, password);
           ResultSet rs= ps.executeQuery();
           if(rs.next())
           {
              RequestDispatcher rd= request.getRequestDispatcher("appointment.html");
              rd.forward(request, response);
           }
           else
               
           {  out.print("<p> wrong username or password</p>");
               RequestDispatcher rd1=request.getRequestDispatcher("index.html");
               rd1.forward(request, response);
           }
           
        } 
        catch (Exception ex) {
            Logger.getLogger(valid.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    
}
