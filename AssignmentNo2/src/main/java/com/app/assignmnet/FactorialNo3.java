package com.app.assignmnet;

import java.util.Scanner;

public class FactorialNo3 {

	public static int factorial(int n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int no = sc.nextInt();
		int result = factorial(no);
		System.out.println("factorial=" + result);
	}
}
