package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper =new StringHelper();
	@Test
	public void palandromeTest() {
		assertEquals(false,helper.palandrome("ab"));
	}
	@Test
	public void palandromeTest2() {
		assertEquals(true,helper.palandrome("aba"));
	}
	
	@Test
	public void palandromeTest3() {
		assertEquals(true,helper.palandrome("Aba"));
	}

	@Test
	public void palandromeTest4() {
		assertEquals(false,helper.palandrome(""));
	}
}
