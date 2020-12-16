package com.interview.ds.array;

import java.util.Arrays;

public class ThreeSumTo0 {

	public static void main(String[] args) {
		int [] a = {2 , -1 , -1  , 0 , -2 , -2 , 9 , 7 , 2 , -7 , 1};
		printUniqueTripletToZero(a);
	}

	private static void printUniqueTripletToZero(int[] a) {
		Arrays.sort(a);// [-7, -2, -2, -1, -1, 0, 1, 2, 7, 9]
		int right, left;
		int sum = 0;
		for (int i = 0; i < a.length - 2; i++) {
			if(i > 0 && a[i] == a[i-1]) {
				continue;
			}
			 
			left = i + 1;
			right = a.length - 1;
			while (left < right) {
				sum = a[i] + a[left] + a[right];
				if (sum < 0) {
					left++;
				} else if (sum > 0) {
					right--;
				} else {
					System.out.println("Triplet " + a[i] + " " + a[left] + " " + a[right]);
					left++;
					right--;

				}
			}

		}

	}

}
/*
Triplet -7 -2 9
Triplet -7 0 7
Triplet -2 0 2
Triplet -1 -1 2
Triplet -1 0 1
 * */
