package com.sathya.servletex;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain");
    PrintWriter writer=response.getWriter();
	writer.println("This is first servlet");
	writer.println("Adv java class by ratan sir");
	writer.println("servlet application is very good");
	writer.println("ganesh having dummy laptop");
    } 
}
