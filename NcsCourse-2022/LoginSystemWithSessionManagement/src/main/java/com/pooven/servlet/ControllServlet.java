package com.pooven.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ControllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControllServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.sendRedirect(ValidateSession(request));
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public String ValidateSession(HttpServletRequest request) {
		   HttpSession session = request.getSession(false);
		    if (session == null) {
		        return "./index.html";
		    }
		    
		    return "./success.jsp";
		}


}
