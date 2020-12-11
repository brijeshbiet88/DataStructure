package com.interview.ds.array;

public class RemoveDSortedArray {

	public static void main(String[] args) {
		int [] arr = {1 , 1, 1, 1 , 4 , 4, 4 , 4,5 , 6 , 6 , 7};
		int len = removeDupSortedArray(arr);
		System.out.println("Len : "+len);
		
		System.out.println("sArray After Removing Duplicates ");
		for(int i = 0 ; i < len ; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int removeDupSortedArray(int [] nums ) {
		int n = nums.length;
		if(n < 3) {
			return n;
		}
		
		int s = 2 , f = 2;
		while(f < n) {
			if(nums[f] != nums[s-2])
				nums[s++] = nums[f];
			f++;
		}
		return s;
	}

}

/*
Len : 8
sArray After Removing Duplicates 
1 1 4 4 5 6 6 7 
 * */
