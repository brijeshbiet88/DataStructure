package com.interview.ds.array;

/* Given an array of Length n where elements are from o to n-1
 * We need to print the frequency of Each Element In Place*/
public class FrequencyOfElementsInPlace {

	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 3, 4, 5, 5};
		System.out.println("Orginal Array Having Elements from 0 to n-1:");
		for(int i : a) {
			System.out.print(i+" ");
		}
		System.out.println("\nPrint Frequency Of Each Element : ");
		findFrequency(a);

	}

	private static void findFrequency(int[] a) {
		int index , frequency;
		for (int i = 0; i < a.length; i++) {
			index = a[i] % a.length;
			a[index] = a[index] + a.length;
		}
		
		for (int i = 0; i < a.length; i++) {
			frequency = a[i]/a.length;
			System.out.println("Frequency Of "+i+" is -> "+frequency);
		}
		
	}
}
/*
Orginal Array Having Elements from 0 to n-1:
1 5 4 3 4 5 5 
Print Frequency Of Each Element : 
Frequency Of 0 is -> 0
Frequency Of 1 is -> 1
Frequency Of 2 is -> 0
Frequency Of 3 is -> 1
Frequency Of 4 is -> 2
Frequency Of 5 is -> 3
Frequency Of 6 is -> 0
*/
