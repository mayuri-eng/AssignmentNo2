package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.ThirdLargestElement13;

public class ThirdLargestElement13Test {

	
	@Test
	public void thirdLargestElement13(){
		int n=5;
		int arr[]={2,4,1,3,5};
		int result=ThirdLargestElement13.thirdLargest(arr, n);
		assertEquals(3,result);
	}
	
	@Test
	public void NotThirdLargestElement13(){
		int n=2;
		int arr[]={1,2};
		int result=ThirdLargestElement13.thirdLargest(arr, n);
		assertEquals(-1,result);
	}
	
	
}
