package com.in28minutes.junit.helper;

import org.junit.*;

public class QuickBeforeAfter {
	
	

	@BeforeClass
	public static void oneTimeRunBefore() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void oneTimeRunAfter() {
		System.out.println("After class");
	}
	
	@Before
	public void setup() {
		
		System.out.println("before mathod....");		
	}
	
	@After
	public void tearDown() {
		
		System.out.println("after test.....");
	}
	
@Test
public void test1() {
		
		System.out.println("Test 1");		
	}

@Test
public void test2() {
	
	System.out.println("TEst 2");		
}
}
