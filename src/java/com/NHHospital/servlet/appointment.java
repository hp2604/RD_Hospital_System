package com.NHHospital.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import com.NHHospital.entity.Patient;
import com.NHHospital.dao.PatientDao;
import jakarta.servlet.RequestDispatcher;

public class appointment extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Appointment</title>");            
            out.println("</head>");
            out.println("<body>");
            String name=request.getParameter("pname");
            String fname=request.getParameter("fname");
            int age=Integer.parseInt(request.getParameter("age"));
            String gender =request.getParameter("gender");
            String contact =request.getParameter("contact");
            String address=request.getParameter("address" );
            String dname=request.getParameter("dname");
            String disease=request.getParameter("disease");
            String app_date=request.getParameter("appointment_date");
            DateTimeFormatter form=DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate app=LocalDate.parse(app_date, form);
            Date appointment_date= Date.valueOf(app);
            Patient p=new Patient(name,fname,gender,contact,address,dname,disease,age);
            p.setAppointment_date(appointment_date);
            PatientDao pd= new PatientDao();
           if( pd.savePatient(p))
           {
              request.setAttribute("details", p);
             RequestDispatcher rd=  request.getRequestDispatcher("AppointmentLetter.jsp");
             rd.forward(request, response);
           }
           else
           {
               System.out.println("cant save in db");
           }
            
            out.println("</body>");
            out.println("</html>");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

   

}
