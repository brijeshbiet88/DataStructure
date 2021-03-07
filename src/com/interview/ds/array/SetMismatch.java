package com.interview.ds.array;

public class SetMismatch {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1 --------------------");
		int[] nums = { 2, 2, 4, 3 };
		int[] result = new int[2];
		result = findErrorNums(nums);
		System.out.println("Duplicate Num : " + result[0] + " Missing Number : " + result[1]);
		System.out.println();
		
		System.out.println("-----------------Test Case 2 --------------------");
		int[] nums2 = {1 , 1 };
		result = findErrorNums(nums2);
		System.out.println("Duplicate Num : " + result[0] + " Missing Number : " + result[1]);
		System.out.println();
		

		System.out.println("-----------------Test Case 3 --------------------");
		int[] nums3 = {2 , 2 };
		result = findErrorNums(nums3);
		System.out.println("Duplicate Num : " + result[0] + " Missing Number : " + result[1]);
		System.out.println();

	}

	public static int[] findErrorNums(int[] nums) {
		int dup = -1, missing = -1;
		for (int i = 0; i < nums.length; i++) {

			if (nums[Math.abs(nums[i]) - 1] < 0) {
				dup = Math.abs(nums[i]);
			} else {
				nums[Math.abs(nums[i] ) - 1] *= -1;
			}

		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				missing = i + 1;
				break;
			}
		}
		int[] res = { dup, missing };
		return res;

	}
}

/*
 * -----------------Test Case 1 --------------------
Duplicate Num : 2 Missing Number : 1

-----------------Test Case 2 --------------------
Duplicate Num : 1 Missing Number : 2

-----------------Test Case 3 --------------------
Duplicate Num : 2 Missing Number : 1


 * */
