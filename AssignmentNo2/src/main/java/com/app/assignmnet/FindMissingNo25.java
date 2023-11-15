package com.app.assignmnet;

public class FindMissingNo25 {

	public static int missingNumber(int[] arr, int n) {
		int sum = n * (n + 1) / 2;
		int totalSum = 0;

		for (int num : arr) {
			totalSum += num;
		}
		return sum-totalSum ;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int n = 5;
		System.out.println("output:" + missingNumber(arr, n));
	}
}
