package com.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public MathServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 
		PrintWriter pw = response.getWriter();
		String output = "<h1>hello world </h1>";
		output +="<h2>WELCOME !!!!</h2>"; 
		pw.print(output);
		
		
   }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
