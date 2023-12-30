package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ThirdServlet") 
public class ThirdServlet extends HttpServlet { 
 private static final long serialVersionUID = 1L; 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  // TODO Auto-generated method stub 
  //total 6-details = 4-details session 2-request  
    HttpSession session = request.getSession(false); 
     
    response.setContentType("text/html"); 
    PrintWriter writer = response.getWriter(); 
    writer.println("User name..."+session.getAttribute("username")); 
    writer.println("<br>"); 
    writer.println("User Age..."+session.getAttribute("age")); 
    writer.println("<br>"); 
    writer.println("User Qualifation..."+session.getAttribute("Qualification")); 
    writer.println("<br>"); 
    writer.println("User Dessignation..."+session.getAttribute("Designation")); 
    writer.println("<br>"); 
    writer.println("User mobile..."+request.getParameter("mobile")); 
    writer.println("<br>"); 
    writer.println("User Email..."+request.getParameter("email")); 
    
   } 
   
 
 }