
package com.NHHospital.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.NHHospital.dao.UserDao;
import com.NHHospital.entity.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class valid extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            String user_name= request.getParameter("user_name");
            String password= request.getParameter("user_password");
            User user=new User(user_name,password);
            UserDao ud=new UserDao();
            if(ud.verify(user))
            {
               HttpSession session=request.getSession();
               session.setAttribute("ActiveUser",user);
             RequestDispatcher rd=  request.getRequestDispatcher("appointment.jsp");
             rd.forward(request, response);
            }
            else
            {
                out.println("<h5> Wrong Id or Password</h5>");
                RequestDispatcher rd=  request.getRequestDispatcher("index.html");
                rd.forward(request, response);
                
            }
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(valid.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
