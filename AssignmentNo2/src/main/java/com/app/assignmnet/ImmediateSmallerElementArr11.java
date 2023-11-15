package com.app.assignmnet;

import java.util.Scanner;

public class ImmediateSmallerElementArr11 {

	public static int immediateSmaller(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.println(arr[i + 1] + " ");
			} else {
				System.out.println("-1");
			}
		}

		System.out.println("-1");
		return n;
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
		int result = arr.length;
		immediateSmaller(arr, result);
	}
}
