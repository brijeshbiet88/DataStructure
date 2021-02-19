package com.interview.ds.stackandqueue;

import java.util.Stack;

public class MaxAreaHistoGram {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1--------------------");
		int[] heights = { 2, 1, 5, 6, 2, 3 };
		System.out.println("Max Area of Histogram is : " + largestRectangleArea(heights));
		System.out.println();
		
		System.out.println("----------------Test Case 2--------------------");
		int[] heights2 = { 2, 1, 2, 3, 1 };
		System.out.println("Max Area of Histogram is : " + largestRectangleArea(heights2));
		System.out.println();
		
		System.out.println("----------------Test Case 3--------------------");
		int[] heights3 = { 1 , 2, 4};
		System.out.println("Max Area of Histogram is : " + largestRectangleArea(heights3));
		System.out.println();
		
		System.out.println("----------------Test Case 4--------------------");
		int[] heights4 = { 1 , 2, 4 , 1 , 2};
		System.out.println("Max Area of Histogram is : " + largestRectangleArea(heights4));
		System.out.println();
		
		System.out.println("----------------Test Case 5--------------------");
		int[] heights5 = { 6 , 7 , 6};
		System.out.println("Max Area of Histogram is : " + largestRectangleArea(heights5));
		System.out.println();
	}
	

	public static int largestRectangleArea(int[] heights) {
		if(heights == null) return 0;
		int maxArea = 0;
		int currentArea = 0;
		Stack<Integer> s = new Stack<Integer>();
		int i = 0;
		int len = heights.length ;
		while (i < len) {

			if (s.isEmpty() || heights[s.peek()] < heights[i]) {
				s.push(i++);
			} else {
				int top = s.pop();
				if(s.isEmpty())
				currentArea = heights[top] * i;
				else
				currentArea = heights[top] * (i - s.peek() - 1);
			}
			maxArea = Math.max(currentArea, maxArea);
		}
		
		while(!s.isEmpty()) {
			int top = s.pop();
			if(s.isEmpty())
				currentArea = heights[top] * i;
				else
				currentArea = heights[top] * (i - s.peek() - 1);
			maxArea = Math.max(currentArea, maxArea);
		}
		
		
		return maxArea;
	}

}
