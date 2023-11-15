package com.app.assignmnet;

public class AnagramOfString15 {

	public static int remAnagram(String s1, String s2){
		int[] count=new int[26];
		
		//count s1 character frequency
		for(char c:s1.toCharArray()){
			count[c-'a']++;
		}
		
		// substract the frequency of characters in s2
		for(char c: s2.toCharArray()){
			count[c-'a']--;
		}
		
		int removeCount=0;
		
		for(int value: count){
			removeCount+=Math.abs(value);
		}
		
		return removeCount;
		
	}
	
	public static void main(String[] args) {
		
		String s1="cddgk";
		String s2="gcd";
		int deleteWorld=remAnagram(s1, s2);
		System.out.println("Minimum characters to be deleted: " +deleteWorld);
	}
	
}
