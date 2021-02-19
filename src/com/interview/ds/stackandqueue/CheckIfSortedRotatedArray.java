package com.interview.ds.stackandqueue;

public class CheckIfSortedRotatedArray {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1 --------------");
		int [] a = {3 , 4 , 5 , 1 ,2};
		boolean isSortedRotated = check(a);
		System.out.println("Is Array Sorted and rotated ? "+isSortedRotated);
		System.out.println();
		
		
		System.out.println("--------------Test Case 2 --------------");
		int [] b = {2 , 1 , 3 ,4};
		isSortedRotated = check(b);
		System.out.println("Is Array Sorted and rotated ? "+isSortedRotated);
		System.out.println();
		
		System.out.println("--------------Test Case 3 --------------");
		int [] c = {1 ,2 , 3 ,4};
		isSortedRotated = check(c);
		System.out.println("Is Array Sorted and rotated ? "+isSortedRotated);
		System.out.println();
		
		System.out.println("--------------Test Case 4 --------------");
		int [] d = {1 ,1  , 1};
		isSortedRotated = check(d);
		System.out.println("Is Array Sorted and rotated ? "+isSortedRotated);
		System.out.println();
		
		System.out.println("--------------Test Case 5 --------------");
		int [] e = {2 ,1};
		isSortedRotated = check(e);
		System.out.println("Is Array Sorted and rotated ? "+isSortedRotated);
		System.out.println();

	}
	
	public static boolean check(int[] nums) {
		if(nums == null || nums.length < 3) {
			return true;
		}
		
		int len = nums.length ;
		int count = 0;
		
		for(int i = 0 ; i < len ; i++) {
			if(nums[i] > nums[(i+1) % len]) {
				count++;
			}
			
			if(count > 1) return false;
		}
		
		
		return true;
        
    }

}

/*
 * --------------Test Case 1 --------------
Is Array Sorted and rotated ? true

--------------Test Case 2 --------------
Is Array Sorted and rotated ? false

--------------Test Case 3 --------------
Is Array Sorted and rotated ? true

--------------Test Case 4 --------------
Is Array Sorted and rotated ? true

--------------Test Case 5 --------------
Is Array Sorted and rotated ? true


 * */
