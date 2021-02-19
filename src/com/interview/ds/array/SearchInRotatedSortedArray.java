package com.interview.ds.array;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1-------------------");
		int a[] = { 7 , 8 , 1 ,2 ,3 ,4 ,5 ,6 };
		int target = 2;
		int indexOfNum = searchNumInSortedRotatedArray(a , 0 , a.length-1 , target);
		System.out.println("Index of Num "+target+" in Array: "+indexOfNum);
		System.out.println();
		
		System.out.println("--------------Test Case 2-------------------");
		int b[] = { 4 , 5 };
		target = 4;
		indexOfNum = searchNumInSortedRotatedArray(b , 0 , b.length-1 , target);
		System.out.println("Index of Num "+target+" in Array: "+indexOfNum);
		System.out.println();
		
		System.out.println("--------------Test Case 3-------------------");
		int c[] = {  5 , 4 };
		target = 4;
		indexOfNum = searchNumInSortedRotatedArray(c , 0 , c.length-1 , target);
		System.out.println("Index of Num "+target+" in Array: "+indexOfNum);
		System.out.println();
		
		System.out.println("--------------Test Case 4-------------------");
		int d[] = {  4 };
		target = 4;
		indexOfNum = searchNumInSortedRotatedArray(d , 0 , d.length -1 , target);
		System.out.println("Index of Num "+target+" in Array: "+indexOfNum);
		System.out.println();

		System.out.println("--------------Test Case 5-------------------");
		int e[] = {  1 , 3 , 5 };
		target = 3;
		indexOfNum = searchNumInSortedRotatedArray(e ,0 , e.length -1 , target);
		System.out.println("Index of Num "+target+" in Array: "+indexOfNum);
		System.out.println();

		System.out.println("--------------Test Case 6-------------------");
		int f[] = { 4,5,6,7,0,1,2};
		target = 3;
		indexOfNum = searchNumInSortedRotatedArray(f ,0 , f.length -1 , target);
		System.out.println("Index of Num "+target+" in Array: "+indexOfNum);
		System.out.println();
		
		System.out.println("--------------Test Case 7-------------------");
		int g[] = { 4,5,6,7,8,1,2 ,3};
		target = 8;
		indexOfNum = searchNumInSortedRotatedArray(g , 0 , g.length-1 , target);
		System.out.println("Index of Num "+target+" in Array: "+indexOfNum);
		System.out.println();
		
	}

	private static int searchNumInSortedRotatedArray(int[] nums, int low, int high, int target) {
		if (low > high)
			return -1;

		int mid = low + (high - low) / 2;
		if (nums[mid] == target)
			return mid;

		if (nums[low] <= nums[mid]) {
			if (target >= nums[low] && target <= nums[mid])
				return searchNumInSortedRotatedArray(nums, low, mid - 1, target);
			return searchNumInSortedRotatedArray(nums, mid + 1, high, target);
		}

		if (target >= nums[mid] && target <= nums[high])
			return searchNumInSortedRotatedArray(nums, mid + 1, high, target);

		return searchNumInSortedRotatedArray(nums, low, mid - 1, target);

	}

}
