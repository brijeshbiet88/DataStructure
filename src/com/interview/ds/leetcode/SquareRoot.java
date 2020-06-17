package com.interview.ds.leetcode;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Element : ");
		int num = sc.nextInt();
		int start = 0 , high = num;
		System.out.println("\nSquare Root of Number is : "+findSquareRoot(start , high, num));
	}

	private static int findSquareRoot(int low, int high , int num) {
		int mid = (low + high) / 2;

		if (mid * mid == num || mid == low)
			return mid;

		if (mid * mid > num)
			return findSquareRoot(low, mid , num);

		else
			return findSquareRoot(mid, high , num );
	}

}
