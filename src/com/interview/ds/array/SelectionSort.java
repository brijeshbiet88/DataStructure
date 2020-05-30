package com.interview.ds.array;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a = {10, 3, 24, 13, 2, 22, 11, 45, 86, 98};
		selectionSort(a);
		System.out.println("Array After Sorting : ");
		for(int num : a)
			System.out.print(num+" ");
	}

	private static void selectionSort(int[] a) {
		int temp ;
		for (int i = 0 ; i < a.length ; i++) {
			 int min = selectMin(a , i);
			 temp = a[i];
			 a[i] = a[min];
			 a[min] = temp;
		}
		
	}

	private static int selectMin(int[] a, int index) {
		int minIndex = index;
		for (int i = index+1 ; i < a.length ; i++) {
			 if(a[i] < a[minIndex]) {
				 minIndex = i;
			 }
		}
		return minIndex;
	}
}
