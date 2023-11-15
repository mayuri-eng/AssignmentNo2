package com.app.assignmnet;

public class PalindromeString4 {

	public static int isPalindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			return 1;
		} 
		return 0;

	}

	public static void main(String[] args) {
		String s = "madam";
		int result = isPalindrome(s);
		System.out.println(result);
	}
}
