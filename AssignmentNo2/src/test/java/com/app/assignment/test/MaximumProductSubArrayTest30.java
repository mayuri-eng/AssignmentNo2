package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.MaximumProductSubArray30;

public class MaximumProductSubArrayTest30 {

	@Test
	public void maximumProductSubArray(){
		int arr[]={6,-3,-10,0,2};
		assertEquals(180, MaximumProductSubArray30.maxProduct(arr, 4));
	}
	
	@Test
	public void negativeMaximumProductSubArray(){
		int arr[]={-2,0,-1};
		assertEquals(0, MaximumProductSubArray30.maxProduct(arr, 3));
	}
}
