package com.pooven.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pooven.dao.UserDaoImpl;
import com.pooven.dto.User;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      UserDaoImpl dao; 

    public RegisterServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
	dao = new UserDaoImpl();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userName == null || password == null) {
			response.sendRedirect("./index.html");
		}
		
		User user = new User(userName, password);
		
		dao.addUserRecord(user);
		
		response.sendRedirect("./index.html");
		
		
	}

}
