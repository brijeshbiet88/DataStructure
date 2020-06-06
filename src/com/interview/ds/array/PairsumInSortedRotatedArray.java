package com.interview.ds.array;

public class PairsumInSortedRotatedArray {

	public static void main(String[] args) {
		int [] arr = {14 , 17 , 20 , 31 , 7 , 11 , 13 };
		int pairSum = 20;
		
		boolean hasPair = findPairsToGivenSum(arr, pairSum);
		System.out.println("Does Pair to Given Sum : "+pairSum+" Exists : "+hasPair);
		
		pairSum = 30;
		
		hasPair = findPairsToGivenSum(arr, pairSum);
		System.out.println("Does Pair to Given Sum : "+pairSum+" Exists : "+hasPair);
		
		pairSum = 38;
		
		hasPair = findPairsToGivenSum(arr, pairSum);
		System.out.println("Does Pair to Given Sum : "+pairSum+" Exists : "+hasPair);
		
		pairSum = 36;
		
		hasPair = findPairsToGivenSum(arr, pairSum);
		System.out.println("Does Pair to Given Sum : "+pairSum+" Exists : "+hasPair);
		
		pairSum = 29;
		
		hasPair = findPairsToGivenSum(arr, pairSum);
		System.out.println("Does Pair to Given Sum : "+pairSum+" Exists : "+hasPair);
		
	}

	private static boolean findPairsToGivenSum(int[] a, int pairSum) {
		int pivot = -1;
		
		for(int i = 0 ; i < a.length-1 ; i++) {
			if(a[i] > a[i+1]) {
				pivot = i;
				break;
			}
		}
		
		if(pivot == -1) {
			return findPairSum(a , pairSum , 0 , a.length -1);
		}else {
			return findPairSumPivot(a, pairSum , pivot , pivot+1)  ;
		}
		
	}

	private static boolean findPairSumPivot(int[] a, int pairSum, int i, int j) {
		while (i != j) {

			if (a[i] + a[j] == pairSum) {
				System.out.println("Pairs For Sum " + pairSum + " are " + a[i] + " and " + a[j]);
				return true;
			}

			if (a[i] + a[j] > pairSum) {
				i--;
			} else
				j++;
			
			if(j == a.length) j = 0;
			if(i == -1) i = a.length -1;
		}
		return false;
	}

	private static boolean findPairSum(int[] a, int pairSum, int i, int j) {
		
		while(i < j) {
			
			if(a[i]+a[j] == pairSum) {
				System.out.println(" Pairs For Sum "+pairSum+" are "+a[i]+" and "+a[j]);
				return true;
			}
			
			if(a[i]+a[j] > pairSum) {
				j--;
			}
			else i++;
		}
		return false;
	}

}
