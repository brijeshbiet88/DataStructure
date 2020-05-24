package com.interview.ds.array;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {
		int [] a = {2 ,7, 19, 11, 5, 16, 10, 22, 5, 83};
		int pairSum = 85;
		printPairSum(a , pairSum);
		
	}

	private static void printPairSum(int[] a, int pairSum) {
		Set<Integer> set = new HashSet<Integer>();
		int i = 0;
		for (; i < a.length ; i++ ) {
		   if(set.contains(pairSum-a[i])) {
			   System.out.println("Pairs For Sum : "+pairSum +" : are "+a[i] +" and "+(pairSum-a[i]));
			   break;
		   }
		   else {
			   set.add(a[i]);
		   }	
		}
		if(i == a.length) {
			System.out.println("No Pair Found For Pairsum "+pairSum);
		}
	}

}
