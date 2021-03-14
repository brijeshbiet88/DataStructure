package com.interview.ds.dp;

public class TotalWaysToReachNthStair {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1------------------");
		int n = 3;
		int noOfWays = findNoOfWays(n);
		System.out.println("Total Number Of Ways To Reach "+n+"th Stair "+noOfWays);
		System.out.println();
		
		System.out.println("------------------Test Case 2------------------");
		n = 4;
		noOfWays = findNoOfWays(n);
		System.out.println("Total Number Of Ways To Reach "+n+"th Stair "+noOfWays);
		System.out.println();
		
		System.out.println("------------------Test Case 3------------------");
		n = 5;
		noOfWays = findNoOfWays(n);
		System.out.println("Total Number Of Ways To Reach "+n+"rd Stair "+noOfWays);
		System.out.println();
		
		System.out.println("------------------Test Case 4------------------");
		n = 6;
		noOfWays = findNoOfWays(n);
		System.out.println("Total Number Of Ways To Reach "+n+"rd Stair "+noOfWays);
		System.out.println();

	}

	private static int findNoOfWays(int n) {
		int [] results = new int [n +1 ];
		results[0] = 1;
		results[1] = 1;
		
		for(int i = 2 ; i <=n ; i++) {
			results[i] = results[i-2]+ results[i-1];
		}
		return results[n];
	}

}
