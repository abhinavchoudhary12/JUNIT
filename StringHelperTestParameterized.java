package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringHelperTestParameterized {
	
	
	String arr[][]= {{"ab","false"},{"aba","true"},{"Aba","true"},{"","false"}};
	StringHelper helper =new StringHelper();
	
	private String input;
	private String expectedoutput;
	
	public StringHelperTestParameterized(String input, String expectedoutput) {
		super();
		this.input = input;
		this.expectedoutput = expectedoutput;
	}



	@Parameters
	public static Collection<String[]> getParameter()
	{
		String arr[][]= {{"ab","false"},{"aba","true"},{"Aba","true"},{"","false"}};
		return Arrays.asList(arr);
	}
	
	
	
	@Test
	public void palandromeTest() {
		assertEquals(Boolean.parseBoolean(expectedoutput),helper.palandrome(input));
	}
	

}
