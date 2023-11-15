package com.app.assignmnet;

public class MaximumAreaRectangle10 {

	public static int calculateArea(Rectangle[] rect) {
		int maxArea = 0;
		for (Rectangle r : rect) {
			int currectArea = r.area();
			if (currectArea > maxArea) {
				maxArea = currectArea;
			}
		}
		return maxArea;

	}

	public static void main(String[] args) {

		Rectangle[] rect = new Rectangle[3];
		rect[0] = new Rectangle(1, 2);
		rect[1] = new Rectangle(3, 4);
		rect[2] = new Rectangle(5, 6);
		int area = calculateArea(rect);
		System.out.println("Maximum area of rectangle: " + area);
	}
}
