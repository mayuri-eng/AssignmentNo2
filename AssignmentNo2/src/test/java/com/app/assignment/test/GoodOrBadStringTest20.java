package com.app.assignment.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.app.assignmnet.GoodOrBadString20;

public class GoodOrBadStringTest20 {

	@Test
	public void goodString() {
		assertNotNull(GoodOrBadString20.isGoodorBad("abcde"));
		assertNotNull(GoodOrBadString20.isGoodorBad("aeiou"));
		assertNotNull(GoodOrBadString20.isGoodorBad("xyz"));

	}

	@Test
	public void BadString() {
		assertNotNull(GoodOrBadString20.isGoodorBad("abcdeu"));
		assertNotNull(GoodOrBadString20.isGoodorBad("wxcwxc"));
		assertNotNull(GoodOrBadString20.isGoodorBad("aai"));

	}
}
