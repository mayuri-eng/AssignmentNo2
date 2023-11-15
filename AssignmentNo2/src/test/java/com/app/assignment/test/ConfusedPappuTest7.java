package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.ConfusedPappu7;

public class ConfusedPappuTest7 {

	@Test
	public void findDiff(){
		int amount = 56;
		assertEquals(3, ConfusedPappu7.findDiff(amount));

	}
}
