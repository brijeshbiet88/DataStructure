package com.interview.ds.array;

public class StockBuySellUnlimited {

	private static int numberOfTransactions = 0;
	public static void main(String[] args) {
		System.out.println("Test Case 1 :\n");
		int [] price = {21 , 23 , 38 , 46 , 32 , 28 , 22 , 29 , 37 , 30 , 40 };
		int maxProfit = findMaxProfit(price , price.length);
		System.out.println("Max Profit In Buying & Sellings Stocks in "+numberOfTransactions+" Transactions is "+maxProfit);
		System.out.println("\n");
		System.out.println("Test Case 2 :\n");
		numberOfTransactions = 0;
		int [] price2 = {21 , 20 , 19 , 18 , 15};
		maxProfit = findMaxProfit(price2 , price2.length);
		System.out.println("Max Profit In Buying & Sellings Stocks in "+numberOfTransactions+" Transactions is "+maxProfit);
		
		System.out.println("\n");
		
		System.out.println("Test Case 2 :\n");
		numberOfTransactions = 0;
		int [] price3 = {21 , 20 , 19 , 18 , 25};
		maxProfit = findMaxProfit(price3 , price3.length);
		System.out.println("Max Profit In Buying & Sellings Stocks in "+numberOfTransactions+" Transactions is "+maxProfit);
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

			if (localMinima < localMaxima) {
				numberOfTransactions++;
				maxProfit = maxProfit + price[localMaxima] - price[localMinima];
				System.out.println("Buy at "+price[localMinima]+" and sell at "+price[localMaxima]);
			}
		}
		return maxProfit;
	}

}
/*
Test Case 1 :

Buy at 21 and sell at 46
Buy at 22 and sell at 37
Buy at 30 and sell at 40
Max Profit In Buying & Sellings Stocks in 3 Transactions is 50


Test Case 2 :

Max Profit In Buying & Sellings Stocks in 0 Transactions is 0


Test Case 2 :

Buy at 18 and sell at 25
Max Profit In Buying & Sellings Stocks in 1 Transactions is 7

 
 */
