package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.EquilibriumPoint27;

public class EquilibriumPointTest27 {

	@Test
	public void equilibriumPoint() {
		int arr[] = { 1, 3, 5, 2, 2 };
		assertEquals(3, EquilibriumPoint27.equilibrium(arr, 5));

	}

	@Test
	public void noEquilibriumPoint() {
		int arr[] = { 1, 2, 3, 4, 5 };
		assertEquals(-1, EquilibriumPoint27.equilibrium(arr, 5));

	}
}
