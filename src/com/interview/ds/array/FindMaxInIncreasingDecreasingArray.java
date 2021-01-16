package com.interview.ds.array;

public class FindMaxInIncreasingDecreasingArray {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1------------------");
		int a [] = {6 , 9 , 15 , 26 , 35  , 50 , 61 , 37 , 27 , 19 , 9 , 5};
		int max = findMax(a , 0 , a.length-1);
		System.out.println("Max is : "+max);
		
		System.out.println();
		System.out.println("---------------Test Case 2------------------");
		int a2 [] = {4 , 7 , 2 , 1};
		max = findMax(a2 , 0 , a2.length-1);
		System.out.println("Max is : "+max);

		
		System.out.println();
		System.out.println("---------------Test Case 3------------------");
		int a3 [] = {14 , 7 };
		max = findMax(a3 , 0 , a3.length-1);
		System.out.println("Max is : "+max);
	}

	private static int findMax(int[] a , int start , int end) {
		if(start == end) {
			return a[start];
		}else if( end == start + 1) {
			return Math.max(a[start], a[end]);
		}
		
		int mid = start + (end - start)/2;
		
		if(a[mid] > a[mid-1] && a[mid] > a[mid+1]) {
			return a[mid];
		}
		
		else if(a[mid] > a[mid -1]) {
			return findMax(a, mid+1, end);
		}
		else
			return findMax(a, start, mid-1);
	}

}
/*---------------Test Case 1------------------
Max is : 61

---------------Test Case 2------------------
Max is : 7

---------------Test Case 3------------------
Max is : 14
*/