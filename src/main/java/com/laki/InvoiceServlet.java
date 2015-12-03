package com.laki;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class InvoiceServlet extends HttpServlet {

    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        String user="lakshman";
        String password="udayakantha";

        PrintWriter pw=res.getWriter();

        pw.println("<h1> Welcome "+user+"</h1> <br/>");
        pw.println("<h2> Your Password is "+password+"</h2>");
    }
}
