package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.FibonacciSeries6;

public class FibonacciSeries6Test {

	@Test
	public void fibonaccieSeries() {
		int n = 5;
		int result = FibonacciSeries6.series();
		assertEquals(n, result);

	}
}
