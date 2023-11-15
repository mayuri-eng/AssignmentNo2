package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.InjectMocks;

import com.app.assignmnet.PrimeNo1;

public class PrimeNo1Test {


	@Test
	public void isPrimeTest() {
		int n = 17;
		int result = PrimeNo1.isPrime(n);
		assertEquals(1, result);

	}

	@Test
	public void isNotPrime() {
		int n = 10;
		int result = PrimeNo1.isPrime(n);
		assertEquals(0, result);
	}

}
