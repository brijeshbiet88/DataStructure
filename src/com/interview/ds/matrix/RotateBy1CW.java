package com.interview.ds.matrix;

public class RotateBy1CW {

	public static void main(String[] args) {
		int[][] mat = { { 10, 11, 12, 13, 14 },
						{ 15, 16, 17, 18, 19 },
						{ 20, 21, 22, 23, 24 },
						{ 25, 26, 27, 28, 29 }, };
		
		System.out.println("Original Matrix : ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		rotateByOnePace(mat);
		
		System.out.println("Matrix After Rotation By 1 Place : ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotateByOnePace(int[][] mat) {
		if (mat.length == 0) {
			System.out.println("Empty Matrix ");
			return;
		}

		int rows = mat.length, cols = mat[0].length;

		int rf = 0, cf = 0, rl = rows - 1, cl = cols - 1;

		int a = mat[rf][0];
		int b;
 /* variable a and b to keep track of next matrix elements and swapping purpose*/
		
/* First Shift first row , then last column , then last row and then first column*/	
		
/*At the end of Each For loop variable a will store last element of row or column*/
		
		for (int i = cf; i < cl; i++) {
			b = mat[rf][i + 1];
			mat[rf][i + 1] = a;

			a = a + b;
			b = a - b;
			a = a - b;
		}

		/*a = 14*/
		for (int i = rf; i < rl; i++) {
			b = mat[i + 1][cl];
			mat[i + 1][cl] = a;

			a = a + b;
			b = a - b;
			a = a - b;
		}
		/*a = 29*/
		for (int i = cl; i > cf; i--) {
			b = mat[rl][i - 1];
			mat[rl][i - 1] = a;

			a = a + b;
			b = a - b;
			a = a - b;
		}
		/*a = 25*/
		for (int i = rl; i > rf; i--) {
			b = mat[i - 1][rf];
			mat[i - 1][rf] = a;

			a = a + b;
			b = a - b;
			a = a - b;
		}

	}

}
/*
 Original Matrix : 
10 11 12 13 14 
15 16 17 18 19 
20 21 22 23 24 
25 26 27 28 29 
Matrix After Rotation By 1 Place : 
15 10 11 12 13 
20 16 17 18 14 
25 21 22 23 19 
26 27 28 29 24 
 
  */
