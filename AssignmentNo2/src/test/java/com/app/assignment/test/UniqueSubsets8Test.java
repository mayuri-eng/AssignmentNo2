package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.app.assignmnet.UniqueSubsets8;

public class UniqueSubsets8Test {

	@Test
	public void uniqueSubsets() {
		UniqueSubsets8 uniqueSubset = new UniqueSubsets8();
		int arr[] = { 2, 1, 2 };
		List<List<Integer>> result = uniqueSubset.uniSubsets(arr);

		List<List<Integer>> ExpectedSubset = Arrays.asList(

				Arrays.asList(1, 2, 2), Arrays.asList(1, 2), Arrays.asList(1), Arrays.asList(2, 2), Arrays.asList(2),
				Arrays.asList());

		assertEquals(ExpectedSubset, result);

	}
}
