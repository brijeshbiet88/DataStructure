package com.interview.ds.dp;

public class SquareSubMatrices {

	public static void main(String[] args) {
		System.out.println("-------------Test Case 1----------------");
		int [][] mat1 = {
				        {0 , 1 ,1, 1},
				        {1 , 1, 1, 1},
				        {0 , 1, 1, 1}
		               };
		
		int count = findSquareSubMatrices(mat1);
		System.out.println("Number Of Square Sub matrices in Matrix : "+count);
		System.out.println();
		count = 0;
		
		System.out.println("-------------Test Case 2----------------");
		int [][] mat2 = {
		        {1 ,0, 1},
		        {1, 1, 0},
		        {1, 1, 0}
               };

        count = findSquareSubMatrices(mat2);
        System.out.println("Number Of Square Sub matrices in Matrix : "+count);
        count = 0;
        System.out.println();
        
        System.out.println("-------------Test Case 3----------------");
		int [][] mat3 = {
		        {1 ,1},
		        {1, 0},
               };

        count = findSquareSubMatrices(mat3);
        System.out.println("Number Of Square Sub matrices in Matrix : "+count);
        
        System.out.println("-------------Test Case 4----------------");
		int [][] mat4 = {
		        {1 }
               };

        count = findSquareSubMatrices(mat4);
        System.out.println("Number Of Square Sub matrices in Matrix : "+count);

	}

	private static int findSquareSubMatrices(int[][] matrix) {
		int count = 0;
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {
					continue;
				}

				matrix[i][j] = Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]) + 1;
				count = count + matrix[i][j];
			}
		}
		
		for (int i = 0; i < matrix.length; i++)
			count += matrix[i][0];

		for (int j = 1; j < matrix[0].length; j++)
			count += matrix[0][j];
		System.out.println("Print matrix for Summation ");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}

		return count;
	}

}

/*
-------------Test Case 1----------------
Print matrix for Summation 
0  1  1  1  
1  1  2  2  
0  1  2  3  
Number Of Square Sub matrices in Matrix : 15

-------------Test Case 2----------------
Print matrix for Summation 
1  0  1  
1  1  0  
1  2  0  
Number Of Square Sub matrices in Matrix : 7

-------------Test Case 3----------------
Print matrix for Summation 
1  1  
1  0  
Number Of Square Sub matrices in Matrix : 3
-------------Test Case 4----------------
Print matrix for Summation 
1  
Number Of Square Sub matrices in Matrix : 1

 * */
