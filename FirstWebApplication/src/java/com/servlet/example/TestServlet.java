package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
                processRecuest(request, response);
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            processRecuest(request, response);
        }

    private void processRecuest(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException{
            response.setContentType("text/html; character=UTF-8");
            PrintWriter out = response.getWriter();
            try{
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Servlet TestServlet</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<hi>Servlet TestServlet at"+request.getContextPath()+"</h1>");
            out.print("</body>");
            out.print("</html>");
            }
            finally{
                out.close();
            }
    }
}



 


