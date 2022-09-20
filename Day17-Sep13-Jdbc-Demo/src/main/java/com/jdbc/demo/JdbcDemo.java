package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JdbcDemo {
	
	private static final Logger log = LogManager.getLogger(JdbcDemo.class);
	
  public static void main(String[] args) {
	  
	 
	
	  
	  Connection cn = null;
	  Statement st = null;
	  String connectionUrl = "jdbc:mysql://localhost:3306/sample";
	  String username = "root";
	  String password = "POOven0708";
	  String driverClass = "com.mysql.cj.jdbc.Driver";
	  String insertCommand = "INSERT INTO student VALUES(115,'jdbc',20,232232,203)";
	  String updateCommand = "update student set college_id = 202 where student_id = 103";
	  String selectCommand = "SELECT *from student";
	  int studentId = 116;
	  String name="pooven";
	  int age = 24;
	  int passport =234567;
	  int collegeId = 204;
//	  String insertCommand1 = "INSERT INto student VALUES({},{},{},{},{})";
	  
//	  try {
//		Class.forName(driverClass);
//		log.debug("Loaded the Driver class successfully");
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		log.error("Unable to load the Driver Class " +e.getMessage());
//	}
//	  
	  
	  
	  try {
		cn = DriverManager.getConnection(connectionUrl, username, password);
		log.debug("Connection Established");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		log.error("DB Connection Failed " +e.getMessage());
		
		e.printStackTrace();
	}
	  
	  try {
		st = cn.createStatement();
		log.debug("Statement Object Created ");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		
		log.error("Statement Object not Created{}",e.getMessage());
		e.printStackTrace();
	}
	  
	  int i = 0;
	
	  try {
		i = st.executeUpdate(insertCommand);
		log.debug("{} record inserted",insertCommand);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		log.error("Unable to insert records {}",e.getMessage());

	}
	 
}

}
