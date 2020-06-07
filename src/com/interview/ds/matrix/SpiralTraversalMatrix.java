package com.interview.ds.matrix;

public class SpiralTraversalMatrix {

	public static void main(String[] args) {
		int[][] mat = { { 10, 11, 12 , 13}, { 14, 15, 16 , 17 }, { 18, 19 , 20 ,21} };
		System.out.println("Original Matrix : ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Sprial Traversal Of Matrix : ");
		spiralTraversal(mat);
	}

	private static void spiralTraversal(int[][] mat) {

		int rows = mat.length, columns = mat[0].length;
		int i, rowIndex = 0, columnIndex = 0;

		while (rowIndex < rows && columnIndex < columns) {
			
			for (i = columnIndex; i < columns; ++i) {
				System.out.print(mat[rowIndex][i] + " ");
			}
			rowIndex++;

			for (i = rowIndex; i < rows; ++i) {
				System.out.print(mat[i][columns - 1] + " ");
			}
			columns--;

			if (rowIndex < rows) {
				for (i = columns - 1; i >= columnIndex; --i) {
					System.out.print(mat[rows - 1][i] + " ");
				}
				rows--;
			}

			if (columnIndex < columns) {
				for (i = rows - 1; i >= rowIndex; --i) {
					System.out.print(mat[i][columnIndex] + " ");
				}
				columnIndex++;
			}
		}
	}

}
