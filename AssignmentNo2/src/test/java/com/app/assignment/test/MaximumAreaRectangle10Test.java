package com.app.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.assignmnet.MaximumAreaRectangle10;
import com.app.assignmnet.Rectangle;

public class MaximumAreaRectangle10Test {

	@Test
	public void maximumAreaRectangle10Test(){
		Rectangle[] rect = new Rectangle[3];
		rect[0] = new Rectangle(1, 2);
		rect[1] = new Rectangle(3, 4);
		rect[2] = new Rectangle(5, 6);
		int result=MaximumAreaRectangle10.calculateArea(rect);
		assertEquals(30,result);
	}
}
