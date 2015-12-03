package com.laki;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Main extends HttpServlet{

    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {


        String requestedURIPath = request.getRequestURI();
        String modulePath = requestedURIPath.substring(requestedURIPath.lastIndexOf("/") + 1);

        if("invoice".equals(modulePath)){
            RequestDispatcher view = request.getRequestDispatcher("invoice.jsp");
            // don't add your web-app name to the path
            view.forward(request, response);
        }
        else{
            response.getWriter().write("<html><body>GET response</body></html>");
        }
    }
}
