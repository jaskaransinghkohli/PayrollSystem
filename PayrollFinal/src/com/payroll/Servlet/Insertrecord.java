package com.payroll.Servlet;


/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import java.io.*;

/**
 *
 * @author Ravi
 */
public class Insertrecord extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String a=request.getParameter("ec");
        String b=request.getParameter("name");
        String c=request.getParameter("fname");
        String d=request.getParameter("add");
        String e=request.getParameter("add2");
        String f=request.getParameter("add3");
        String g=request.getParameter("phone");
        String img=request.getParameter("file");
        
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
            PreparedStatement ps1=con1.prepareStatement("insert into insertrecord values(?,?,?,?,?,?,?,?)");
            ps1.setString(1,a);
            ps1.setString(2,b);
            ps1.setString(3,c);
            ps1.setString(4,d);
            ps1.setString(5,e);
            ps1.setString(6,f);
            ps1.setString(7,g);
           ps1.setString(8,img);
            /* FileInputStream fs=new FileInputStream("img");
            ps1.setBinaryStream(8,fs,fs.available());*/
            int i=ps1.executeUpdate();
            if(i>0)
            {
                
                
                RequestDispatcher rd=request.getRequestDispatcher("Userform.html");
                rd.include(request, response);
                out.println("<strong style='position:absolute;top:300px;left:350px'>Successfully Insert<strong>");
            }
            else
            {
                out.print("<h1>Error</h1>");
            }
        } 
        catch(Exception e)
        {
                System.out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
