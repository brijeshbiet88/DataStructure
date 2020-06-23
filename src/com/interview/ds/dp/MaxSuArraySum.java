package com.interview.ds.dp;

public class MaxSuArraySum {

	public static void main(String[] args) {

		int a[] = { -9, -7, 6, -3, -2, 1, 8, -1 };
		int n = a.length;
		int maxSum = maxSumSubArray(a, n);
		System.out.println("Maximum contiguous SubArray Sum is: " + maxSum);
		
		maxSum = maxSumSubArray(a);
		System.out.println("Maximum contiguous SubArray Sum is: " + maxSum);
	}

	private static int maxSumSubArray(int[] a, int n) {
		int maxSoFar = a[0];
		int currMax = a[0];

		for (int i = 1; i < n; i++) {

			currMax = Math.max(a[i], currMax + a[i]);
			maxSoFar = Math.max(maxSoFar, currMax);
		}
		return maxSoFar;

	}
	
	
	private static int maxSumSubArray(int a[]) 
    { 
        int size = a.length; 
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            maxEndingHere = maxEndingHere + a[i]; 
            if (maxSoFar < maxEndingHere) 
                maxSoFar = maxEndingHere; 
            if (maxEndingHere < 0) 
                maxEndingHere = 0; 
        } 
        return maxSoFar; 
    } 

}
