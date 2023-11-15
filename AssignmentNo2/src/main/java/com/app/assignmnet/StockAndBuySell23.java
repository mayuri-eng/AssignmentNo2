package com.app.assignmnet;

public class StockAndBuySell23 {
	public static int stockBuyAndSell(int[] price, int n) {
		if (n <= 1) {
			return 0; // Not enough days to make a profit
		}
		int profit = 0;
		for (int i = 1; i < n; i++) {
			if (price[i] > price[i - 1]) {
				profit += price[i] - price[i - 1];
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		int[] price = { 3, 4, 1, 5 };
		int n = price.length;
		int maxProfit = stockBuyAndSell(price, n);
		System.out.println(maxProfit);
	}

}
