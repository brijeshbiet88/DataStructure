package com.interview.ds.leetcode;

public class SquareRoot {

	public static void main(String[] args) {
		for (int num = 4; num <= 16; num++) {
			int start = 0, high = num;
			System.out.println("Square Root of Number "+num +" is : " + findSquareRoot(start, high, num));
		}
	}

	private static int findSquareRoot(int low, int high, int num) {
		int mid = (low + high) / 2;

		if (mid * mid == num || mid == low)
			return mid;

		if (mid * mid > num)
			return findSquareRoot(low, mid, num);

		else
			return findSquareRoot(mid, high, num);
	}

}
/*
Square Root of Number 4 is : 2
Square Root of Number 5 is : 2
Square Root of Number 6 is : 2
Square Root of Number 7 is : 2
Square Root of Number 8 is : 2
Square Root of Number 9 is : 3
Square Root of Number 10 is : 3
Square Root of Number 11 is : 3
Square Root of Number 12 is : 3
Square Root of Number 13 is : 3
Square Root of Number 14 is : 3
Square Root of Number 15 is : 3
Square Root of Number 16 is : 4
*/