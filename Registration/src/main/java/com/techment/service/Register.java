package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/techment1?autoReconnect=true&useSSL=false", "root", "12345");
			
			System.out.println("connected");
			PreparedStatement ps=connection.prepareStatement("insert into REGISTERUSER values(?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, country);
			ps.execute();
			pw.print("successfully registered");
			
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
