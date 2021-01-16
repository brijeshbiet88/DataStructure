package com.interview.ds.array;

public class Frequency1toN {

	public static void main(String[] args) {
		int[] a = { 5, 2, 7, 7, 5, 4, 2, 8};
		printFrequency(a);
	}

	private static void printFrequency(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			a[i] = a[i] - 1;
		}
		for (int i = 0; i < len; i++) {
			int index = (a[i])%len;
			a[index] = a[index]+len;
		}

		for (int i = 0; i < len; i++) {
			System.out.println("Frequency of "+(i+1)+" is " +a[i]/len+" ");	
		}
	}

}
/*
Frequency of 1 is 0 
Frequency of 2 is 2 
Frequency of 3 is 0 
Frequency of 4 is 1 
Frequency of 5 is 2 
Frequency of 6 is 0 
Frequency of 7 is 2 
Frequency of 8 is 1 
*/