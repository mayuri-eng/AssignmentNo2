package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.ImmediateSmallerElementArr11;

public class ImmediateSmallerElementArr11Test {

	@Test
	public void immediateSmallerElementArr() {
		int n = 5;
		int arr[] = { 4, 2, 1, 5, 3 };
		int result = ImmediateSmallerElementArr11.immediateSmaller(arr, n);
		assertEquals(5, result);

	}
}
