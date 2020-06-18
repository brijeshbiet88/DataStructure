package com.interview.ds.leetcode;

public class RainTrappingProblem {

	public static void main(String[] args) {
		int[] a = { 9, 2, 4, 5, 1, 8 };
		System.out.println("Water Trapped : " + findWaterTrapped(a));
		System.out.println("Water Trapped : " + findWaterTrapped(a , a.length));

	}
	
	private static int findWaterTrapped(int[] a, int n) {

		int result = 0;

		for (int i = 1; i < n - 1; i++) {
			int left = a[i];
			for (int j = 0; j < i; j++)
				left = Math.max(left, a[j]);

			int right = a[i];
			for (int j = i + 1; j < n; j++)
				right = Math.max(right, a[j]);

			result = result + (Math.min(left, right) - a[i]);
		}

		return result;

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