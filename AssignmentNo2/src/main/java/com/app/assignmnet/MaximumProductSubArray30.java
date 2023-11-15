package com.app.assignmnet;

public class MaximumProductSubArray30 {

	public static long maxProduct(int[] arr,int n){
		if(n==0){
			return 0;
		}
		 long maxEndingHere=arr[0];
		 long minEndinghere=arr[0];
		 long maxProduct=arr[0];
		 
		 for(int i=1;i<n;i++){
			 if (arr[i]<0){
				 long temp=maxEndingHere;
				 maxEndingHere=minEndinghere;
				 minEndinghere=temp;
				 
			 }
			 maxEndingHere=Math.max(arr[i], maxEndingHere*arr[i]);
			 minEndinghere=Math.min(arr[i], minEndinghere*arr[i]);
			 
			  maxProduct=Math.max(maxProduct, maxEndingHere);
		 }
		 
		 return maxProduct;
		 
	}
	
	public static void main(String[] args) {
		int arr[]={6,-3,-10,0,2};
		int n=5;
		System.out.println("output: " +maxProduct(arr, n));
	}
	
	
}
