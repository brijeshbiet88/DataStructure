package com.interview.ds.stackandqueue;

import java.util.Stack;

public class DailyTemperature {

	public static void main(String[] args) {
		int[] temperature = { 77, 74, 75, 71, 69, 72, 76, 74 };

		int[] res = findResultantArray(temperature);

		for (int element : res)
			System.out.print(element + " ");

	}

	private static int[] findResultantArray(int[] temperature) {
		int[] res = new int[temperature.length];
		Stack<Integer> s = new Stack<Integer>();

		for (int i = 0; i < temperature.length; i++) {

			while (!s.isEmpty() && temperature[s.peek()] < temperature[i]) {
				int temp = s.pop();
				res[temp] = i - temp;
			}
			s.push(i);
		}

		return res;
	}

}
/*
 0 1 4 2 1 1 0 0 
 */