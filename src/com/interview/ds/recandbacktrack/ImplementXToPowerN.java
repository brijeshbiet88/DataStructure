package com.interview.ds.recandbacktrack;

public class ImplementXToPowerN {

	public static void main(String[] args) {
		System.out.println("---------------------Test Case 1-----------------------");
		long result;
		int x = 2, n = 11;
		result = calculateXPowN(x, n);
		System.out.println("Result Of " + x + " to The Power " + n + " = " + result);
		System.out.println();
		
		System.out.println("---------------------Test Case 2-----------------------");
		x = 7; n = 0;
		result = calculateXPowN(x, n);
		System.out.println("Result Of " + x + " to The Power " + n + " = " + result);
		System.out.println();
		
		System.out.println("---------------------Test Case 3-----------------------");
		x = 12; n = 1;
		result = calculateXPowN(x, n);
		System.out.println("Result Of " + x + " to The Power " + n + " = " + result);
		System.out.println();
		
		System.out.println("---------------------Test Case 4-----------------------");
		x = 4; n = 5;
		result = calculateXPowN(x, n);
		System.out.println("Result Of " + x + " to The Power " + n + " = " + result);
		System.out.println();
		
		System.out.println("---------------------Test Case 5-----------------------");
		x = 6; n = 3;
		result = calculateXPowN(x, n);
		System.out.println("Result Of " + x + " to The Power " + n + " = " + result);
		System.out.println();

	}

	private static long calculateXPowN(int x, int n) {
		if (n == 0)
			return 1;
		
		long result = calculateXPowN(x, n/2);
		
		if (n % 2 == 0) {
			return result * result;
		} else {
			return x * result * result;
		}
	}

}

/*
 * ---------------------Test Case 1-----------------------
Result Of 2 to The Power 11 = 2048

---------------------Test Case 2-----------------------
Result Of 7 to The Power 0 = 1

---------------------Test Case 3-----------------------
Result Of 12 to The Power 1 = 12

---------------------Test Case 4-----------------------
Result Of 4 to The Power 5 = 1024

---------------------Test Case 5-----------------------
Result Of 6 to The Power 3 = 216

 * */
