package com.app.assignment.test;

import org.junit.jupiter.api.Test;

import com.app.assignmnet.CountOfSubsetsEvenNo9;

public class CountOfSubsetsEvenNo9Test {

	@Test
	public void countOfSubsetsEvenNo9(){
		int n=8;
		int arr[]={4,2,1,9,2,6,5,3};
		int result=CountOfSubsetsEvenNo9.countSubsets(arr, n);
		assertEquals(15, result);

				
	}
}
