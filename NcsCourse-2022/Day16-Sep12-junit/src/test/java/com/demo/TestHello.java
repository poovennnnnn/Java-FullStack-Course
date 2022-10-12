package com.demo;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestHello {

	@BeforeAll
	public static void setUp() {
		System.out.println("Before all");
	}
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("After all");
	}
	
	@BeforeEach
	public  void beforeEach() {
		System.out.println("Before each");
	}
	
	@AfterEach
	public  void afterEach() {
		System.out.println("After each");
	}
	
	
	@Test
	public void testExample1() {
		System.out.println("Test Example-1");
	}
	
	@Test
	public void testExample2() {
		System.out.println("Test Example-2");
	}
	
	@Test
	public void testExample3() {
		System.out.println("Test Example-3");
	}
	
	@Test
	public void testExample4() {
		System.out.println("Test Example-4");
	
	}
	
	@Test
	public void testExample5() {
		
		System.out.println("Test Example-5");
	}
	
	
	

}
