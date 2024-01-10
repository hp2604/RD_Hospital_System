package com.NHHospital.filter;
import com.NHHospital.entity.User;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;


public class LoginAuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
      
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
      HttpServletRequest req=(HttpServletRequest) sr;
      HttpSession session=req.getSession();
      User user=(User)session.getAttribute("ActiveUser");
      if(user!=null)
      {
          fc.doFilter(sr, sr1);
      }
      else
      {
         RequestDispatcher rd=sr.getRequestDispatcher("index.html");
         rd.forward(sr, sr1);
         
      }
    }

    @Override
    public void destroy() {
       
    }
    
}
