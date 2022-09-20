package com.pooven;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		var temp = new Student();
		
		temp.setStudentId(Integer.parseInt(request.getParameter("student_id")));
		temp.setStudentName(request.getParameter("student_name"));
		temp.setAge(Integer.parseInt(request.getParameter("age")));
		temp.setPassport(Integer.parseInt(request.getParameter("passport")));
		temp.setCollegeId(Integer.parseInt(request.getParameter("college_id")));
		PrintWriter pw = response.getWriter();
	
//		addStudent(temp);
		
		pw.println("<h1>Record added......</h1>");
//		pw.println("<h3>"+request.getParameter("student_id")+"</h3>");
//		pw.println("<h3>"+request.getParameter("student_name")+"</h3>");
		
	    
		pw.println("<a href='/webapp/Student.html'>add one more Student</a>");
		
		
	}

	

	public void addStudent(Student student) {
		studentDao.addStudentRecord(student);
	}

}
