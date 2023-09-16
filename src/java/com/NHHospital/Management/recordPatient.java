
package com.NHHospital.Management;


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class recordPatient extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
           
        
        response.setContentType("text/html;charset=UTF-8");
        Connection con=ConnectionProvider.getConnection();
        String temp;
        String pname=request.getParameter("pname");
        String fname=request.getParameter("fname");
        temp=request.getParameter("age");
        int age =Integer.parseInt(temp);
        String gender=request.getParameter("gender");
        temp=request.getParameter("contact");
        long contact=Long.parseLong(temp);
        String address=request.getParameter("address");
        String dname=request.getParameter("dname");
        String disease=request.getParameter("disease");
        temp=request.getParameter("recordNo");
        int recordNo=Integer.parseInt(temp);
        Date d=new Date(System.currentTimeMillis());
        String query="insert into patients(pname,fname,age,gender,contact,address,disease,doctor,previousRecordNo,dateofVisit) values(?,?,?,?,?,?,?,?,?,?)";
        try {
             PrintWriter out=   response.getWriter();
          PreparedStatement ps=  con.prepareStatement(query);
             ps.setString(1, pname);
             ps.setString(2,fname);
             ps.setInt(3, age);
             ps.setString(4,gender);
             ps.setLong(5, contact);
             ps.setString(6, address);
             ps.setString(7,disease);
             ps.setString(8, dname);
             ps.setInt(9, recordNo);
             ps.setDate(10, d);
             int count=ps.executeUpdate();
             con.close();
             ps.close();
             
             if(count>0)
             {    
                 RequestDispatcher rd=request.getRequestDispatcher("appointmentLetter");
                 rd.forward(request, response);
                 
             }
             else
             {
                 out.print("<p> record cannt be store </p>");
                 RequestDispatcher rd1=request.getRequestDispatcher("appointment.html");
                 rd1.forward(request, response);
                 
             }
             
        } 
        catch (Exception ex) {
            Logger.getLogger(recordPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    
            
            
        
    }

    
}
