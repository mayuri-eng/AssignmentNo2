package com.app.assignment.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.app.assignmnet.StockAndBuySell23;

public class StockAndBuySellTest23 {

	@Test
	public void testMaxProfit() {
		int[] prices = { 3, 4, 1, 5 };
		assertEquals(5, StockAndBuySell23.stockBuyAndSell(prices, prices.length));
	}

	@Test
	public void testNoProfit() {
		int[] prices = { 5, 4, 3, 2, 1 };
		assertEquals(0, StockAndBuySell23.stockBuyAndSell(prices, prices.length));

	}
}
