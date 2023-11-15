package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.KthSmallestElement26;

public class KthSmallestElementTest26 {

	
	@Test
	public void kthElemet(){
		int[] arr={7,10,4,3,20,15};
		int k=3;
		assertEquals(7, KthSmallestElement26.kthSmallest(arr, 0, arr.length, k));

	}
}
