package com.sathya;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//get the requested data  
	  String qualification = request.getParameter("qualification"); 
	  String designation = request.getParameter("designation"); 
	   
	  //create the session Object  
	  HttpSession session = request.getSession(false); 
	   
	  //Place the data into session object 
	  session.setAttribute("qualification", qualification); 
	  session.setAttribute("designation",designation); 
	   
	  //forward the request to next form  
	  RequestDispatcher dispatcher = request.getRequestDispatcher("Form3.html"); 
	  dispatcher.forward(request, response); 
	 } 
	 
	 
	}


