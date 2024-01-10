
package com.NHHospital.connection;
import java.sql.*;

public class ConnectionProvider {
    private static Connection c;
    public static Connection  getConnection() 
    {
       String url="jdbc:mysql://localhost:3306/Hospital";
       String username="root";
       String password="Harsh2604";
      try
      {
           Class.forName("com.mysql.cj.jdbc.Driver");
      
           c= DriverManager.getConnection(url,username,password);
           
          
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
       return c;
     
     }
    
}


