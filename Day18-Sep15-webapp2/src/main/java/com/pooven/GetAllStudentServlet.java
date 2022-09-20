package com.pooven;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetAllStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDaoImpl studentDao = new StudentDaoImpl();
  
    public GetAllStudentServlet() {
        super(); 
    }
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		ResultSet rs =  studentDao.getAllStudentRecord();
		List<Student> studentList = studentDao.getAllStudentRecord();
		PrintWriter pw = response.getWriter();
		
		
			
			   
//
//				String str = "";
//				while(rs.next()) {
//					
//					str+="<li>"; 
//					str += rs.getInt(1)+"       ";
//					str += rs.getString(2)+"       ";
//					str += rs.getInt(3)+"          ";
//					str += rs.getInt(4)+"                ";
//					str += rs.getInt(5)+"        ";
//					str+="</li>";
//					
//				}
//		
//				String result = "<body><h1>Student List</h1><ul>"+str+"</ul></body>";
//				
//				pw.println(result);
		
			pw.print("<body><ul>");
			studentList.forEach((student)-> {
				
				 pw.print("<li>");
				 
				 pw.print(student.getStudentId()+"-"+student.getStudentName()+"-"+student.getAge()+"-"+student.getPassport()+"-"+student.getCollegeId());
				 
				 pw.print("</li>");
				
			});
			pw.print("</ul></body>");
			
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
