package com.interview.ds.array;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1-----------------------");
		int [] a = {1 , 1 , 3 ,3 , 4 , 4 , 7 , 7 , 8 , 9 ,9};
		int singleElement = findSingleElementInSortedArray(a);
		System.out.println("Single Element in Sorted Array: "+singleElement);
		System.out.println();
		//[3,3,7,7,10,11,11]
		
		System.out.println("------------------Test Case 2-----------------------");
		int [] b = {3,3,7,7,10,11,11};
		singleElement = findSingleElementInSortedArray(b);
		System.out.println("Single Element in Sorted Array: "+singleElement);
		System.out.println();
		
		System.out.println("------------------Test Case 3-----------------------");
		int [] c = {3,3,7,7,10, 10 ,11,11 , 87};
		singleElement = findSingleElementInSortedArray(c);
		System.out.println("Single Element in Sorted Array: "+singleElement);
		System.out.println();
		
	}

	private static int findSingleElementInSortedArray(int[] nums) {

		if (nums == null) {
			return -1;
		}

		int l = 0, h = nums.length - 1;

		while (l != h) {
			int mid = (h + l) / 2;

			if (mid % 2 != 0) {

				if (nums[mid] == nums[mid - 1]) {
					l = mid + 1;
				} else {
					h = mid - 1;
				}
			}

			else {

				if (nums[mid] == nums[mid + 1]) {
					l = mid + 2;
				} else {
					h = mid;
				}
			}

		}
		return nums[h];
	}

}

/*
 * ------------------Test Case 1-----------------------
Single Element in Sorted Array: 8

------------------Test Case 2-----------------------
Single Element in Sorted Array: 10

------------------Test Case 3-----------------------
Single Element in Sorted Array: 87


 * */
