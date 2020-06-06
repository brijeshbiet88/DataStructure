package com.interview.ds.array;

public class MaxSumAllRotations {

	public static void main(String[] args) {
		int a[] = {1, 20, 2, 10};
		int maxSum = findMaxSumAllRotations(a);
		System.out.println("Max Sum Of All Rotations : "+maxSum);
	}

	private static int findMaxSumAllRotations(int[] a) {

		int arrSum = 0;
		int currVal = 0;
		int maxVal = 0;
		for (int i = 0; i < a.length; i++) {
			arrSum = arrSum + a[i];
			currVal = currVal + i * a[i];
		}

		maxVal = currVal;

		for (int j = 1; j < a.length; j++) {
			currVal = currVal + arrSum - a.length * a[a.length - j]; // Formula Rj - Rj-1 = arrSum - n * arr[n-j]
			if (maxVal < currVal) {
				maxVal = currVal;
			}
		}
		return maxVal;
	}

}
