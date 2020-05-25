package com.interview.ds.array;

import java.util.Scanner;

public class DecimaltoHexaDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = sc.nextInt();
		
		String hex = convertDecToHexDec(num);
		System.out.println("Hexa Decimal Representation of Decimal "+num+" is : "+hex);

	}

	private static String convertDecToHexDec(int num) {
		StringBuilder sb = new StringBuilder();
		
		while(num != 0) {
			int rem = num%16;
			num = num/16;
			if(rem >=10) {
				sb.append((char) (rem + 55));
			}else {
				sb.append(rem);
			}
		}
		
		return sb.reverse().toString();
	}

}
