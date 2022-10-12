package com.datasource;

import org.springframework.stereotype.Component;

@Component()
public class MyDataSource {
	
	public void getConnection() {
		System.out.println("loaded connection");
	}

}
