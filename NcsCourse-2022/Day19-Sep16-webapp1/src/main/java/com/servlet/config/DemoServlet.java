package com.servlet.config;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
//	
//	public void init(ServletConfig config) {
//		this.config = config;
//	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		config = getServletConfig();
		
		String fname= config.getInitParameter("firstName");
		System.out.println(fname);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
