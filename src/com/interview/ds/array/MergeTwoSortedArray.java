package com.interview.ds.array;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int [] a = { 10, 13, 24, 33, 42, 56, 61 };
		int [] b = { 2, 8, 14, 23, 52 };
		int [] c = new int[a.length+b.length];
		mergeTwoSortedArray(a,b,c);
		System.out.println("Array after Merging Two Sorted Array : ");
		for(int num : c)
			System.out.print(num+" ");

	}

	private static void mergeTwoSortedArray(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		
		while (i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				c[k++] = a[i++];
			}else {
				c[k++] = b[j++];
			}
		}
		
		if(i == a.length) {
			while(j < b.length) {
				c[k++] = b[j++];
			}
			
		}else if(j == b.length) {
			while(i < a.length) {
				c[k++] = a[i++];
			}
		}

	}

}
