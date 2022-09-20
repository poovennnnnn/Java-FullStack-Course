package com.pooven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl {
	
	public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	public static final String 	USERNAME="root";
	public static final String  PASSWORD="POOven0708";
	public static final String  INSERT_COMMAND="INSERT INTO student VALUES(?,?,?,?,?)";
	public static final String  CONNECTION_STRING="jdbc:mysql://localhost:3306/sample";
	public static final String SELECT_COMMAND = "SELECT *from student";
	
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	Statement st = null;
	
	public Connection getConnection() {

		try {
			con = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		return con;
	}
	
	static {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		}
	}
	
	public void addStudentRecord(Student student) {
		
	
			try {
				con =getConnection();
				pst = con.prepareStatement(INSERT_COMMAND);
				pst.setInt(1, student.getStudentId());
				pst.setString(2, student.getStudentName());
				pst.setInt(3, student.getAge());
				pst.setInt(4, student.getPassport());
				pst.setInt(5, student.getCollegeId());
				pst.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public List<Student> getAllStudentRecord() {
		List<Student> studentList = new ArrayList<>();
	
		
		try {
//			con =getConnection();
//			st = con.createStatement();
//			rs = st.executeQuery("SELECT *from student");
			rs = getConnection().prepareStatement(SELECT_COMMAND).executeQuery();
			
			
			

			while(rs.next()) {
				
				Student temp = new Student();
				
				temp.setStudentId(rs.getInt(1));
				temp.setStudentName(rs.getString(2));
				temp.setAge(rs.getInt(3));
				temp.setPassport(rs.getInt(4));
				temp.setCollegeId(5);
				
				studentList.add(temp);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentList;
		
	}

}
