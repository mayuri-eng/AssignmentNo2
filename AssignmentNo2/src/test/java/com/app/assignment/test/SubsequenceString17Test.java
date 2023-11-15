package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.SubsequenceString17;

public class SubsequenceString17Test {
	
	
	@Test
	public void subSequenceString() {
		String s1 = "AXY";
		String s2 = "YADXCP";
		boolean deleteWorld = SubsequenceString17.isSubsequence(s1, s2);
		assertEquals(false, deleteWorld);
	}

	@Test
	public void NotSubSequenceString() {
		String s1 = "gksrek";
		String s2 = "geeksforgeeks";
		boolean deleteWorld = SubsequenceString17.isSubsequence(s1, s2);
		assertEquals(true, deleteWorld);
	}
}
