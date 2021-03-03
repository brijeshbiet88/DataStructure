package com.interview.ds.array;

public class RearrangeAiEqualsiIn0toNarray {

	public static void main(String[] args) {
		System.out.println("------------------- Test Case 1----------------------");
		int [] a = {-1 , 0 , -1 ,4 ,1};
		rearrange(a);
		System.out.println("Print After Rearrangement : ");
		for(int num : a) {
			System.out.print(num +" ");
		}
		System.out.println();
		
		
		System.out.println("------------------- Test Case 2----------------------");
		int [] b = {-1 , 0 , -1 ,4 ,3 , 9 , 8 , 6 , -1 , -1};
		rearrange(b);
		System.out.println("Print After Rearrangement : ");
		for(int num : b) {
			System.out.print(num +" ");
		}
		System.out.println();
		
		
		System.out.println("------------------- Test Case 3----------------------");
		int [] c = {-1 , 0 , -1 ,4 ,2 , 5 , 6 , -1};
		rearrange(c);
		System.out.println("Print After Rearrangement : ");
		for(int num : c) {
			System.out.print(num +" ");
		}
		System.out.println();
		
	}

	private static void rearrange(int[] nums) {
		
		for(int i = 0 ; i < nums.length ; ) {
			
			if(nums[i] >= 0 && nums[i] != i) {
				int temp = nums[nums[i]];
				nums[nums[i]] = nums[i];
				nums[i] = temp;
			}else {
				i++;
			}
			
		}
	}
	
	
}
