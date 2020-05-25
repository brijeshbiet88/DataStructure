package com.interview.ds.array;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Range :");
		int start = sc.nextInt();
		System.out.print("Enter 2nd Range :");
		int end = sc.nextInt();
		printPrimeinRange(start , end);

	}

	private static void printPrimeinRange(int start, int end) {
		
		for (int i = start ; i < end ; i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
		
	}

	private static boolean isPrime(int num) {
	
		for (int i = 2 ; i <= Math.sqrt(num) ; i++) {
			if(num % i == 0 )
				return false;
		}
		
		return true;
	}

}
