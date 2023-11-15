package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.SecondLargest28;

public class SecondLargestTest28 {

	@Test
	public void secondLargest(){
		int arr[]={7,10,5,2,5};
		assertEquals(7, SecondLargest28.print2largest(arr, 5));

	}
	
	@Test
	public void noSecondLargestarr(){
		int arr[]={5};
		assertEquals(-1, SecondLargest28.print2largest(arr, 1));

	}
}
