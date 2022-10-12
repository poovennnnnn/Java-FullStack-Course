package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentDaoImpl studentDao = new StudentDaoImpl();

    public AddStudentServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		PrintWriter pw = response.getWriter();
	
		Student temp = (Student) request.getAttribute("s1");
		addStudent(temp);
		RequestDispatcher rd = request.getRequestDispatcher("/GetAllStudentServlet");
		rd.forward(request, response);
		
//		pw.println("<h1>Record added......</h1>");
//		pw.println("<h3>"+request.getParameter("student_id")+"</h3>");
//		pw.println("<h3>"+request.getParameter("student_name")+"</h3>");
		
	    
//		pw.println("<a href='/app/Student.html'>add one more Student</a>");
		
		
	}

	

	public void addStudent(Student student) {
		studentDao.addStudentRecord(student);
	}

}
