package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.PalindromeString4;

public class PalindromeString4Test {

	@Test
	public void isPalindromeString(){
		String s1="madam";
		int result=PalindromeString4.isPalindrome(s1);
		assertEquals(1,result);
	}
	
	@Test
	public void isNotPalindromeString(){
		String s1="hello";
		int result=PalindromeString4.isPalindrome(s1);
		assertEquals(0,result);
	}
}
