package com.interview.ds.array;

public class MereSort {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1--------------------");
		int [] arr = {8 , 1 , 7 , 12 , 2 , 1};
		
		System.out.println("Original Array : ");
		for(int num : arr)
			System.out.print(num+" ");
		int low = 0 , high = arr.length -1 , len = arr.length;
		int [] result = new int [len];
		
		mergerSort(arr , result , low , high);
		System.out.println();
		System.out.println("Array After Merge Sort : ");
		for(int num : arr)
			System.out.print(num+" ");
		
		System.out.println();
		
		
		System.out.println("-----------------Test Case 2--------------------");
		int [] arr2 = {56 , 29 , 19 , 27 , 90 , 83 , 17 , 10 , 11 , 22 , 87 , 78};
		
		System.out.println("Original Array : ");
		for(int num : arr2)
			System.out.print(num+" ");
		low = 0 ;
		high = arr2.length -1 ;
		len = arr2.length;
		int [] result2 = new int [len];
		
		mergerSort(arr2 , result2 , low , high);
		System.out.println();
		System.out.println("Array After Merge Sort : ");
		for(int num : arr2)
			System.out.print(num+" ");
		
		System.out.println();
		
	}

	private static void mergerSort(int[] arr, int[] result, int low, int high) {
		
		if(low == high) {
			return;
		}
		
		int mid = low + (high - low)/2;
		
		mergerSort(arr, result, low, mid);
		
		mergerSort(arr, result, mid+1, high);
		
		merge(arr , result , low , mid , high);
		
	}

	private static void merge(int[] arr, int[] result, int low, int mid, int high) {
		int i = low , j = mid+1;
		int k = low;
		while(i <= mid && j <=high) {
			if(arr[i] < arr[j]) {
				result[k++] = arr[i++];
			}
			else {
				result[k++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			result[k++] = arr[i++];
		}
		
		while(j <= high) {
			result[k++] = arr[j++];
		}
		
		for(int p = low ; p <= high ; p++) {
			arr[p] = result[p];
		}
	}

}

/*
 * -----------------Test Case 1--------------------
Original Array : 
8 1 7 12 2 1 
Array After Merge Sort : 
1 1 2 7 8 12 
-----------------Test Case 2--------------------
Original Array : 
56 29 19 27 90 83 17 10 11 22 87 78 
Array After Merge Sort : 
10 11 17 19 22 27 29 56 78 83 87 90 
 * */
