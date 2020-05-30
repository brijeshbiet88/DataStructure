package com.interview.ds.array;

public class SortArrayOf0and1 {

	public static void main(String[] args) {
		int [] a = {0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0};
		sort01Array(a);
		System.out.println("Array After Sorting : ");
		for(int num : a)
			System.out.print(num+" ");

	}

	private static void sort01Array(int[] a) {
		int i = 0 , j = a.length-1;
		
		while(a[i] == 0) {
			i++;
		}
		while(a[j] == 1) {
			j--;
		}
		
		while(i < j) {
			if(a[i] == 1 && a[j] == 0) {
				a[i] = 0;
				a[j] = 1;
				i++;
				j--;
			}
			
			if(a[i] == 0) {
				i++;
			}
			
			if(a[j] == 1) {
				j--;
			}
		}		
		
	}

}
