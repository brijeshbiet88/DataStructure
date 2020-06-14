package com.interview.ds.array;

public class BuySellStock1Transaction {

	public static void main(String[] args) {
		System.out.println("Test Case 1 :\n");
		int [] price = {31 , 33 , 38 , 46 , 32 , 28 , 22 , 29 , 37 , 30 , 50 };
		int maxProfit = findMaxProfit(price , price.length);
		System.out.println("Max Profit In Buying & Sellings Stocks in 1 Transaction is "+maxProfit);
		System.out.println("\n");
		System.out.println("Test Case 2 :\n");
		int [] price2 = {21 , 20 , 19 , 18 , 15 , 23 , 27 , 24 , 22};
		maxProfit = findMaxProfit(price2 , price2.length);
		System.out.println("Max Profit In Buying & Sellings Stocks in 1 Transaction is "+maxProfit);
		
		System.out.println("\n");
		
		System.out.println("Test Case 2 :\n");
		int [] price3 = {21 , 20 , 19 , 18 , 25};
		maxProfit = findMaxProfit(price3 , price3.length);
		System.out.println("Max Profit In Buying & Sellings Stocks in 1 Transaction is "+maxProfit);
	}

	private static int findMaxProfit(int[] price, int n) {
		if (n < 2) {
			System.out.println("Invalid Input ");
			System.exit(0);
		}
		int maxProfit = 0;
		int localMinima = 0, localMaxima = 0 ;
		int i = 0;

		while (i < n - 1) {
			while (i < n - 1) {
				if (price[i] < price[i + 1]) {
					localMinima = i;
					break;
				}
				i++;
			}

			while (i < n - 1) {
				if (price[i] > price[i + 1]) {
					localMaxima = i;
					break;
				}
				
				if(i == n - 2 && price[n-2] < price[n-1]) {
					localMaxima = n-1;
				}
				
				i++;
			}

			if (localMinima < localMaxima && maxProfit < (price[localMaxima] - price[localMinima])) {
					maxProfit = price[localMaxima] - price[localMinima];
			}
			localMinima = localMaxima ;
		}
		return maxProfit;
	}

}
/*
Test Case 1 :

Buy at 31 and sell at 46
Max Profit In Buying & Sellings Stocks in 1 Transaction is 15


Test Case 2 :

Buy at 15 and sell at 27
Max Profit In Buying & Sellings Stocks in 1 Transaction is 12


Test Case 2 :

Buy at 18 and sell at 25
Max Profit In Buying & Sellings Stocks in 1 Transaction is 7

 */
