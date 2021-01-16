package com.interview.ds.matrix;

public class Rotate90Degree {

	public static void main(String[] args) {
		int[][] mat = { { 10, 11 ,  12, 13 }, { 14, 15, 16 , 17  }, { 18, 19, 20 , 21 } , { 22, 23, 24 , 25 } };

		System.out.println("Matrix Before Rotating ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		rotate90Degree(mat);

		System.out.println("Matrix After Rotating 90 Degree Right");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rotate90Degree(int[][] mat) {
		int n = mat.length;
		int temp;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - 1 - i; j++) {
				temp = mat[j][n - i - 1];
				mat[j][n - i - 1] = mat[i][j];
				mat[i][j] = mat[n - j - 1][i];
				mat[n - j - 1][i] = mat[n - i - 1][n - j - 1];
				mat[n - i - 1][n - j - 1] = temp;
			}
		}

	}

}

/*
 * 
 * 
 * Matrix Before Rotating 
10 11 12 13 
14 15 16 17 
18 19 20 21 
22 23 24 25 
Matrix After Rotating 90 Degree Right
22 18 14 10 
23 19 15 11 
24 20 16 12 
25 21 17 13 
 * 
 * */
