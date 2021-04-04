package com.interview.ds.array;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1-----------------------");
		int [] nums = {10 ,11 ,3,7,2,5,8,4,6,0,1};
		int lcs = longestConsecutive(nums);
		System.out.println("Longest Consecutive Subsequence "+lcs);
		System.out.println();
		
		System.out.println("--------------------Test Case 2-----------------------");
		int [] nums2 = {};
		lcs = longestConsecutive(nums2);
		System.out.println("Longest Consecutive Subsequence "+lcs);
		System.out.println();
		
		System.out.println("--------------------Test Case 3-----------------------");
		int [] nums3 = {100,4,200,1,3,2};
		lcs = longestConsecutive(nums3);
		System.out.println("Longest Consecutive Subsequence "+lcs);
		System.out.println();

	}
	
	
	public static int longestConsecutive(int[] nums) {
		 if(nums.length == 0) return 0;
			int ans = 1;
			HashSet<Integer> set = new HashSet<Integer>();
			int n = nums.length;
			for(int num : nums) {
				set.add(num);
			}
			int i = 0;
			
			while(i < n) {
				if(!set.contains(nums[i] - 1)) {
					int num = nums[i];
					int j = 0;
					while(i < n && set.contains(num++)) {
						j++;
					}
					ans = Math.max(ans, j);	
				}
				i++;
				
			}
			
			return ans;
	        
    }

}

/*
 * 
 * --------------------Test Case 1-----------------------
Longest Consecutive Subsequence 9

--------------------Test Case 2-----------------------
Longest Consecutive Subsequence 0

--------------------Test Case 3-----------------------
Longest Consecutive Subsequence 4


 * */
