package com.app.assignmnet;

public class FebonacciSeriesNo5 {

	public static int findNthFibonancci(int n){
		int mod=1000000007;
		if(n<=1){
			return n;
		}
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<=n;i++){
			c=(a+b)%mod;
			a=b;
			b=c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int result=findNthFibonancci(2);
		System.out.println(result);
	}
}
