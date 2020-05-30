package com.interview.ds.array;

public class BubbleSort {

	public static void main(String[] args) {
		int [] a = {10, 3, 24, 13, 2, 22, 11, 45, 86, 98};
		bubbleSort(a);
		System.out.println("Array After Sorting : ");
		for(int num : a)
			System.out.print(num+" ");
	}

	private static void bubbleSort(int[] a) {
		boolean swapped ;
		for(int i = 0 ; i < a.length -1 ; i++) {
			swapped = false;
			for(int j = i+1 ; j < a.length ; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp ;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
		}
		
		
	}

}
