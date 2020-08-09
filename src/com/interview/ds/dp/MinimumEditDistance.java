package com.interview.ds.dp;

public class MinimumEditDistance {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1--------------");
		String word1 = "card" , word2 = "fart";
		System.out.println("Minimum Edit Distance to convert "+word1+" to "+word2+" : "+minDistance(word1, word2));
		System.out.println();
		
		System.out.println("--------------Test Case 2--------------");
		word1 = "star" ; word2 = "cart";
		System.out.println("Minimum Edit Distance to convert "+word1+" to "+word2+" : "+minDistance(word1, word2));
		System.out.println();
		
		System.out.println("--------------Test Case 3--------------");
		word1 = "horse" ; word2 = "ros";
		System.out.println("Minimum Edit Distance to convert "+word1+" to "+word2+" : "+minDistance(word1, word2));
		System.out.println();
		
		System.out.println("--------------Test Case 4--------------");
		word1 = "intention" ; word2 = "execution";
		System.out.println("Minimum Edit Distance to convert "+word1+" to "+word2+" : "+minDistance(word1, word2));
		System.out.println();
		
		System.out.println("--------------Test Case 5--------------");
		word1 = "carrot" ; word2 = "cart";
		System.out.println("Minimum Edit Distance to convert "+word1+" to "+word2+" : "+minDistance(word1, word2));
		System.out.println();
		
		System.out.println("--------------Test Case 6--------------");
		word1 = "" ; word2 = "p";
		System.out.println("Minimum Edit Distance to convert "+word1+" to "+word2+" : "+minDistance(word1, word2));
		System.out.println();

	}

	public static int minDistance(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		int i = 0, j = 0;
		int[][] minDistance = new int[len1 + 1][len2 + 1];

		for (i = 0; i < minDistance[0].length; i++) {
			minDistance[0][i] = i;
		}

		for (i = 0; i < minDistance.length; i++) {
			minDistance[i][0] = i;
		}
		int min = Integer.MAX_VALUE;
		for (i = 1; i <= len1; i++) {
			for (j = 1; j <= len2; j++) {

				if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
					min = Math.min(minDistance[i - 1][j], Math.min(minDistance[i][j - 1], minDistance[i - 1][j - 1]));
					minDistance[i][j] = min + 1;

				} else {
					minDistance[i][j] = minDistance[i - 1][j - 1];
				}
			}
		}
		return minDistance[len1][len2];
	}
}
/*
 --------------Test Case 1--------------
Minimum Edit Distance to convert card to fart : 2

--------------Test Case 2--------------
Minimum Edit Distance to convert star to cart : 3

--------------Test Case 3--------------
Minimum Edit Distance to convert horse to ros : 3

--------------Test Case 4--------------
Minimum Edit Distance to convert intention to execution : 5

--------------Test Case 5--------------
Minimum Edit Distance to convert carrot to cart : 2

--------------Test Case 6--------------
Minimum Edit Distance to convert  to p : 1
 
 */
