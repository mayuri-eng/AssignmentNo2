package com.app.assignmnet;

import java.util.Scanner;

public class MergeOfTwoString19 {

	public static String merge(String s1, String s2){
		StringBuilder result=new StringBuilder();
		int i=0,j=0;
		
		while(i<s1.length() && j<s2.length()){
			result.append(s1.charAt(i));
			result.append(s2.charAt(j));
			i++;
			j++;
		}
		while(i<s1.length()){
			result.append(s1.charAt(i));
			i++;
		}
		while(j<s2.length()){
			result.append(s2.charAt(j));
			j++;
		}
		return result.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st string: ");
		String s1 = sc.next();
		System.out.println("enter the 2nd string: ");
		String s2=sc.next();
		String mergeString=merge(s1, s2);
		System.out.println(mergeString);
		
	
		
		
	}
}
