package com.interview.ds.array;

public class MissingNumberFrom1toN {

	public static void main(String[] args) {
		System.out.println("---------------------Test Case 1------------------");
		int nums [] = {0, 1 , 2, 3, 4, 5, 7, 8,9, 10};
		System.out.println("Missing Number is : "+findMissngNumber(nums));
		
		System.out.println("---------------------Test Case 2------------------");
		int nums2 [] = {0, 1 , 3};
		System.out.println("Missing Number is : "+findMissngNumber(nums2));
		
		System.out.println("---------------------Test Case 2------------------");
		int nums3 [] = {0, 2};
		System.out.println("Missing Number is : "+findMissngNumber(nums3));


	}

	private static int findMissngNumber(int[] nums) {
		int n = nums.length;
		int sum = n*(n+1)/2;
		for(int i =0 ; i < n ; i++) {
			sum -= nums[i];
		}
				
		return sum;
		
	}

}