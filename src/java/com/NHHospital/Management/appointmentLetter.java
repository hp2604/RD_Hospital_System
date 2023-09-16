
package com.NHHospital.Management;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;



public class appointmentLetter extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
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
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Appointment Letter</title>"); 
            out.println(" <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">");
            out.println(" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>");
            out.println("<script> window.print()</script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>NK Hospital</h3>");
            out.println("<hr>");
           // out.println("<table><tr><td><h6>Name : " +pname+"</h6></td>" + "<td><h6>Disease : " +disease+"</h6></td></tr></table>");
             out.println("<div class=container><div class=row> <div class=col s4> <h6>Name :"+ pname+ "</h6></div>  <div class=col s4><h6>Age :"+ age + "</h6></div><div class=col s4><h6>Gender:"+ gender + "</h6></div></div></div>");
             out.println("<div class=container><div class=row> <div class=col s8> <h6>Doctor :"+ dname+ "</h6></div>  <div class=col s8><h6>Disease :"+ disease + "</h6></div></div></div>");
               
            //out.println("<div class=row><div class=col 4> <h6>Age :" +age+ "</h6></div>" + "<div class=col offset-s4><h6>gender" + gender+"</h6></div></div> " );
            out.println("<hr>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    

}
