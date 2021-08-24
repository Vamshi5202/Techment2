package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/userLogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
   System.out.println("Hello this is my first servlet <br></br>");
	
	
	PrintWriter out=response.getWriter();
	out.print("Hello this is my first servlet <br></br>");
	
	String name=request.getParameter("u");
	String pass=request.getParameter("p");
	int nameLength=name.length();
	System.out.println("size of "+name+" is "+nameLength );
	out.print("your name is "+name +"length is "+nameLength);
	
	
	
	
	
	
	}

}
