package com.interview.ds.array;

import java.util.Scanner;

public class ConvertDectoGivenBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = sc.nextInt();
		System.out.print("Enter Base :");
		int base = sc.nextInt();
		
		String hex = convertDecToHexDec(num , base);
		System.out.println("Hexa Decimal Representation of Decimal "+num+" is : "+hex);

	}
	
	private static String convertDecToHexDec(int num , int base) {
		StringBuilder sb = new StringBuilder();
		
		while(num != 0) {
			int rem = num % base;
			num = num / base;
			if(rem >=10) {
				sb.append((char) (rem + 55));
			}else {
				sb.append(rem);
			}
		}
		
		return sb.reverse().toString();
	}

}
