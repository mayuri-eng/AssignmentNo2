package com.app.assignmnet;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestAndSecondSmallestNo14 {

	public static ArrayList<Integer> minAnd2ndMin(int[] a,int n){
		
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]<smallest){
				secondSmallest=smallest;
				smallest=a[i];
			}else if(a[i]<secondSmallest && a[i]!=smallest){
				secondSmallest=a[i];
			}
		}
		
		ArrayList<Integer> result=new ArrayList<>();
		
		if(secondSmallest==Integer.MAX_VALUE){
			//second smallest does not exist
			result.add(-1);
			result.add(-1);
		}else{
			result.add(smallest);
			result.add(secondSmallest);
		}
		return result;
		
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
		int result=arr.length;
		ArrayList<Integer> res=minAnd2ndMin(arr, result);
		System.out.println("smallest element: " +res.get(0));
		System.out.println("second smallest element: " +res.get(1));
	}
}
