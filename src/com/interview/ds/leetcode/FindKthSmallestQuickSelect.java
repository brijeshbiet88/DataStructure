package com.interview.ds.leetcode;

public class FindKthSmallestQuickSelect {

	public static void main(String[] args) {
		int[] a = { 54, 26, 93, 17, 77, 31, 44, 20, 55 };
		for (int k = 1; k <= a.length + 1; k++) {
			if (k > a.length || k < 1) {
				System.out.println();
				System.out.println(k + " Invalid Input Terminating The Program");
				System.exit(0);
			}
			findKthSmallest(a, 0, a.length - 1, k);
			System.out.println();
			System.out.println(k + " th Smallest Element : " + a[k - 1]);
		}
	}

	private static void findKthSmallest(int[] a, int low, int high, int k) {

		int pivot = findPivot(a, low, high);
		if (pivot == k - 1)
			return;

		if (pivot >= k) {
			findKthSmallest(a, low, pivot - 1, k);
		} else {
			findKthSmallest(a, pivot + 1, high, k);
		}

	}

	private static int findPivot(int[] a, int low, int high) {
		int j = low - 1, i = low;

		while (i < high) {

			if (a[i] < a[high]) {
				j++;
				swap(a, i, j);
			}
			i++;
		}
		swap(a, j + 1, high);

		return j + 1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
/*
 * 1 th Smallest Element : 17
 * 
 * 2 th Smallest Element : 20
 * 
 * 3 th Smallest Element : 26
 * 
 * 4 th Smallest Element : 31
 * 
 * 5 th Smallest Element : 44
 * 
 * 6 th Smallest Element : 54
 * 
 * 7 th Smallest Element : 55
 * 
 * 8 th Smallest Element : 77
 * 
 * 9 th Smallest Element : 93
 * 
 * 10 Invalid Input Terminating The Program
 */
