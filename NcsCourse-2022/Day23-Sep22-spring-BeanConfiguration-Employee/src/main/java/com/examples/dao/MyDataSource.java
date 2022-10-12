package com.examples.dao;

public class MyDataSource {
	private String connectionUrl;
	private String username;
	private String password;
	private String driverClass;
	public MyDataSource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getConnectionUrl() {
		return connectionUrl;
	}
	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	@Override
	public String toString() {
		return "MyDataSource [connectionUrl=" + connectionUrl + ", username=" + username + ", password=" + password
				+ ", driverClass=" + driverClass + "]";
	}
	
	
	public void getConnection() {
		System.out.println("Connection Established");
	}
	


}
