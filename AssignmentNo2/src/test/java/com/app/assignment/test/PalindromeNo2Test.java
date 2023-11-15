package com.app.assignment.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.InjectMocks;

import com.app.assignmnet.PalindromeNo2;

public class PalindromeNo2Test {
	
	@Test
	public void isPalindrome(){
		int n=121;
		String result=PalindromeNo2.is_palindrome(n);
		assertEquals("yes",result);
	}
	
	@Test
	public void isNotPalindrome(){
		int n=123;
		String result=PalindromeNo2.is_palindrome(n);
		assertEquals("no",result);
	}
}
