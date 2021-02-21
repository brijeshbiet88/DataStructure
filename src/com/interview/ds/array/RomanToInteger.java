package com.interview.ds.array;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1------------------");
		String s = "MCMXCIV";
		System.out.println("Decimal Reprentation of Roman "+s+" is : "+romanToInt(s));
		System.out.println();
		
		System.out.println("---------------Test Case 2------------------");
		s = "LVIII";
		System.out.println("Decimal Reprentation of Roman "+s+" is : "+romanToInt(s));
		System.out.println();
		
		System.out.println("---------------Test Case 3------------------");
		s = "IX";
		System.out.println("Decimal Reprentation of Roman "+s+" is : "+romanToInt(s));
		System.out.println();
		
		System.out.println("---------------Test Case 4------------------");
		s = "IV";
		System.out.println("Decimal Reprentation of Roman "+s+" is : "+romanToInt(s));
		System.out.println();
		
		System.out.println("---------------Test Case 4------------------");
		s = "DCXXI";
		System.out.println("Decimal Reprentation of Roman "+s+" is : "+romanToInt(s));
		System.out.println();
	}

	public static int romanToInt(String s) {
		int decimal = 0;
		for(int i = s.length() -1 ; i >=0 ; i--) {
			char c = s.charAt(i);
			
			switch(c) {
			
			case 'I': 
			decimal += (decimal >= 5 ? -1 : 1);
			break;
			
			case 'V': 
			decimal += 5;
			break;
			
			case 'X': 
			decimal += (decimal >= 50 ? -10 : 10);
			break;
			
			case 'L': 
			decimal += 50;
			break;
			
			case 'C': 
			decimal += (decimal >= 500 ? -100 : 100);
			break;
			
			case 'D': 
			decimal += 500;
			break;
			
			case 'M': 
			decimal += 1000;
			break;
			
			}
			
			
		}
		
		
		return decimal;

	}

}

/*
 ---------------Test Case 1------------------
Decimal Reprentation of Roman MCMXCIV is : 1994

---------------Test Case 2------------------
Decimal Reprentation of Roman LVIII is : 58

---------------Test Case 3------------------
Decimal Reprentation of Roman IX is : 9

---------------Test Case 4------------------
Decimal Reprentation of Roman IV is : 4

---------------Test Case 4------------------
Decimal Reprentation of Roman DCXXI is : 621

*/
