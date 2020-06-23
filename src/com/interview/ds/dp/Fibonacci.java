package com.interview.ds.dp;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of n: ");
		int n = sc.nextInt();	
		System.out.println("Print Fibonacci till "+n+ " terms ");
		fibNTermsDP(n);
	}

	private static void fibNTermsDP(int n) {
		if (n < 1) {
			System.out.println("Not Possible : Invalid Value Of n ");
			System.exit(0);
		}
		int[] fib = new int[n];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			if (i <= 2) {
				System.out.print(fib[0] + " " + fib[1] + " " + fib[2] + " ");
			} else {
				System.out.print(fib[i] + " ");
			}
		}
	}

}
/*
Enter Value of n: 20
Print Fibonacci till 20 terms 
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 
 */