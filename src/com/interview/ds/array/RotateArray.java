package com.interview.ds.array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		int [] arr = {1 , 2, 3, 4 , 5, 6 , 7 , 8 , 9};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value Of d : ");
		int d = sc.nextInt();
		if(d > arr.length) {
			System.out.println("Invalid Input ");
			System.exit(0);
		}
		rotateRight(arr , d);
		System.out.println("Array Elements After Right Rotation : ");
		for(int num : arr)
			System.out.print(num+" ");
		System.out.println();
		rotateLeft(arr , d);
		System.out.println("Array Elements After Left Rotation : ");
		for(int num : arr)
			System.out.print(num+" ");
	}

	private static void rotateLeft(int[] arr, int d) {
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}
	
	private static void rotateRight(int[] arr, int d) {
		reverse(arr, 0, arr.length-d-1);
		reverse(arr, arr.length-d, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}
	
	public static void reverse (int [] arr , int start , int end) {
		int temp ;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
