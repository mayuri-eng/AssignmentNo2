package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.app.assignmnet.SmallestAndSecondSmallestNo14;

public class SmallestAndSecondSmallestNo14Test {
	@Test
	public void smallestAndSecondSmallestNo14() {

		int arr[] = { 2, 4, 1, 3, 5 };
		ArrayList<Integer> result = SmallestAndSecondSmallestNo14.minAnd2ndMin(arr, arr.length);
		ArrayList<Integer> expResult = new ArrayList<>();
		expResult.add(1);
		expResult.add(2);
		assertEquals(expResult, result);
	}

	@Test
	public void smallestAndSecondSmallestNoNotFound14() {

		int arr[] = {};
		ArrayList<Integer> result = SmallestAndSecondSmallestNo14.minAnd2ndMin(arr, arr.length);
		ArrayList<Integer> expResult = new ArrayList<>();
		expResult.add(-1);
		expResult.add(-1);
		assertEquals(expResult, result);
	}

}
