package com.interview.ds.array;

import java.util.Arrays;

public class NextGreaterNumber {

	public static void main(String[] args) {
		char numArr[] = { '4', '7', '9', '0' };
		System.out.print("Input Number : ");
		for (int i = 0; i < numArr.length; i++)
			System.out.print(numArr[i]);
		System.out.println();
		findNextGreaterNumber(numArr);
	}

	private static void swap(char ar[], int i, int j) {
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	private static void findNextGreaterNumber(char numArr[]) {
		int i, n = numArr.length;

		for (i = n - 1; i > 0; i--) {
			if (numArr[i] > numArr[i - 1]) {
				break;
			}
		}

		if (i == 0) {
			System.out.println("Next Greater Number With Same Set Of Digits Is Not Possible");
		} else {
			int x = numArr[i - 1];
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (numArr[j] > x && numArr[j] < numArr[minIndex]) {
					minIndex = j;
				}
			}

			swap(numArr, i - 1, minIndex);

			Arrays.sort(numArr, i, n);
			System.out.print("Next Greater Element With Same Set Of Digits is ");
			for (i = 0; i < n; i++)
				System.out.print(numArr[i]);
		}
	}

}
