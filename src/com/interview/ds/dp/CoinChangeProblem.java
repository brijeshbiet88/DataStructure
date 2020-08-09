package com.interview.ds.dp;

import java.util.Arrays;

public class CoinChangeProblem {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1--------------");
		int [] coins = {1 ,2, 3};
		int amount = 7;
		System.out.print("Amount : "+amount+ " Available Coins :");
		for(int coin : coins)
			System.out.print(coin+" ");
		int minimumCoins = coinChange(coins, amount);
		System.out.println("\nMinimum Coins Needed: "+minimumCoins);
		System.out.println();
		
		System.out.println("---------------Test Case 2--------------");
		int [] coins2 = {1 , 2  , 5, 10};
		amount = 6249;
		minimumCoins = coinChange(coins2, amount);
		System.out.print("Amount : "+amount+ " Available Coins :");
		for(int coin : coins2)
			System.out.print(coin+" ");
		
		System.out.println("\nMinimum Coins Needed: "+minimumCoins);
		System.out.println();
		
		System.out.println("---------------Test Case 3--------------");
		int [] coins3 = {};
		amount = 0;
		minimumCoins = coinChange(coins3, amount);
		System.out.print("Amount : "+amount+ " Available Coins :");
		for(int coin : coins3)
			System.out.print(coin+" ");
		
		System.out.println("\nMinimum Coins Needed: "+minimumCoins);
		System.out.println();
		
		System.out.println("---------------Test Case 4--------------");
		int [] coins4 = {1};
		amount = 2;
		minimumCoins = coinChange(coins4, amount);
		System.out.print("Amount : "+amount+ " Available Coins :");
		for(int coin : coins4)
			System.out.print(coin+" ");
		
		System.out.println("\nMinimum Coins Needed: "+minimumCoins);
		System.out.println();
		
		System.out.println("---------------Test Case 5--------------");
		int [] coins5 = {2};
		amount = 1;
		minimumCoins = coinChange(coins5, amount);
		System.out.print("Amount : "+amount+ " Available Coins :");
		for(int coin : coins5)
			System.out.print(coin+" ");
		
		System.out.println("\nMinimum Coins Needed: "+minimumCoins);
		System.out.println();
		
		System.out.println("---------------Test Case 6--------------");
		int [] coins6 = {};
		amount = 1;
		minimumCoins = coinChange(coins6, amount);
		System.out.print("Amount : "+amount+ " Available Coins :");
		for(int coin : coins6)
			System.out.print(coin+" ");
		
		System.out.println("\nMinimum Coins Needed: "+minimumCoins);
		System.out.println();
		
		System.out.println("---------------Test Case 7--------------");
		int [] coins7 = {186,419,83,408};
		amount = 6249;
		minimumCoins = coinChange(coins7, amount);
		System.out.print("Amount : "+amount+ " Available Coins :");
		for(int coin : coins7)
			System.out.print(coin+" ");
		
		System.out.println("\nMinimum Coins Needed: "+minimumCoins);
		System.out.println();
	}
	
	public static int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		if (amount == 0)
			return 0;
		int[][] t = new int[coins.length + 1][amount + 1];
        for(int i = 0 ; i <= amount ; i++) {
        	t[0][i] = Integer.MAX_VALUE;
        }
		for (int i = 0; i < coins.length; i++) {
			for (int j = 1; j < t[0].length; j++) {

				if (j < coins[i]) {
					t[i + 1][j] = t[i][j];
				}else if(j  == coins[i]) {
					t[i+1][j] = 1;
				}
				else {
					int rightValue = t[i + 1][j - coins[i]];
					int topValue = t[i][j];
					if(rightValue == Integer.MAX_VALUE && topValue == Integer.MAX_VALUE) {
						t[i + 1][j] = Math.min(topValue, rightValue);
					}else {
						t[i + 1][j] = Math.min(topValue, rightValue) + 1;
					}
				}

			}
		}
		
		int result = t[coins.length][amount] == Integer.MAX_VALUE ? -1 : t[coins.length][amount];
		return result;
	}

}
/*
---------------Test Case 1--------------
Amount : 7 Available Coins :1 2 3 
Minimum Coins Needed: 3

---------------Test Case 2--------------
Amount : 6249 Available Coins :1 2 5 10 
Minimum Coins Needed: 627

---------------Test Case 3--------------
Amount : 0 Available Coins :
Minimum Coins Needed: 0

---------------Test Case 4--------------
Amount : 2 Available Coins :1 
Minimum Coins Needed: 2

---------------Test Case 5--------------
Amount : 1 Available Coins :2 
Minimum Coins Needed: -1

---------------Test Case 6--------------
Amount : 1 Available Coins :
Minimum Coins Needed: -1

---------------Test Case 7--------------
Amount : 6249 Available Coins :83 186 408 419 
Minimum Coins Needed: 23


 * */
