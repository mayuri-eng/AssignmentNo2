package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.app.assignmnet.BuySellPojo;
import com.app.assignmnet.StockBuySell22;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class StockBuySellTest22 {

	@Test
	public void stockBuySell() {
		int prices[] = { 100, 180, 260, 310, 40, 535, 695 };
		ArrayList<BuySellPojo> sol = new ArrayList<>();

		sol = StockBuySell22.stockBuySell(prices, prices.length);
		assertEquals(2, sol.size());
		assertEquals(0, sol.get(0).getBuy());
		assertEquals(3, sol.get(0).getSell());
		assertEquals(4, sol.get(1).getBuy());
		assertEquals(6, sol.get(1).getSell());

	}
}
