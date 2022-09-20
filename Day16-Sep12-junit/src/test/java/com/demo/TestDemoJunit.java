package com.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.junit5.demo.DemoJunit;

public class TestDemoJunit {

	private static DemoJunit demo = null;

	@BeforeAll
	public static void setUp() {
		demo = new DemoJunit();
	}
	
	@AfterAll
	public static void cleanUp() {
		demo =null;
	}
	

	@Test
	public void testNewYearGreetingSuccess() {
		
		String expected = "happy new year: pooven";
		String actual = demo.newYearGreeting("pooven");
		assertEquals(expected, actual);
		

	}

	@Test
	public void testNewYearGreetingException() {

		assertThrows(NullPointerException.class,
				()-> demo.newYearGreeting(null)); 
		
	}

	@Test
	public void testIsPalindromeTrue() {
		assertTrue(demo.isPalindrome("madam"));
	}
	

	@Test
	public void testIsPalindromeFalse() {
		assertFalse(demo.isPalindrome("sir"));
	}

	@Test
	public void testIsPalindromeException() {
		assertThrows(IllegalArgumentException.class, ()-> demo.isPalindrome(null));
		
		//assert All method
	}
	
	

}
