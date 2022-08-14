package com.payroll.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payroll.bean.Emp;
import com.payroll.beanDao.Empdata;

import java.sql.*;

/**
 *
 * @author Jaskaran
 */
public class ViewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Employee list<h1>");
            List<Emp> list=Empdata.getAllEmployees();
            try{
                int sum=0;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","ravikr");
                PreparedStatement ps=con.prepareStatement("select ECODE,sum(case when d1='P' OR d1='PA' OR d1='PC' then 1 else 0 end)+sum(case when d2='P' OR d2='PA' OR d2='PC' then 1 else 0 end)+sum(case when d3='P' OR d3='PA' OR d3='PC' then 1 else 0 end)+sum(case when d4='P' OR d4='PA' OR d4='PC' then 1 else 0 end)+sum(case when d5='P' OR d5='PA' OR d5='PC' then 1 else 0 end)+sum(case when d6='P' OR d6='PA' OR d6='PC' then 1 else 0 end)+sum(case when d7='P' OR d7='PA' OR d7='PC' then 1 else 0 end)+sum(case when d8='P' OR d8='PA' OR d8='PC' then 1 else 0 end)+sum(case when d9='P' OR d9='PA' OR d9='PC' then 1 else 0 end)+sum(case when d10='P' OR d10='PA' OR d10='PC' then 1 else 0 end)+sum(case when d11='P' OR d11='PA' OR d11='PC' then 1 else 0 end)+sum(case when d12='P' OR d12='PA' OR d12='PC' then 1 else 0 end)+sum(case when d13='P' OR d13='PA' OR d13='PC' then 1 else 0 end)+sum(case when d14='P' OR d14='PA' OR d14='PC' then 1 else 0 end)+sum(case when d15='P' OR d15='PA' OR d15='PC' then 1 else 0 end)+sum(case when d16='P' OR d16='PA' OR d16='PC' then 1 else 0 end)+sum(case when d17='P' OR d17='PA' OR d17='PC' then 1 else 0 end)+sum(case when d18='P' OR d18='PA' OR d18='PC' then 1 else 0 end)+sum(case when d19='P' OR d19='PA' OR d19='PC' then 1 else 0 end)+sum(case when d20='P' OR d20='PA' OR d20='PC' then 1 else 0 end)+sum(case when d21='P' OR d21='PA' OR d21='PC' then 1 else 0 end)+sum(case when d22='P' OR d22='PA' OR d22='PC' then 1 else 0 end)+sum(case when d23='P' OR d23='PA' OR d23='PC' then 1 else 0 end)+sum(case when d24='P' OR d24='PA' OR d24='PC' then 1 else 0 end)+sum(case when d25='P' OR d25='PA' OR d25='PC' then 1 else 0 end)+sum(case when d26='P' OR d26='PA' OR d26='PC' then 1 else 0 end)+sum(case when d27='P' OR d27='PA' OR d27='PC' then 1 else 0 end)+sum(case when d28='P' OR d28='PA' OR d28='PC' then 1 else 0 end)+sum(case when d29='P' OR d29='PA' OR d29='PC' then 1 else 0 end)+sum(case when d30='P' OR d30='PA' OR d30='PC' then 1 else 0 end)+sum(case when d31='P' OR d31='PA' OR d31='PC' then 1 else 0 end) as p,EMP_NAME,SHIFT,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27,D28,D29,D30,D31 from atten2 GROUP BY ID");
                ResultSet rs=ps.executeQuery(); 
            out.println("<table style='position:absolute;top:270px;left:350px' border='1' width='100%'>");
            out.println("<tr><th>EmpCode</th><th>Emp_name</th><th>shift</th><th>D1</th><th>D2</th><th>D3</th><th>D4</th><th>D5</th><th>D6</th><th>D7</th><th>D8</th><th>D9</th><th>D10</th><th>D11</th><th>D12</th><th>D13</th><th>D14</th><th>D15</th><th>D16</th><th>D17</th><th>D18</th><th>D19</th><th>D20</th><th>D21</th><th>D22</th><th>D23</th><th>D24</th><th>D25</th><th>D26</th><th>D27</th><th>D28</th><th>D29</th><th>D30</th><th>D31</th>TOT</th></tr>");
                     while(rs.next())
                    {
                        String ecode=rs.getString(1);
                      int i=rs.getInt(2);
                      String empname=rs.getString(3);
                      String shift=rs.getString(4);
                      String d1=rs.getString(5);
                      String d2=rs.getString(6);
                      String d3=rs.getString(7);
                      String d4=rs.getString(8);
                      String d5=rs.getString(9);
                      String d6=rs.getString(10);
                      String d7=rs.getString(11);
                      String d8=rs.getString(12);
                      String d9=rs.getString(13);
                      String d10=rs.getString(14);
                      String d11=rs.getString(15);
                      String d12=rs.getString(16);
                      String d13=rs.getString(17);
                      String d14=rs.getString(18);
                      String d15=rs.getString(19);
                      String d16=rs.getString(20);
                      String d17=rs.getString(21);
                      String d18=rs.getString(22);
                      String d19=rs.getString(23);
                      String d20=rs.getString(24);
                      String d21=rs.getString(25);
                      String d22=rs.getString(26);
                      String d23=rs.getString(27);
                      String d24=rs.getString(28);
                      String d25=rs.getString(29);
                      String d26=rs.getString(30);
                      String d27=rs.getString(31);
                      String d28=rs.getString(32);
                      String d29=rs.getString(33);
                      String d30=rs.getString(34);
                      String d31=rs.getString(35);
                      
                      sum=sum+i;
                //    out.print("<tr><td>"+s+"</td><td>"+sum+"</td>");
                    
                    out.println("<td>"+ecode+"</td><td>"+empname+"</td><td>"+shift+"</td><td>"+d1+"</td><td>"+d2+"</td><td>"+d3+"</td><td>"+d4+"</td><td>"+d5+"</td><td>"+d6+"</td><td>"+d7+"</td><td>"+d8+"</td><td>"+d9+"</td><td>"+d10+"</td><td>"+d11+"</td><td>"+d12+"</td><td>"+d13+"</td><td>"+d14+"</td><td>"+d15+"</td><td>"+d16+"</td><td>"+d17+"</td><td>"+d18+"</td><td>"+d19+"</td><td>"+d20+"</td><td>"+d21+"</td><td>"+d22+"</td><td>"+d23+"</td><td>"+d24+"</td><td>"+d25+"</td><td>"+d26+"</td><td>"+d27+"</td><td>"+d28+"</td><td>"+d29+"</td><td>"+d30+"</td><td>"+d31+"</td><td>"+sum+"</td></tr>");
                     sum=0;
                    
                    }
           // }
            
            
             
            
            out.println("</body>");
            out.println("</html>");
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
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
