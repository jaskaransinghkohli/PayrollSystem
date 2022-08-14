package com.payroll.beanDao;

import java.sql.*;
import java.util.*;

import com.payroll.bean.Emp;
public class Empdata {
    public static Connection getConnection()
    
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    public static int save(Emp e)
    {
        int status=0;
        try
        {
            Connection con=Empdata.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into atten2 (MONTHS,ECODE,EMP_NAME,SHIFT,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27,D28,D29,D30,D31) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,e.getMonth());
            ps.setString(2,e.getEcode());
            ps.setString(3,e.getFname());
            ps.setString(4,e.getDay());
            ps.setString(5,e.getD1());
            ps.setString(6,e.getD2());
            ps.setString(7,e.getD3());
            ps.setString(8,e.getD4());
            ps.setString(9,e.getD5());
            ps.setString(10,e.getD6());
            ps.setString(11,e.getD7());
            ps.setString(12,e.getD8());
            ps.setString(13,e.getD9());
            ps.setString(14,e.getD10());
            ps.setString(15,e.getD11());
            ps.setString(16,e.getD12());
            ps.setString(17,e.getD13());
            ps.setString(18,e.getD14());
            ps.setString(19,e.getD15());
            ps.setString(20,e.getD16());
            ps.setString(21,e.getD17());
            ps.setString(22,e.getD18());
            ps.setString(23,e.getD19());
            ps.setString(24,e.getD20());
            ps.setString(25,e.getD21());
            ps.setString(26,e.getD22());
            ps.setString(27,e.getD23());
            ps.setString(28,e.getD24());
            ps.setString(29,e.getD25());
            ps.setString(30,e.getD26());
            ps.setString(31,e.getD27());
            ps.setString(32,e.getD28());
            ps.setString(33,e.getD29());
            ps.setString(34,e.getD30());
            ps.setString(35,e.getD31());
            
            
            
            status=ps.executeUpdate();
            con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return status;
    }
    
    public static List<Emp> getAllEmployees()
    {
        List<Emp> list=new ArrayList<>();
        try{
            Connection con=Empdata.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from atten");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Emp e=new Emp();
            e.setMonth(rs.getString(1));
            e.setEcode(rs.getString(2));
            e.setFname(rs.getString(3));
            e.setDay(rs.getString(4));
            e.setD1(rs.getString(5));
            e.setD2(rs.getString(6));
            e.setD3(rs.getString(7));
            e.setD4(rs.getString(8));
            e.setD5(rs.getString(9));
            e.setD6(rs.getString(10));
            e.setD7(rs.getString(11));
            e.setD8(rs.getString(12));
            e.setD9(rs.getString(13));
            e.setD10(rs.getString(14));
            e.setD11(rs.getString(15));
            e.setD12(rs.getString(16));
            e.setD13(rs.getString(17));
            e.setD14(rs.getString(18));
            e.setD15(rs.getString(19));
            e.setD16(rs.getString(20));
            e.setD17(rs.getString(21));
            e.setD18(rs.getString(22));
            e.setD19(rs.getString(23));
            e.setD20(rs.getString(24));
            e.setD21(rs.getString(25));
            e.setD22(rs.getString(26));
            e.setD23(rs.getString(27));
            e.setD24(rs.getString(28));
            e.setD25(rs.getString(29));
            e.setD26(rs.getString(30));
            e.setD27(rs.getString(31));
            e.setD28(rs.getString(32));
            e.setD29(rs.getString(33));
            e.setD30(rs.getString(34));
            e.setD31(rs.getString(35));
           
                list.add(e);
            }
            con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
                
        return list;
    }
    
}
