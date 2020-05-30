package com.interview.ds.array;

import java.util.Scanner;

public class SecodHigestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length Array : ");
		int n = sc.nextInt();
		int [] a = new int[n];
		System.out.println("\nEnter Array Elements :");
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Element Number "+i+" : ");
			a[i] = sc.nextInt();
			System.out.println();
		}
		int secMax = findSecMax(a);
		System.out.println("Second Highest Number : "+secMax);
	}

	private static int findSecMax(int[] a) {
		if(a.length < 2) {
			System.out.println("Invalid Input");
			return Integer.MIN_VALUE;
		}
		int max , secMax ;
		if(a[0] >= a[1]) {
			max = a[0]; secMax = a[1];
		}else {
			max = a[1]; secMax = a[0];
		}
		
		for(int i = 2 ; i < a.length ; i++) {
			if(a[i] >= max) {
				secMax = max;
				max = a[i];
			}
			
			else if(a[i] > secMax) {
				secMax = a[i];
			}
		}
		
		return secMax;
	}

}
