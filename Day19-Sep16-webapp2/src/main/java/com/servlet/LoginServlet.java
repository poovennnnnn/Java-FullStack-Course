package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("http://www.google.com");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");
		String successUrl="sucess.html";
		String failUrl="login.html";
		RequestDispatcher rd = null;
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(userName.equals(password)) {
			rd = request.getRequestDispatcher(successUrl);
			rd.forward(request, response);
			
		}else {
			rd = request.getRequestDispatcher(failUrl);
			rd.forward(request, response);
			PrintWriter pw = response.getWriter();
			pw.println("<h3 style=color:red>Login failed...try agin</h3>");
			rd.include(request, response);
		}
		
		
		
	}

}
