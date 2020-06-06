package com.interview.ds.array;

public class PivotInSortedRotatedArray {

	public static void main(String[] args) {
		int [] arr = {4 , 5, 6 , 7 , 8 , 9 , 10 , 11 ,1 , 2 , 3 , 4 };
		// Pivot Element is the highest. Example if index i is pivot then i+1 is less than i;
		int pivotIndex = findPivot(arr, 0 ,arr.length-1); 
		System.out.println("Pivot Element : "+pivotIndex); 
	}

	private static int findPivot(int[] arr, int low, int high) {
		   if (high <= low)   
	            return -1; 
	        
	       int mid = (low + high)/2;    
	       if (mid < high && arr[mid] > arr[mid + 1]) 
	           return mid; 
	       if (mid > low && arr[mid] < arr[mid - 1]) 
	           return (mid-1); 
	       if (arr[low] >= arr[mid]) 
	           return findPivot(arr, low, mid-1); 
	       return findPivot(arr, mid + 1, high); 
	}

}
