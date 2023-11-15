package com.app.assignmnet;
//divide 1 and itself
public class PrimeNo1 {
  public static int isPrime(int n){
	  if(n<=1){
		  return 0;
	  }	  
	  for(int i=2;i*i<=n;i++){
		  if(n%i==0){
			 return 0; 
		  }
	  }
	return 1;
  }
 
  public static void main(String[] args) {
	int n=17;
	int result=isPrime(n);
	if(result==1){
		System.out.println(n+ " is a prime number");
	}else{
		System.out.println(n+ " is not a prime number");
	}
}
}
