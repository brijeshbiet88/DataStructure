package com.interview.ds.dp;

public class EggDropping {

	public static void main(String[] args) {
		EggDropping ed = new EggDropping();
		int noOfEggs = 2 , noOfFloors = 100;
		System.out.println("No of Eggs : "+noOfEggs+" and No of Floors "+noOfFloors);
        int result = ed.calculate(noOfEggs,noOfFloors);
        System.out.println("Minimum No of Attempts in WorstCase To Find Floor Where Egg will Break From : "+result);

	}
	
	public int calculate(int eggs, int floors) {

		int a[][] = new int[eggs + 1][floors + 1];
		int c = 0;
		
		/* For 1 egg minimum number of attempts will be equlas to number of floors*/
		for (int i = 0; i <= floors; i++) {
			a[1][i] = i;
		}

		for (int e = 2; e <= eggs; e++) {
			for (int f = 1; f <= floors; f++) {
				a[e][f] = Integer.MAX_VALUE;
				for (int k = 1; k <= f; k++) {
					/* max of if egg breaks then egg will egg-- and floor will be k-- floors
					   if egg does not break then we have same no of eggs and floor - k floors left
					 */
					c = 1 + Math.max(a[e - 1][k - 1], a[e][f - k]);
					if (c < a[e][f]) {
						a[e][f] = c;
					}
				}
			}
		}
		return a[eggs][floors];
	}

}
/*
No of Eggs : 2 and No of Floors 10
Minimum No of Attempts in WorstCase To Find Floor Where Egg will Break From : 4

 */
