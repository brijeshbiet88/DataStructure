package com.interview.ds.array;

public class InsertionSort {

	public static void main(String[] args) {
		int [] a = {10, 3, 24, 13, 2, 22, 11, 45, 86, 98};
		insertionSort(a);
		System.out.println("Array After Sorting : ");
		for(int num : a)
			System.out.print(num+" ");
	}

	private static void insertionSort(int[] a) {
		for (int i = 1 ; i < a.length ; i++) {
			int key = a[i];
			int j = i -1 ;
			
			while(j >= 0 && key < a[j]) {
				a[j + 1] = a[j]; 
				j--;
			}
			a[j+1] = key;
		}
		
	}


}
