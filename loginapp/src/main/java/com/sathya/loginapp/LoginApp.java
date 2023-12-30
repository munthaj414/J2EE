package com.sathya.loginapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("server at: ").append(request.getContextPath());
		//get the request
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		//process the request
		if(Username.equalsIgnoreCase("Munthaj")&&Password.equals("taj123"))
		{
			response.sendRedirect("http://www.sathyatech.com");
		}
		else
		{
			response.sendError(909,"the given credits are not matched");
		}
		
	}

}
