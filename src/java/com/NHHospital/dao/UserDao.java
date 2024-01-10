package com.NHHospital.dao;
import java.sql.*;
import com.NHHospital.connection.ConnectionProvider;
import com.NHHospital.entity.User;
        
public class UserDao {
//   Get Connection 
    private Connection con=ConnectionProvider.getConnection();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean status=false;
    
//    Verfication of valid user or not
    public boolean verify(User u) throws SQLException
    {
        String query="select * from users where username=? and pass=?";
        ps=con.prepareStatement(query);
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getPassword());
        rs= ps.executeQuery();
        while(rs.next())
        {
            status=true;
        }
        return status;
    }
    
    
}
