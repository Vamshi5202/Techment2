package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public First(){
		System.out.println("constructor is called");
	}

	
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("init is called");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	
		System.out.println("destory is called");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("service is called");
	
	PrintWriter pw=response.getWriter();
	pw.print("service<br>");
	
	
	}

	
}
