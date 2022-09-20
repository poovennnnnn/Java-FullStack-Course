package com.pooven.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pooven.dto.User;




public class UserDaoImpl {
	
	public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	public static final String 	USERNAME="root";
	public static final String  PASSWORD="POOven0708";
	public static final String  INSERT_COMMAND="INSERT INTO user VALUES(?,?)";
	public static final String  CONNECTION_STRING="jdbc:mysql://localhost:3306/practise";
	public static final String SELECT_COMMAND = "SELECT * FROM user";
	
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
	
	public void addUserRecord(User user) {
		
	
			try {
				con =getConnection();
				pst = con.prepareStatement(INSERT_COMMAND);
				pst.setString(1, user.getUserName());
				pst.setString(2, user.getPassword());
				
				pst.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public User getUserByUsername(String username) {
		User user = null;

	     String password = null;
		try {
			
			con =getConnection();
		    rs = con.prepareStatement(SELECT_COMMAND).executeQuery();

			
		    
		    while(rs.next()) {
		    	
		         String tempName = rs.getString(1);
		    	
		    	 String tempPass = rs.getString(2);
		    	 
		    	 if(username.equals(tempName)) {
		    		 password = tempPass;
		    	 }
		    
		    	
		    }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(password);
		if(user == null || password !=null) {
			user = new User(username, password);
		}

		return user;
	}

}
