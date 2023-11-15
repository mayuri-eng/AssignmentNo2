package com.app.assignmnet;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNoOfOccurance21 {

	public static boolean isFrequencyUnique(int n,int[] arr){
		HashMap<Integer,Integer> frequency=new HashMap<>();
		
		//count the frequency of each element in the array
		for(int i=0;i<n;i++){
			int element=arr[i];
			frequency.put(element, frequency.getOrDefault(element, 0)+1);
		}
		
		//create a hashset to store unique frequencies
		HashSet<Integer> uniqueFrequencies=new HashSet<>(frequency.values());
		
		return uniqueFrequencies.size()==frequency.size();	
	}
	
	public static void main(String[] args) {
		int n=5;
		int[] arr={1,1,2,5,5};
		boolean result=isFrequencyUnique(n, arr);
		System.out.println(result);
	}
}
