package com.app.assignmnet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.Subject;

public class UniqueSubsets8 {

	public List<List<Integer>> uniSubsets(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> result=new ArrayList<>();
		generateSubsets(arr,0,new ArrayList<>(),result);
		return result;
		
	}

	private void generateSubsets(int[] arr, int i, ArrayList arrayList, List<List<Integer>> result) {
		if(i==arr.length){
			result.add(new ArrayList<>(arrayList));
			return;
		}
		
		arrayList.add(arr[i]);
		generateSubsets(arr,i+1,arrayList, result);
		arrayList.remove(arrayList.size()-1);
		
		while(i+1<arr.length&&arr[i]==arr[i+1]){
			i++;
		}
		generateSubsets(arr, i+1, arrayList, result);
	}
	
	public static void main(String[] args) {
		int[] arr={2,1,2};
		UniqueSubsets8 subsets=new UniqueSubsets8();
		List<List<Integer>> uniSubsets=subsets.uniSubsets(arr);
		
		for(List<Integer> subset:uniSubsets){
			System.out.println(subset);
		}
	}
}
