package com.app.assignmnet;

public class FibonacciSeries6 {

	public static int series() {
		int a = 0, b = 1, c, n = 5;
		System.out.print(a + " " + b);

		for (int i = 2; i <=n; ++i) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		return n;
	}

	public static void main(String[] args) {
		series();

	}
}
