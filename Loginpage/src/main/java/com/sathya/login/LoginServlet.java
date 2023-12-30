package com.sathya.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.PasswordAuthentication;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//using forward &include
    	
    	//get the request data
    	String username=request.getParameter("username");
    	String password=request.getParameter("password");
    	//process the data
    	if(username.equalsIgnoreCase("Munthaj") && password.equals("taj@123"))
    	{
    		RequestDispatcher dispatcher=request.getRequestDispatcher("success.html");
    		dispatcher.forward(request, response);
    	}
    	else
    	{
    		response.setContentType("text/html");
    		PrintWriter writer=response.getWriter();
    		RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
    		dispatcher.include(request, response);
    		writer.println("Login fail...try with valid data");
    		
    		}
	
	}

}
