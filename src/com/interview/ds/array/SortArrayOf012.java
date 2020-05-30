package com.interview.ds.array;

public class SortArrayOf012 {

	public static void main(String[] args) {

		int [] a = {0, 1, 0, 1, 2, 2, 1, 0, 2, 0, 1, 2, 1, 1, 2, 0, 0};
		sort012Array(a);
		System.out.println("Array After Sorting : ");
		for(int num : a)
			System.out.print(num+" ");

	

	}

	private static void sort012Array(int[] a) {
		int low = 0, mid = 0, high = a.length - 1, temp;

		while (mid < high) {

			if (a[mid] == 0) {
				
				temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				
				low++;
				mid++;
			}

			else if (a[mid] == 1) {
				mid++;
			}

			else if (a[mid] == 2) {
				temp = a[high];
				a[high] = a[mid];
				a[mid] = temp;
				
				high--;

			}
			
		}
		
	}

}
