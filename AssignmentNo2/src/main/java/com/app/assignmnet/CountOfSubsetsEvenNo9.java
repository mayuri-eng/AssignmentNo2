package com.app.assignmnet;

import java.util.HashSet;

public class CountOfSubsetsEvenNo9 {

	public static int countSubsets(int[] a,int n){
		HashSet<Integer> evenNoSet=new HashSet<>();
		int evenNoCount=0;
		//even no count
		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				evenNoSet.add(a[i]);
				evenNoCount++;
			}
		}
		
		
		int count=(int) Math.pow(2, evenNoCount)-1;
		return count;
	}
	public static void main(String[] args) {
		int n=8;
		int[] a={4,2,1,9,2,6,5,3};
		int result=countSubsets(a, n);
		System.out.println(result);
	}
}
