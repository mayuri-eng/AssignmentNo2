package com.app.assignment.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.app.assignmnet.UniqueNoOfOccurance21;

public class UniqueNoOfOccuranceTest21 {

	
	@Test(expected=AssertionError.class)
	public void uniqueNoTrue(){
		assertTrue(UniqueNoOfOccurance21.isFrequencyUnique(5, new int[]{1,1,2,5,5}));
		assertTrue(UniqueNoOfOccurance21.isFrequencyUnique(4, new int[]{2,3,4,1}));
	}
	
	@Test(expected=AssertionError.class)
	public void uniqueNoFalse(){
		assertFalse(UniqueNoOfOccurance21.isFrequencyUnique(5, new int[]{1,1,2,5,5}));
		assertTrue(UniqueNoOfOccurance21.isFrequencyUnique(3, new int[]{2,3,4}));
	}
}
