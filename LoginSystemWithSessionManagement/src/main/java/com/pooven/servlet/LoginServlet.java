package com.pooven.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pooven.dao.UserDaoImpl;
import com.pooven.dto.User;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UserDaoImpl dao = null;

    public LoginServlet() {
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
		
		User user = dao.getUserByUsername(userName);
		
		
		if(user == null ) {
		
			System.out.println("user is null: "+ user);
			response.sendRedirect("./index.html");
			
		}else {

			System.out.println(user);
			if(userName.equals(user.getUserName()) && password.equals(user.getPassword()) ) {
				
				HttpSession session = request.getSession(true);
				session.setAttribute("user", user);
				
				
				response.sendRedirect("/app/ControllServlet");
			}else {
				System.out.println("error");
				response.sendRedirect("./index.html");
			}
		}
		
		
	}

}
