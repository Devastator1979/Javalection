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
            processRequest(request, response);
        }

    private void processRecuest(HttpServletRequest request, HttpServletResponse response) {
        throw ServletException, IOException{
            response.setContentType("text")
        }
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

