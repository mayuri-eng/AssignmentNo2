package com.app.assignmnet;

import java.util.ArrayList;
import java.util.List;

public class StockBuySell22 {

	public static ArrayList<BuySellPojo> stockBuySell(int a[], int n) {
		if (n == 1) {
			System.out.println("No Profit");
			return null;
		}
		ArrayList<BuySellPojo> sol = new ArrayList<>();
		int i = 0;
		while (i < n - 1) {
			
			while ((i < n - 1) && (a[i + 1] <= a[i]))
				i++;
			if (i == n - 1)
				break;
			BuySellPojo b = new BuySellPojo();
			b.buy = i++;
			
			while ((i < n) && (a[i] >= a[i - 1]))
				i++;
			b.sell = i - 1;
			sol.add(b);
		}
		if (sol.isEmpty())
			System.out.println("No Profit");
		else {
			for (BuySellPojo buysell : sol) {
				System.out.print("(" + buysell.buy + " " + buysell.sell + ") ");
			}
		}
		return sol;
	}

	public static void main(String[] args) {
		int n = 7;
		int[] arr= { 100, 180, 260, 310, 40, 535, 695 };
		stockBuySell(arr, n); // Output: (0 3) (4 6)
		System.out.println();
	}

}
