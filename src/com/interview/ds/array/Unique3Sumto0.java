package com.interview.ds.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Unique3Sumto0 {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1 -------------------");
		int nums [] = {-1,0,1,1,1,2,2,2,-1,-4};
		System.out.println("Triplets Equal to 0");
		List<List<Integer>> result = threeSum(nums);
		for(int i = 0 ; i < result.size() ; i++) {
			List<Integer> triplet = result.get(i);
			System.out.println("Triplets Are : "+triplet.get(0)+" "+triplet.get(1)+" "+triplet.get(2));
		}
		
		System.out.println();
		result.clear();
		System.out.println("-----------------Test Case 2 -------------------");
		int nums2 [] = {-2 , 0 , 0 , 2 , 2};
		System.out.println("Triplets Equal to 0");
		result = threeSum(nums2);
		for(int i = 0 ; i < result.size() ; i++) {
			List<Integer> triplet = result.get(i);
			System.out.println("Triplets Are : "+triplet.get(0)+" "+triplet.get(1)+" "+triplet.get(2));
		}
		
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new LinkedList();
		int len = nums.length;
		for(int i = 0 ; i < len -2 ; i++) {
			
			if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
				int low = i+1 , high = len-1 , sum = 0 - nums[i];
				
				while(low < high) {
					
					if(nums[low] + nums[high] == sum) {
						result.add(Arrays.asList(nums[i], nums[low] , nums[high]));
						
						while(low < high && nums[low] == nums[low+1]) low++;
						while(low < high && nums[high] == nums[high-1]) high--;
						
						low++;
						high--;
					}
					
					else if(nums[low] + nums[high] < sum) {
						low++;
					}else
						high--;
					
				}
			}
			
		}
		return result;

	}
}
/*
-----------------Test Case 1 -------------------
Triplets Equal to 0
Triplets Are : -4 2 2
Triplets Are : -1 -1 2
Triplets Are : -1 0 1

-----------------Test Case 2 -------------------
Triplets Equal to 0
Triplets Are : -2 0 2
 
 */