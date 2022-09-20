package com.sonar.test;



import org.junit.jupiter.api.Test;

import com.sonar.demo.SonarDemo1;


public class TestSonarDemo1 {
	
	SonarDemo1 sonar = null;
	
	@Test
	public void testAll() {
		
		sonar = new SonarDemo1();
		sonar.welcome();
		
		
	}
	

}
