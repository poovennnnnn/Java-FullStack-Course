package com.servlet.config;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataReadServlet extends HttpServlet {

	
	private static final long serialVersionUID = 2869712939018111828L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		ServletContext  context = getServletContext();
		Guest guest = (Guest) context.getAttribute("guest");
	
		pw.println("<h3>");
		pw.print("Guest name is :"+ guest.getGuestName() +"- "+"Guest Id :"+guest.getGuestId());
		pw.println("</h3>");
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	
	}

}
