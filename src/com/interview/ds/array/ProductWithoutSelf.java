package com.interview.ds.array;

public class ProductWithoutSelf {

	public static void main(String[] args) {
		int [] a = {2 , 3 ,4 ,5};
		System.out.println("Array Elements : ");
		for(int num : a) {
			System.out.print(num+" ");
		}
		System.out.println();
		getProductWithoutSelf(a);
		System.out.println();
		System.out.println("Array Elements After Calculting Product: ");
		for(int num : a) {
			System.out.print(num+" ");
		}
	}

	private static void getProductWithoutSelf(int[] a) {
		if(a == null || a.length < 2) {
			return;
		}
		
		int[] left = new int[a.length];
		int[] right = new int[a.length];
		
		for(int i = 0 ; i < a.length ;i++) {
			left[i] = 1;
			right[i] = 1;
		}
		
		for(int i = 1 ; i < a.length ;i++) {
			int num = left[i]*a[i-1];
			left[i] = left[i-1]*num;
			
		}
		
		for(int i = a.length-2 ; i >=0 ;i--) {
			int num = right[i]*a[i+1];
			right[i] = right[i+1]*num;
		}
		
		for(int i = 0 ; i < a.length ;i++) {
			a[i] = left[i]*right[i];
		}
	}
}
/*
*  
Array Elements : 
2 3 4 5 

Array Elements After Calculting Product: 
60 40 30 24 
*/
