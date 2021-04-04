package com.interview.ds.array;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1-----------------------");
		int [] nums = {2,1,5,0,4,6};
		System.out.println("Found =   "+increasingTriplet(nums));
		System.out.println();
		
		
		System.out.println("--------------------Test Case 2-----------------------");
		int [] nums2 = {5 , 4 , 3 , 2 , 1};
		System.out.println("Found =   "+increasingTriplet(nums2));
		System.out.println();
		
		System.out.println("--------------------Test Case 3-----------------------");
		int [] nums3 = {1 , 2 , 3 ,4 , 5};
		System.out.println("Found =   "+increasingTriplet(nums3));
		System.out.println();
		
		System.out.println("--------------------Test Case 4-----------------------");
		int [] nums4 = {12,13,5,0,4,6, 8};
		System.out.println("Found =   "+increasingTriplet(nums4));
		System.out.println();
		
		System.out.println("--------------------Test Case 5-----------------------");
		int [] nums5 = {7,1,9,0,4,6 , 15};
		System.out.println("Found =   "+increasingTriplet(nums5));
		System.out.println();
	}
	
	public static boolean increasingTriplet(int[] nums) {

		 int small = nums[0];
		 int big = Integer.MAX_VALUE;
		 
		    for (int i = 1 ; i <  nums.length ; i++) {
		    	int num = nums[i];
		        if (num <= small) {
		            small = num;
		        } else if (num <= big) {
		            big = num;
		        } else {
		            return true;
		        }
		    }
		 
		    return false;
	}

}
