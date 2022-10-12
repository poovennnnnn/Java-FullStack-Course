package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.session.Customer;
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 4217335383163777633L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession session = request.getSession(true);
		Customer temp = null;

		String customerId;
		String customerName;
		String city;
		String zip;
		String mobile;
		String email;
		
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		
		if(pageNumber ==1) {
			customerId = request.getParameter("customerId");
			customerName = request.getParameter("customerName");
			temp = new Customer();
			temp.setCustomerId(customerId);
			temp.setCustomerNae(customerName);
			session.setAttribute("customer", temp);
			response.sendRedirect("./page2.html");
			
			
		}else if(pageNumber ==2) {
			
			city = request.getParameter("city");
			zip = request.getParameter("zip");
			temp = (Customer) session.getAttribute("customer");
			temp.setCity(city);
			temp.setZip(zip);
			session.setAttribute("customer", temp);
			response.sendRedirect("./page3.html");
			
		}else {
			mobile = request.getParameter("mobile");
			email = request.getParameter("email");
			temp = (Customer) session.getAttribute("customer");
			temp.setCity(mobile);
			temp.setZip(email);
			session.setAttribute("customer", temp);
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.println("<h1>Customer Info</h1>");
			pw.println("<h4>");
			pw.println(temp.getCustomerId()+":"+temp.getCustomerNae()+":"+temp.getCity()+":"+temp.getZip()+":"+temp.getMobile()+":"+temp.getEmail());
		
			pw.println("</h4>");
			pw.println("Session creation Time : "+session.getCreationTime());
			pw.println("Session id  : "+session.getId());
			session.invalidate();
			
		}

	}

}
