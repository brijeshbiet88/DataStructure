package com.interview.ds.leetcode;

public class RainTrappingProblem {

	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 3, 1, 6 };
		System.out.println("Water Trapped : " + findWaterTrapped(a));

	}

	private static int findWaterTrapped(int[] a) {
		int result = 0;

		int[] maxRight = new int[a.length];
		int[] maxLeft = new int[a.length];

		int max = Integer.MIN_VALUE;
		for (int i = a.length - 1; i >= 0; i--) {
			if (max < a[i]) {
				max = a[i];
			}

			maxRight[i] = max;
		}

		max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}

			maxLeft[i] = max;
		}

		for (int i = 1; i < a.length - 1; i++) {
			if (maxLeft[i] > maxRight[i]) {
				result = result + maxRight[i] - a[i];
			} else {
				result = result + maxLeft[i] - a[i];
			}
		}

		return result;
	}

}