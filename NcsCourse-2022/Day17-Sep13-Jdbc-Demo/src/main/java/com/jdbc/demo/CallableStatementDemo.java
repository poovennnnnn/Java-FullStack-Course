package com.jdbc.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class CallableStatementDemo {
	private static final Logger log = LogManager.getLogger(JdbcDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		  Connection cn = null;
		  CallableStatement cst = null;
		  String connectionUrl = "jdbc:mysql://localhost:3306/sample";
		  String username = "root";
		  String password = "POOven0708";
		  String callString = "{CALL update_student_name(?,?)}";
			  
		  
		  
		  try {
			cn = DriverManager.getConnection(connectionUrl, username, password);
			log.debug("Connection Established");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("DB Connection Failed " +e.getMessage());
			
			e.printStackTrace();
		}
		  
		  try {
			cst = cn.prepareCall(callString);
			cst.setInt(1, 105);
			cst.setString(2, "new-name");
			cst.executeUpdate();
			log.debug("Statement Object Created ");
			log.debug("Row Created");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			log.error("Statement Object not Created{}",e.getMessage());
			e.printStackTrace();
		}
		  
		  
		  log.debug("Completed Program");
		 
	}

}





