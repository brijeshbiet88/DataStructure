package com.interview.ds.array;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 10, 3, 24, 13, 2, 22, 11, 45, 16, 12 };
		quickSort(a , 0 , a.length-1);
		System.out.println("Array of Quick Sort : ");
		for(int num : a)
			System.out.print(num+" ");

	}

	private static void quickSort(int[] a, int low, int high) {

		if (low < high) {
			int pivot = partition(a, low, high);
			quickSort(a, low, pivot - 1);
			quickSort(a, pivot + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int j = low-1, i = low, r = high, temp;

		for (i = low; i <= high; i++) {
			if (a[i] < a[r]) {
				j++;
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		temp = a[j + 1];
		a[j + 1] = a[high];
		a[high] = temp;

		return j + 1;

	}

}
