package com.app.assignmnet;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest28 {
	public static int print2largest(int[] a, int n) {

		if(n<2){
			return -1;
		}
		// sort array decending order
		Arrays.sort(a);

		int largest=a[n-1];
		for(int i=n-2;i>=0;i--){
			if(a[i]<largest){
				return a[i];
			}
		}
		return -1;
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
		int result = print2largest(arr, n);
		System.out.println(result);

	}
}
