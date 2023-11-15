package com.app.assignmnet;

public class EquilibriumPoint27 {

	public static int equilibrium(int[] arr,int n){
		if(n==1){
			return 1;
		}
		
		int totalSum=0;
		for(int num:arr){
			totalSum+=num;
		}
		
		int leftSum=0;
		for(int i=0;i<n;i++){
			totalSum-=arr[i];
			
			if(leftSum==totalSum){
				return i+1;
			}
			leftSum+=arr[i];
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,3,5,2,2};
		int n=5;
		System.out.println("output: " +equilibrium(arr, n));
	}
}
