package com.interview.ds.leetcode;

import java.util.Scanner;

public class NextGreaterPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number To Find Next Greater Palindrome : ");
		int num = sc.nextInt();
		System.out.println("Next Greater Palindrome Of "+num+" is : "+findNextGreaterPalindrome(num));
	}

	private static Integer findNextGreaterPalindrome(int num) {
		int digitCount = findDigitCount(num);
		boolean isEvenDigits = digitCount%2==0? true : false;
		int nextGreaterPalinNum ;
		if(isEvenDigits)
			nextGreaterPalinNum = findNextGreaterNumberOfEvenDigits(num , digitCount);
		else
			nextGreaterPalinNum = findNextGreaterNumberOfOddDigits(num , digitCount);
		
		return nextGreaterPalinNum;
	}

	private static int findNextGreaterNumberOfOddDigits(int num , int digitCount) {
		int palin = 0;
		StringBuilder sb = new StringBuilder(num);
		
		
		return palin;
	}

	private static int findNextGreaterNumberOfEvenDigits(int num, int digitCount) {
		int palin = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		if (sb.charAt(digitCount / 2 - 1) > sb.charAt(digitCount / 2)) {
			sb.setLength(digitCount/2);
			String revStr = sb.reverse().toString();
			sb.reverse().append(revStr);
		}
		
		if (sb.charAt(digitCount / 2 - 1) == sb.charAt(digitCount / 2)) {
			boolean isAll9 = true;
			int prevMid = digitCount/2-1, postMid = digitCount/2;
			while(prevMid >= 0 && postMid <= digitCount && sb.charAt(prevMid) == sb.charAt(postMid)) {
				if(isAll9) {
					if(sb.charAt(prevMid) == '9' && sb.charAt(postMid)=='9') {
						isAll9 = true;
					}
					else {
						isAll9 = false;
					}
				}
				prevMid--;
				postMid++;
				
			}
			
			if(prevMid != -1 && postMid != digitCount) {
				isAll9 = false;
				System.out.println("Not Yet Implmented...");
				return -1;
			}
			
			if(prevMid == -1 && postMid == digitCount && !isAll9) {
				sb.setCharAt(digitCount/2-1 , (char) (sb.charAt(digitCount/2 -1 )+1));
				sb.setCharAt(digitCount/2 , (char) (sb.charAt(digitCount/2 )+1));
			}else if(isAll9) {
				sb.delete(0, digitCount);
				sb.append(1);
				for(int i = 1 ; i < digitCount ; i++) {
					sb.append(0);
				}
				sb.append(1);
			}
			
		}
		
		if (sb.charAt(digitCount / 2 - 1) < sb.charAt(digitCount / 2)) {
			sb.setLength(digitCount/2);
			sb.setCharAt(sb.length()-1, (char) (sb.charAt(sb.length()-1)+1));
			String revStr = sb.reverse().toString();
			sb.reverse().append(revStr);
		}

		return Integer.parseInt(sb.toString());
	}

	private static int findDigitCount(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num/10;
		}
		
		return count ;
	}

}
