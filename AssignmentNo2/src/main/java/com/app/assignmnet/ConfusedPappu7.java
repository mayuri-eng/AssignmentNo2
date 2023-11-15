package com.app.assignmnet;

public class ConfusedPappu7 {

	public static int findDiff(int n) {
		int num = 0, i, temp = 0, rem;
		int number = n;
		while (n > 0) {
			i = n % 10;
			if (i == 6) {
				i = 9;
			}
			temp = temp * 10 + i;
			n = n / 10;
		}

		while (temp > 0) {
			rem = temp % 10;
			num = num * 10 + rem;
			temp = temp / 10;
		}
		int differance = num - number;
		return differance;
	}

	public static void main(String[] args) {
		int amount = 56;
		int result = ConfusedPappu7.findDiff(amount);
		System.out.println(result);
	}

}
