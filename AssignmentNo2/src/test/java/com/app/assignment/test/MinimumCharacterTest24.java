package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.MinimumCharacter24;

public class MinimumCharacterTest24 {

	
	@Test
	public void minimumChar(){
		assertEquals(3, MinimumCharacter24.addMinChar("ADCD"));
		assertEquals(0, MinimumCharacter24.addMinChar("wow"));
	}
}
