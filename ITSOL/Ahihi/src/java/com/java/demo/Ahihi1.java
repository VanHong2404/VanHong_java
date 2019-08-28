/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hong Beo
 */
@WebServlet(urlPatterns = {"/Ahihi1"})
public class Ahihi1 extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentServlet</title>");
            out.println("</head>");
            out.println("<body>");
        
            out.println("<h1>Danh sách sinh viên</h1>");
     
            Login lg = new Login();
            List<Student> students = lg.getStudents();
            

            out.println("Danh sach hoc sinh!");
              out.println("<table border='1'>");
              out.println("<tr>");
              out.println("<th>acount</th>");
              out.println("<th>id</th>");
              out.println("<th>name</th>");
              out.println("<th>email</th>");
              out.println("<th>phone</th>");
              out.println("<th>class</th>");
              out.println("<th>note</th>");

            for (Student student : students) {
                out.println("<tr>");
              out.println("<td>"+student.getAccount()+"</td>");
              out.println("<td>"+student.getId()+"</td>");
              out.println("<td>"+student.getName()+"</td>");
              out.println("<td>"+student.getEmail()+"</td>");
              out.println("<td>"+student.getPhone()+"</td>");
              out.println("<td>"+student.getClass1()+"</td>");
              out.println("<td>"+student.getNote()+"</td>");
              out.println("</tr>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
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
