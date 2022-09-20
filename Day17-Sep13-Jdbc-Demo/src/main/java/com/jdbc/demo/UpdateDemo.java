package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpdateDemo {

	private static final Logger logger = LogManager.getLogger(UpdateDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection cn =null;
		Statement st = null;
		String url = "jdbc:mysql://localhost:3306/sample";
		String userName = "root";
		String password ="POOven0708";
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String updateCommand = "update student set college_id = 202 where student_id = 103";
 
		  try {
			cn = DriverManager.getConnection(url, userName, password);
			logger.debug("Connection Created");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Connection not created");
		  
		}
		  
		  try {
			st =cn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
		  int i = 0;
			
		  try {
			i = st.executeUpdate(updateCommand);
			logger.debug("{} record inserted",updateCommand);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Unable to insert records {}",e.getMessage());

		}
		

	}

}
