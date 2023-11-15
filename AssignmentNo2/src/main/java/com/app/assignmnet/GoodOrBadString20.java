package com.app.assignmnet;

import java.util.Scanner;

public class GoodOrBadString20 {

	public static int isGoodorBad(String S) {
		int consonantsCount = 0;
		int VowelsCount = 0;
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == '?' || isVowel(c)) {
				consonantsCount = 0;
				VowelsCount++;
				if (VowelsCount > 5) {
					return 0; // "BAD" string
				}
			} else {
				VowelsCount = 0;
				consonantsCount++;
				if (consonantsCount > 3) {
					return 0; // "BAD" string
				}
			}
		}
		return 1; // "GOOD" string
	}

	public static boolean isVowel(char c) {
		return "aeiou".indexOf(c) != -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.next();
		System.out.println(isGoodorBad(s1));
	}

}
