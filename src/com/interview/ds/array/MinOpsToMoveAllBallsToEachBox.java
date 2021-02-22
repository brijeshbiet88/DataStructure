package com.interview.ds.array;

public class MinOpsToMoveAllBallsToEachBox {

	public static void main(String[] args) {
		System.out.println("---------------------Test Case 1--------------------");
		String boxes = "110";
		System.out.println("Min Operations To Move All Balls to Each Box :");
		int [] result = new int [boxes.length()];
		result = minOperations(boxes);
		for(int i : result) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("---------------------Test Case 2--------------------");
		String boxes2 = "001011";
		System.out.println("Min Operations To Move All Balls to Each Box :");
		int [] result2 = new int [boxes2.length()];
		result2 = minOperations(boxes2);
		for(int i : result2) {
			System.out.print(i+" ");
		}
		System.out.println();


	}

	public static int[] minOperations(String boxes) {
		int n = boxes.length();
		char[] ch = boxes.toCharArray();
		int[] left = new int[n];
		int[] right = new int[n];
		int[] result = new int[n];
		int count = ch[0] - '0';

		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] + count;
			count += ch[i] - '0';
		}

		count = ch[n - 1] - '0';
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] + count;
			count += ch[i] - '0';
		}

		for (int i = 0; i < n; i++) {
			result[i] = right[i] + left[i];
		}

		return result;

	}
}
