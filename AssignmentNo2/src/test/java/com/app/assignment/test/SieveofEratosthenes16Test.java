package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.app.assignmnet.SieveofEratosthenes16;

public class SieveofEratosthenes16Test {

	@Test
	public void sieveofEratosthenes16(){
		int n=10;
		SieveofEratosthenes16 sieve=new SieveofEratosthenes16();
		List<Integer> primes=sieve.sieveOfEratosthenes(n);
		int[] expectedPrimes={2,3,5,7};
		assertEquals(primes.size(), expectedPrimes.length);

		
	}
	
	
}
