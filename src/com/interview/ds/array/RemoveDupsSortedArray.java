package com.interview.ds.array;

public class RemoveDupsSortedArray {

	public static void main(String[] args) {
		int [] a = {1 , 1, 1, 2, 2, 3, 4, 4, 5, 6, 6 , 7 , 8 , 9 , 10 , 10};
		int uniqueElements = removedups(a);
		System.out.println("Array Elements After Duplicates Removal");
		for(int num : a)
			System.out.print(num +"  ");
		System.out.println();
		System.out.println("Number of Unique Elements : "+uniqueElements);
	}

	private static int removedups(int[] a) {
		int uniqueIndex = 0 ;
		
		for(int i = 2 ; i < a.length ; i++) {
			if(a[i] != a[i-1]) {
				uniqueIndex++;
				a[uniqueIndex] = a[i];
			}
		}
		return uniqueIndex+1;
	}

}
/*
 * Array Elements After Duplicates Removal
1  2  3  4  5  6  7  8  9  10  6  7  8  9  10  10  
Number of Unique Elements : 10

 * */
