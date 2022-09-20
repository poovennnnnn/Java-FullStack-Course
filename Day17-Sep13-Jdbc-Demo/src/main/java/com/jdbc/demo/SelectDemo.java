package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectDemo {
	private static final Logger log = LogManager.getLogger(JdbcDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Connection cn = null;
		  Statement st = null;
		  ResultSet rs=null;
		  String connectionUrl = "jdbc:mysql://localhost:3306/sample";
		  String username = "root";
		  String password = "POOven0708";
		  String driverClass = "com.mysql.cj.jdbc.Driver";
		  String selectCommand = "SELECT *from student";
		  
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

			  
			  try {
				rs = st.executeQuery(selectCommand);
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"-");
					System.out.print(rs.getString(2)+"-");
					System.out.print(rs.getInt(3)+"-");
					System.out.print(rs.getInt(4)+"-");
					System.out.print(rs.getInt(5)+"-");
					System.out.println("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("NOt executed "+e.getMessage());
			}
			  
			  
			  log.debug("Completed Program");
	}

}
