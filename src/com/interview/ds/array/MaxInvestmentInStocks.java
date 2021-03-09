package com.interview.ds.array;

import java.util.Arrays;

public class MaxInvestmentInStocks {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1-------------------");
		int [][] transactions = {{3 , 5 , 5 },
				                 {5 , 10, 7 },
				                 {2 , 4 , 1  },
				                 };
		
		int maxInvestment = findMaxInvestment(transactions.length, transactions); 
		System.out.println("Max Investment "+maxInvestment);
		System.out.println();
		
		System.out.println("------------------Test Case 2-------------------");
		int [][] transactions2 = {
								   {3 , 5 ,  5 },
				                   {5 , 10,  7 },
				                   {2 , 4 ,  1  },
				                   {2 , 10 , 9 },
				                   
				                };
		
		maxInvestment = findMaxInvestment(transactions2.length, transactions2); 
		System.out.println("Max Investment "+maxInvestment);
		System.out.println();

	}
	
	public static int findMaxInvestment(int n , int [][] transactions) {
		int maxInvestment = 0;
		int [] investment = new int [100000];
		Arrays.fill(investment, 0);
		
		for(int i = 0 ; i < transactions.length ; i++) {
			investment[transactions[i][0] -1] += transactions[i][2] ;
			investment[transactions[i][1]] -= transactions[i][2] ;
		}
		
		maxInvestment = investment[0];
		for(int i = 1 ; i < investment.length ; i++) {
			investment[i] = investment[i-1] + investment[i];
			maxInvestment = Math.max(maxInvestment, investment[i]);
		}
		
		return maxInvestment;
		
	}

}

/*
 * ------------------Test Case 1-------------------
Max Investment 12

------------------Test Case 2-------------------
Max Investment 21


 * */
