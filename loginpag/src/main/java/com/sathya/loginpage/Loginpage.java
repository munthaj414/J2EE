package com.sathya.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String status;
		if(username.equalsIgnoreCase("Munthaj")&&password.equals("taj@123"))
		{
			status="success";
		}
		else
		{
			status="fail";
		}
		response.setContentType("text/html");
		PrintWriter Writer=response.getWriter();
		Writer.println("login is"+status);
	}

}
