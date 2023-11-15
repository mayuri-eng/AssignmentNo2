package com.app.assignment.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.app.assignmnet.FirstAndLastOccurances18;

public class FirstAndLastOccurancesTest18 {

	@Test
	public void firstAndLast() {
		int arr[] = { 1, 2, 3, 4, 2, 5, 2, 6 };
		int n = arr.length;
		int a = 2;
		List<Integer> result = FirstAndLastOccurances18.firstAndLast(arr, n, a);
		assertNotNull(result);

	}
}
