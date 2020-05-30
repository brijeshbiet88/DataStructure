package com.interview.ds.array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] a = {2 , 4, 6, 7 , 9 , 10 , 12 , 16 , 19 , 21 , 24 , 27 , 29 , 31 , 33 , 38};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element to Be searched : ");
		int num = sc.nextInt();
		int position = binSearch(a , num , 0 , a.length-1);
		if(position != -1)
			System.out.println("Element Found At Position : "+position);
		else
			System.out.println("Element Not Found");

	}

	private static int binSearch(int[] a, int num , int start , int end) {
			
		if(start > end) {
			return -1;
		}
		
		int mid = (start+end)/2;
		
		if (a[mid] == num) {
			return mid;
		}
		
		else if(a[mid] > num)
			return binSearch(a, num, start, mid-1);
		else
			return binSearch(a, num, mid+1, end);
		
		
	}

}
