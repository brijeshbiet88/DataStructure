package com.interview.ds.array;

import java.util.Scanner;

public class KConsecutiveGivenSum {

	public static void main(String[] args) {
		int [] a = {12 , 5 , 28 , 36 , 44 , 31 , 23};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value Of K : ");
		int k = sc.nextInt();
		if(k > a.length) {
			System.out.println("\nInvalid Input");
			System.exit(0);
		}
		
		System.out.print("Enter Value Of K Window Sum Sum : ");
		int kWindowSum = sc.nextInt();
		System.out.println("Does Consecutive K window Sum "+kWindowSum+" exists : "+hasKWindowSum(a,k,kWindowSum));
	}

	private static boolean hasKWindowSum(int[] a, int k, int kWindowSum) {
		boolean doesExists = false;
		int kSum = 0;
		for(int i = 0 ; i < k ; i++) {
			kSum = kSum+a[i];
		}
		
		if(kSum == kWindowSum) return true;
		
		for(int i = 1 ; i <= a.length - k ; i++) {
			kSum = kSum-a[i-1]+a[i+k-1];
			if(kSum == kWindowSum) return true;
		}
		
		return doesExists;
	}

}
/*
 * Enter Value Of K : 5
Enter Value Of K Window Sum Sum : 144
Does Consecutive K window Sum 144 exists : true

Enter Value Of K : 3
Enter Value Of K Window Sum Sum : 108
Does Consecutive K window Sum 108 exists : true
 */


