package com.app.assignmnet;

import java.util.HashMap;

public class CountPairs29 {

	
	public static int getPairsCount(int[] arr,int n,int k){
		HashMap<Integer, Integer> map=new HashMap<>();
		int count=0;
		
		for(int i=0;i<n;i++){
			int comp=k-arr[i];
			if(map.containsKey(comp)){
				count+=map.get(comp);
			}
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr={1,5,7,1};
		int n=4;
		int k=6;
		System.out.println("output: " +getPairsCount(arr, n, k));
	}
}
