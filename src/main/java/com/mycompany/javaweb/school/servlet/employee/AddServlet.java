
package com.mycompany.javaweb.school.servlet.employee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addservlet",urlPatterns = {"/servlet/employee/add"})
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/plain;charset=utf-8");
       String empName = req.getParameter("empName");
       String empSalary = req.getParameter("empSalary");
       String empSex = req.getParameter("empSex");
       String empType = req.getParameter("empType");
       PrintWriter out = resp.getWriter();
       out.println("empName:" + empName);
       out.println("empSalary:" + empSalary);
       out.println("empSex:" + empSex);
       out.println("empType:" + empType);

    }
    
    
}