package com.interview.ds.matrix;

public class CelebrityProblem {

	public static void main(String[] args) {
		int[][] mat = { { 0,  0,  1,  0,  1,  1 },
						{ 1,  0,  1,  1,  1,  0 },
						{ 0,  1,  0,  0,  1,  0 },
						{ 1,  0,  0,  0,  1,  1 },
						{ 0,  0,  0,  0,  0,  0 },
						{ 1,  0,  0,  0,  1,  0 }};
		
		findCeleb(mat);
		
	}

	private static void findCeleb(int[][] mat) {
		int x = 0, y = mat.length - 1;

		while (x < y) {
			if (mat[x][y] == 1) {
				x++;
			} else {
				y--;
			}
		}

		boolean celebFound = false;

		for (int j = 0; j < mat.length; j++) {
			if (mat[x][j] == 0) {
				celebFound = true;
			} else {
				celebFound = false;
				break;
			}
		}

		if (celebFound) {
			{
				for (int j = 0; j < mat.length; j++) {
					if(j == x ) continue;
					if (mat[j][x] == 1) {
						if(j != x)
						celebFound = true;
					} else {
						celebFound = false;
						break;
					}
				}
				if (celebFound)
					System.out.println("Celeb Found " + x + " is Celebrity ");
				else
					System.out.println("No Celeb Found");
			}
		}

		else {
			System.out.println("No Celebe FOund");
		}
	}
}
