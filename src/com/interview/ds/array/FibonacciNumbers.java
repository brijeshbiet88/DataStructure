package com.interview.ds.array;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of n :");
		int n = sc.nextInt();
		int nthFibNum = findNthFibNum(n);
		System.out.println("nth Term of Fibonacci Series is : "+nthFibNum);
		
		nthFibNum = findNthFibNumRec(n);
		System.out.println("nth Term of Fibonacci Series Recursively is : "+nthFibNum);
		
	}

	/*
	 * Given That n is greater than 0
	 */
	private static int findNthFibNumRec(int n) {
		if(n <= 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		if(n==1) return 0;
		if(n==2) return 1;
		
		return findNthFibNumRec(n-1) + findNthFibNumRec(n-2);
		
	}

	/*
	 * Given That n is greater than 0
	 */
	private static int findNthFibNum(int n) {
		if(n <= 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		int a = 0 , b = 1;
		if(n == 1) return a;
		if(n == 2) return b;
		
		for(int i = 3 ; i <= n ; i++ ) {
			int temp = b;
			b = a + b;
			a = temp;
			
		}
		return b;
	}

}
