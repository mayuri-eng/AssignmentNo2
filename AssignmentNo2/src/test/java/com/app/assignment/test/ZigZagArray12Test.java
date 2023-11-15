package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.ZigZagArray12;

public class ZigZagArray12Test {

	@Test
	public void zigZagArray() {
		int n = 7;
		int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
		int result = ZigZagArray12.zigzag(arr, n);
		assertEquals(n, result);

	}
}
