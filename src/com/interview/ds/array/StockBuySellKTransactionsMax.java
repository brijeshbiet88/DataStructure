package com.interview.ds.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StockBuySellKTransactionsMax {
	
	private static int numberOfTransactions = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of K . i.e. Max Number of Transactions : ");
		int k = sc.nextInt();
		
		System.out.println("Test Case 1 :\n");
		int [] price = {21 , 23 , 38 , 46 , 32 , 28 , 22 , 29 , 37 , 30 , 40 , 37 , 42 , 40 , 32 , 52};
		int maxProfit = findMaxProfitMaxKTxns(price , price.length , k);
		System.out.println("Max Profit In Buying & Sellings Stocks in "+numberOfTransactions+" Transactions is "+maxProfit);
	
		System.out.println("Test Case 2 :\n");
		numberOfTransactions = 0;
		int [] price2 = {21 , 20 , 19 , 18 , 15 , 23 , 27 , 24 , 22};
		maxProfit = findMaxProfitMaxKTxns(price2 , price2.length , k );
		System.out.println("Max Profit In Buying & Sellings Stocks in "+numberOfTransactions+" Transactions is "+maxProfit);
		
		System.out.println("\n");
		
		System.out.println("Test Case 3 :\n");
		numberOfTransactions = 0;
		int [] price3 = {21 , 20 , 19 , 18 , 25};
		maxProfit = findMaxProfitMaxKTxns(price3 , price3.length , k);
		System.out.println("Max Profit In Buying & Sellings Stocks in "+numberOfTransactions+" Transactions is "+maxProfit);
	}

	private static int findMaxProfitMaxKTxns(int[] price, int n, int noOfTxns) {
		ArrayList<Integer> profits = new ArrayList<Integer>();
		if (n < 2) {
			System.out.println("Invalid Input ");
			System.exit(0);
		}
		int maxProfit = 0;
		int localMinima = 0, localMaxima = 0;
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

				if (i == n - 2 && price[n - 2] < price[n - 1]) {
					localMaxima = n - 1;
				}

				i++;
			}

			if (localMinima < localMaxima) {

				profits.add(price[localMaxima] - price[localMinima]);
			}
			localMinima = localMaxima;
		}

		Collections.sort(profits);
		for (i = profits.size() - 1; i >= 0 && i >= profits.size() - noOfTxns; i--) {
			numberOfTransactions++;
			maxProfit = maxProfit + profits.get(i);
		}

		return maxProfit;
	}

}
/*
 Enter Value of K . i.e. Max Number of Transactions : 3
Test Case 1 :

Max Profit In Buying & Sellings Stocks in 3 Transactions is 60
Test Case 2 :

Max Profit In Buying & Sellings Stocks in 1 Transactions is 12


Test Case 3 :

Max Profit In Buying & Sellings Stocks in 1 Transactions is 7

 */
