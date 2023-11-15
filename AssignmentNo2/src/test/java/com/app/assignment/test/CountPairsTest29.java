package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.CountPairs29;

public class CountPairsTest29 {

	@Test
	public void countPair() {
		int[] arr = { 1, 5, 7, 1 };
		int n = 4;
		int k = 6;
		assertEquals(2, CountPairs29.getPairsCount(arr, n, k));

	}

	@Test
	public void noCountPair() {
		int[] arr = { 1, 2, 3, 4 };
		int n = 4;
		int k = 10;
		assertEquals(0, CountPairs29.getPairsCount(arr, n, k));

	}
}
