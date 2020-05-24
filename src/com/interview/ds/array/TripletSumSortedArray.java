package com.interview.ds.array;

import java.util.HashSet;
import java.util.Set;

public class TripletSumSortedArray {

	public static void main(String[] args) {
		int [] a = {2 ,3, 7 , 8 , 9 , 12 , 18 , 24 , 36 , 45};
		int tripletSum = 46;
		printTripletSum(a , tripletSum);
		
	}

	private static void printTripletSum(int[] a, int tripletSum) {

		int i = 0, j, k = a.length - 1;
		boolean tripletFound = false;
		while (i < a.length) {

			for (j = i + 1; j < k;) {
				
				if(tripletSum == (a[i]+a[j]+a[k])) {
					System.out.println("Triplet for sum "+tripletSum+" are "+a[i] +" "+a[j] +" "+a[k]);	
					tripletFound = !tripletFound;
					break;
				}
				else if(tripletSum > (a[i]+a[j]+a[k])) {
					j++;
				}else{
					k--;
				}
			}
			
			if(!tripletFound) i++;
			else break;
		}
		
		if(i==a.length) {
			System.out.println("No Triplet Found");
		}

	}

}
