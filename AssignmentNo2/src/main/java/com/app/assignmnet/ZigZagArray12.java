package com.app.assignmnet;

import java.util.Scanner;

public class ZigZagArray12 {
public static int zigzag(int[] arr,int n){
	boolean flag=true;
	for(int i=0;i<n-1;i++){
		if(flag){
			if(arr[i]>arr[i+1]){
				swap(arr,i,i+1);
			}
		}else{
			if(arr[i]<arr[i+1]){
				swap(arr, i, i+1);
			}
		}
		flag=!flag;
	}
	return n;
}
	
	public static void swap(int[] arr,int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
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
		zigzag(arr, result);
		for(int num:arr){
			System.out.println(num+ " ");
		}
		
	}
}
