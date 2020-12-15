package com.interview.ds.array;

public class MajorityElement {

	public static void main(String[] args) {
		int[] a = { 6, 2, 1, 6, 9, 6, 0, 6, 8, 6, 6, 6, 7 };
		int majorityElement = findMajorityElement(a);
		boolean isMajorityElement = checkMajority(a , majorityElement);
		if(isMajorityElement)
			System.out.println("Majority Element : "+majorityElement);
		else
			System.out.println("No Majority Element Found");
		
		
		int[] a2 = { 6, 2, 1, 6, 9, 5, 0, 6, 8, 6, 6, 6, 7 };
		majorityElement = findMajorityElement(a2);
		isMajorityElement = checkMajority(a2 , majorityElement);
		if(isMajorityElement)
			System.out.println("Majority Element : "+majorityElement);
		else
			System.out.println("No Majority Element Found");
	}

	private static boolean checkMajority(int[] a, int majorityElement) {
		int count = 0;
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] == majorityElement) {
				count++;
			}
		}
		return count > (a.length-1)/2 ? true : false;
	}

	private static int findMajorityElement(int[] a) {
		if (a == null || a.length < 1) {
			return -1;
		}
		int count = 1;
		int majorityElement = a[0];
		for (int i = 1; i < a.length; i++) {
			
			if(a[i-1] == a[i]) {
				count++;
			}else {
				count--;
			}
			
			if(count == 0) {
				majorityElement = a[i];
				count = 1;
			}
			
		}

		return majorityElement;
	}

}
/*
Majority Element : 6
No Majority Element Found
*/
