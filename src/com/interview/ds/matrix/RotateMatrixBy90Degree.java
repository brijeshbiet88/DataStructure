package com.interview.ds.matrix;

public class RotateMatrixBy90Degree {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Matrix Before Rotating ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		rotate90DegreeLeft(mat);

		System.out.println("Matrix After Rotating 90 Degree Left");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		rotate90DegreeRight(mat);
		
		System.out.println("Matrix After Rotating 90 Degree Left");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotate90DegreeRight(int[][] mat) {
		transpose(mat);
		reverseRows(mat);
	}

	private static void rotate90DegreeLeft(int[][] mat) {
		transpose(mat);
		reverseColumns(mat);
	}
	
	private static void transpose(int mat[][]) {
		for (int i = 0; i < mat.length; i++)
			for (int j = i; j < mat[0].length; j++) {
				int temp = mat[j][i];
				mat[j][i] = mat[i][j];
				mat[i][j] = temp;
			}
	}
	
	private static void reverseColumns(int mat[][]) {
		for (int i = 0; i < mat[0].length; i++)
			for (int j = 0, k = mat[0].length - 1; j < k; j++, k--) {
				int temp = mat[j][i];
				mat[j][i] = mat[k][i];
				mat[k][i] = temp;
			}
	}
	
	private static void reverseRows(int mat[][]) {
		for (int i = 0; i < mat[0].length; i++)
			for (int j = 0, k = mat[0].length - 1; j < k; j++, k--) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][k];
				mat[i][k] = temp;
			}
	}

}
