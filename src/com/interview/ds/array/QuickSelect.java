package com.interview.ds.array;

public class QuickSelect {

	public static void main(String[] args) {
		System.out.println("-------------Test Case 1 -------------------");
		int a [] = {54 , 26 , 77 , 31 , 94 , 20 , 55 , 13 , 27};
		int k = 1;
		int num = quickSelect(a, k);
		System.out.println("Kth Smallest Element : "+a[num]);
		System.out.println();
		
		System.out.println("-------------Test Case 2 -------------------");
		int a2 [] = {54 , 26 , 77 , 31 , 94 , 20 , 55 , 13 , 27};
		k = 2;
		num = quickSelect(a2, k);
		System.out.println("Kth Smallest Element : "+a2[num]);
		System.out.println();
		
		System.out.println("-------------Test Case 3 -------------------");
		int a3 [] = {54 , 26 , 77 , 31 , 94 , 20 , 55 , 13 , 27};
		k = 3;
		num = quickSelect(a3, k);
		System.out.println("Kth Smallest Element : "+a3[num]);
		System.out.println();
		
		System.out.println("-------------Test Case 4 -------------------");
		int a4 [] = {54 , 26 , 77 , 31 , 94 , 20 , 55 , 13 , 27};
		k = 4;
		num = quickSelect(a4, k);
		System.out.println("Kth Smallest Element : "+a4[num]);
		System.out.println();

		System.out.println("-------------Test Case 5 -------------------");
		int a5 [] = {54 , 26 , 77 , 31 , 94 , 20 , 55 , 13 , 27};
		k = 5;
		num = quickSelect(a5, k);
		System.out.println("Kth Smallest Element : "+a5[num]);
		System.out.println();
	}

	private static int quickSelect(int[] a, int k) {
		return findPivot(a, 0, a.length-1, k);
		
	}

	private static int findPivot(int[] a, int low, int high , int k ) {

		if(low == high)
			return low ;
		int i = low;
		int j = low;
		int r = high;

		while (j < r) {
			if (a[j] > a[r])
				j++;
			else {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j++;
			}

		}
        int temp = a[i];
        a[i] = a[high];
        a[high] = temp;
		
        
        if(i == k-1) {
        	return i;
        }else if(i >= k ) {
        	return findPivot(a,low, i-1, k);
        }else {
        	return findPivot(a, i+1, high, k);
        }
        
	}
	
}

/*
 * 
 * 
 * 
 * -------------Test Case 1 -------------------
Kth Smallest Element : 13

-------------Test Case 2 -------------------
Kth Smallest Element : 20

-------------Test Case 3 -------------------
Kth Smallest Element : 26

-------------Test Case 4 -------------------
Kth Smallest Element : 27

-------------Test Case 5 -------------------
Kth Smallest Element : 31


 * */
