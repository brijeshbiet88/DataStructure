package com.interview.ds.array;

public class JumpGameProblem {

	public static void main(String[] args) {
		int num[] = { 1, 3, 5, 6, 2, 1, 7, 0, 8, 9, 8 };
		int minJump = findMinJumpToEnd(num);
		System.out.println("Minimum Jumps to Reach the end of array num is : " + minJump);
		
		int [] num2 = { 1, 0, 5, 7, 2, 1, 7, 0, 8, 9, 8 };
		minJump = findMinJumpToEnd(num2);
		System.out.println("Minimum Jumps to Reach the end of array num2 is : " + minJump);
		
		int [] num3 = { 3, 3, 8, 5, 3, 2, 7, 0, 8, 9, 8 };
		minJump = findMinJumpToEnd(num3);
		System.out.println("Minimum Jumps to Reach the end of array num3 is : " + minJump);
		
	}
 /* Integer.MAX_VALUE represents that it will never reach end of array*/
	private static int findMinJumpToEnd(int[] num) {
		int a = num[0], b = num[0], jump = 0;
		for (int i = 1; i < num.length; i++) {

			if (i == num.length - 1) {
				return jump;
			}

			a--;
			b--;
			if (num[i] > b) {
				b = num[i];
			}
			if (a == 0) {
				a = b;
				jump++;
			}

			if (a == 0 && b == 0 && i < num.length - 1) {
				return Integer.MAX_VALUE;
			}
		}
		return jump;
	}

}
