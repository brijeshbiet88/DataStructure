package com.interview.ds.array;

import java.util.Arrays;

public class LongestSubstrWithoutRepeatingChars {

	public static int longestUniqueSubstr(String str) {
		int n = str.length();

		// Result
		int res = 0;
		boolean[] visited = new boolean[256];
		for (int i = 0; i < n; i++) {

			// Note : Default values in visited are false

			for (int j = i; j < n; j++) {

				// If current character is visited
				// Break the loop
				if (visited[str.charAt(j)] == true)
					break;

				// Else update the result if
				// this window is larger, and mark
				// current character as visited.
				else {
					res = Math.max(res, j - i + 1);
					visited[str.charAt(j)] = true;
				}
			}
			Arrays.fill(visited, false);
		}
		return res;
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println("The input string is " + str);

		int len = longestUniqueSubstr(str);
		System.out.println("The length of the longest " + "non-repeating character " + "substring is : " + len);

	}

}
/*
The input string is geeksforgeeks
The length of the longest non-repeating character substring is : 7
 * */
