package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.AnagramOfString15;


public class AnagramOfString15Test {

	@Test
	public void anagram() {
		String s1 = "cddgk";
		String s2 = "gcd";
		int deleteWorld = AnagramOfString15.remAnagram(s1, s2);
		assertEquals(2, deleteWorld);

	}
}
