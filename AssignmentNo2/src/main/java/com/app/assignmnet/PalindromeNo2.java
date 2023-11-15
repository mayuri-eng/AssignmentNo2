package com.app.assignmnet;
//reverse no 121 
public class PalindromeNo2 {

	public static String is_palindrome(int number) {
		int num = number;
		int reverseNo = 0;
		while (number > 0) {
			int no = number % 10;
			reverseNo = reverseNo * 10 + no;
			number /= 10;
		}

		if (num == reverseNo) {
			return "yes";

		} else {
			return "no";
		}

	}

	public static void main(String[] args) {
		int number = 121;
		String result = is_palindrome(number);
		System.out.println(result);
	}
}
