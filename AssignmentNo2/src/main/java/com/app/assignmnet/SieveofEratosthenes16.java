package com.app.assignmnet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SieveofEratosthenes16 {

	public List<Integer> sieveOfEratosthenes(int n){
		boolean[] isPrime=new boolean[n+1];
		for(int i=2;i<=n;i++){
			isPrime[i]=true;
		}
		
		for(int p=2;p*p<=n;p++){
			if(isPrime[p]){
				for(int i=p*p;i<=n;i+=p){
					isPrime[i]=false;   //mark multiples of primes as non-prime
				}
			}
		}
		
		List<Integer> primes=new ArrayList<>(); //store prime number
		for(int i=2;i<=n;i++){
			if(isPrime[i]){
				primes.add(i);  //collect prime no
			}
		}
		return primes;
		
	}
	
	public static void main(String[] args) {
		SieveofEratosthenes16 s=new SieveofEratosthenes16
				();
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> primeNo=s.sieveOfEratosthenes(n);
		System.out.println("Prime numbers less than or equal to " +n+ " " +primeNo);
	}
}
