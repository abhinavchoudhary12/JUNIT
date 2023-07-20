package com.in28minutes.junit.helper;


import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;



public class ArrayCompareTest {
	
	
	@Test
	public void arraySortTest() {
	
	int [] numbers= {1,12,4,9};
	int [] expected= {1,4,9,12};
	
	
	Arrays.sort(numbers);
	assertArrayEquals(expected,numbers);
	}
	
	
	//it will success because we told jvm that it will throw an exception 
	//by this technique we check exception
	@Test(expected=NullPointerException.class)
	public void arraySortTest_NullArray() {
	
	int [] numbers= null;
	int [] expected= {1,4,9,12};
	
	
	Arrays.sort(numbers);
	assertArrayEquals(expected,numbers);
	}
	
	//testing time of the method whether it is completing within the given time period
	
	@Test(timeout=100)
	public void arraySortTest_TimePerformance() {
		int[] arr= {12,4,15};
		for(int i=0;i<1000000;i++) {
			arr[0]=i;
			Arrays.sort(arr);
		}
	}
	

}
