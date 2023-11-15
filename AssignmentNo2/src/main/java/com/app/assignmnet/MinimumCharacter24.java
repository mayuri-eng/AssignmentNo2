package com.app.assignmnet;

public class MinimumCharacter24 {
	public static int addMinChar(String str) {
		int n = str.length();
		StringBuilder revStr = new StringBuilder(str).reverse();
		String modifiedStr = str + "$" + revStr.toString();
		int[] arr = computeArray(modifiedStr);
		return n - arr[2 * n];
	}

	static int[] computeArray(String pattern) {
		int m = pattern.length();
		int[] arr = new int[m];
		int len = 0;
		int i = 1;
		while (i < m) {
			if (pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				arr[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = arr[len - 1];
				} else {
					arr[i] = 0;
					i++;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		String input = "ABCD";
		System.out.println(addMinChar(input)); // Output: 3
	}
}