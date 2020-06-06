package com.interview.ds.array;

public class MinMaxInSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = { 14, 17, 20, 31, 36, 4, 7, 11, 13 };
		int pivot = findPivot(arr, 0, arr.length - 1);

		if (pivot != -1)
			System.out.println("Max " + arr[pivot] + " and Min " + arr[pivot + 1]);
		else
			System.out.println("Max " + arr[arr.length - 1] + " and Min " + arr[0]);

		int[] arr2 = { 6, 11, 17, 21, 27, 31, 33 };
		int pivot2 = findPivot(arr2, 0, arr2.length - 1);

		if (pivot2 != -1)
			System.out.println("Max " + arr2[pivot2] + " and Min " + arr2[pivot2 + 1]);
		else
			System.out.println("Max " + arr2[arr2.length - 1] + " and Min " + arr2[0]);
	}

	private static int findPivot(int[] a, int low, int high) {

		if (high <= low)
			return -1;
		int mid = (low + high) / 2;

		if (mid < high && a[mid] > a[mid + 1]) {
			return mid;
		}

		if (mid > low && a[mid - 1] > a[mid]) {
			return mid - 1;
		}

		if (a[mid] >= a[low])
			return findPivot(a, mid + 1, high);
		return findPivot(a, low, mid - 1);
	}

}
