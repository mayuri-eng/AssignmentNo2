package com.app.assignmnet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLastOccurances18 {

	public static List<Integer> firstAndLast(int[] arr, int n, int a) {
		List<Integer> result = new ArrayList<>();
		int firstIndex = -1;
		int lastIndex = -1;

		// find the first occurence of a
		for (int i = 0; i < n; i++) {
			if (arr[i] == a) {
				firstIndex = i;
				break;
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] == a) {
				lastIndex = i;
				break;

			}
		}

		result.add(firstIndex);
		result.add(lastIndex);
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of x :");
		int x = sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> res = firstAndLast(arr, n, x);
		System.out.println("indicate first and last occurance : " + res.get(0) + " " + res.get(1));

	}

}
