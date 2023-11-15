package com.app.assignmnet;

import java.util.Arrays;

public class KthSmallestElement26 {

	
	public static int kthSmallest(int[] arr,int l,int r,int k){
		
		Arrays.sort(arr);
		return arr[l+k-1];
		
	}
	
	public static void main(String[] args) {
		int[] arr={7,10,4,3,20,15};
		int n=6;
		int k=3;
		System.out.println("output: " +kthSmallest(arr, 0, n-1, k));
		
	}
}
