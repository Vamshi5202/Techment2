package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class found");
            Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/techment1?autoReconnect=true&useSSL=false", "root", "12345");
			System.out.println("connected");
	    	PreparedStatement ps=connection.prepareStatement("select * from REGISTERUSER where name=? and password=?");
	    	ps.setString(1, name);
	    	ps.setString(2, password);
	    	ResultSet rs=ps.executeQuery();
	    	if(rs.next()) {
	    		System.out.println("Welcome: "+rs.getString(1));
	    		pw.print("Successfully logged in");
	    	}
	    	else {
	    		pw.print("Invalid input credentials ");
	    		RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
	    	
	    	}
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
		
	}

}
