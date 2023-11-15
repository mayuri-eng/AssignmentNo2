package com.app.assignmnet;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement13 {

	public static int thirdLargest(int[] a, int n) {

		if (n < 3) {
			return -1;
		}
		// sort array decending order
		Arrays.sort(a);

		return a[n - 3];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = thirdLargest(arr, n);

		if (result == -1) {
			System.out.println("less than 3 elements in the array: " + result);
		} else {
			System.out.println("Third Maximum: " + result);
		}
	}
}
