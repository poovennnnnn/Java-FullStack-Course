package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrepareStatementDemo {
	private static final Logger log = LogManager.getLogger(JdbcDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		  Connection cn = null;
		  PreparedStatement pst = null;
		  String connectionUrl = "jdbc:mysql://localhost:3306/sample";
		  String username = "root";
		  String password = "POOven0708";
		  String insertCommand ="INSERT INTO student VALUES(?,?,?,?,?)";
			  
		  
		  
		  try {
			cn = DriverManager.getConnection(connectionUrl, username, password);
			log.debug("Connection Established");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("DB Connection Failed " +e.getMessage());
			
			e.printStackTrace();
		}
		  
		  try {
			pst = cn.prepareStatement(insertCommand);
			log.debug("Statement Object Created ");
			
			
			pst.setInt(1, 124);
			pst.setString(2, "Jdbc2");
			pst.setInt(3, 16);
			pst.setInt(4, 123321);
			pst.setInt(5, 204);
			pst.executeUpdate();
			
			log.debug("Row Created");
			
			pst.setInt(1, 125);
			pst.setString(2, "Jdbc1");
			pst.setInt(3, 16);
			pst.setInt(4, 12123);
			pst.setInt(5, 203);
			pst.executeUpdate();
			
			log.debug("Row Created");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			log.error("Statement Object not Created{}",e.getMessage());
			e.printStackTrace();
		}
		  
		  
		  log.debug("Completed Program");
		 
	}

}
