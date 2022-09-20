package com.servlet.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DataStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);

		response.setContentType("text/html");

		int guestId = Integer.parseInt(request.getParameter("guestId"));
		String guestName = request.getParameter("guestName");

		Guest guest = new Guest(guestId,guestName);

		ServletContext  context = getServletContext();
		context.setAttribute("guest",guest );

		PrintWriter pw = response.getWriter();
		pw.println("<h3>data stored in context......</h3>");
		pw.println("<a href='/webapp/DataReadServlet'>Get it from DataRead servlet");

		//		RequestDispatcher rd = request.getRequestDispatcher("/DataReadServlet");
		//		rd.forward(request, response);
		//		

	}

}
