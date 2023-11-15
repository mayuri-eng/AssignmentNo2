package com.app.assignmnet;

import java.util.Scanner;

public class SubsequenceString17 {

	
	public static boolean isSubsequence(String s1,String s2){
		
		int a=s1.length();
		int b=s2.length();
		int i=0,j=0;
		
		while(i<a && j<b){
			if(s1.charAt(i)==s2.charAt(j)){
				i++;
			}
			j++;
		}
		return i==a;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the 1st String");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println("Enter the 2nd String");
		String s2=sc.next();
		boolean subsequence=isSubsequence(s1, s2);
		System.out.println(subsequence ? "1" : "0");
	}
}
