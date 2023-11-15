package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.FindMissingNo25;

public class FindMissingNoTest25 {

	@Test
	public void findMissing(){
		int arr[]={1,2,3,4,5};
		assertEquals(0, FindMissingNo25.missingNumber(arr, 5));

	}
}
