package com.interview.ds.array;

import java.util.Arrays;

public class MinPlatformProblem {

	public static void main(String[] args) {
		int [] arrival   = {1 , 3 ,  9 ,  5 , 7 };
		int [] departure = {2 , 8 , 10 ,  11 , 12  };
		
		System.out.println("Minimum Platform Needed : "+findMinPlatform(arrival,departure));

	}

	private static int findMinPlatform(int[] arrival, int[] departure) {
		int platformNeeded = 0;
		int maxPlatform = 0;
		Arrays.sort(arrival);
		Arrays.sort(departure);
		int i = 0, j = 0;

		while (i < arrival.length && j < arrival.length) {

			if (arrival[i] < departure[j]) {
				platformNeeded++;
				i++;
				if (platformNeeded > maxPlatform) {
					maxPlatform = platformNeeded;
				}
			}

			else {
				platformNeeded--;
				j++;
			}

		}

		return maxPlatform;
	}

}
