package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LargestNumber
 */
@WebServlet("/LargestNumber")
public class LargestNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.print("====Check Largestnumber====<br></br>");
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		int num3 = Integer.parseInt(request.getParameter("n3"));
		if (num1 > num2 && num1 > num3) {
			pw.print("LargestNumber is :" + num1);
		} else if (num2 > num1 && num2 > num3) {
			pw.print("LargestNumber is :" + num2);
		} else {
			pw.print("LargestNumber is :" + num3);
		}

	}

}
