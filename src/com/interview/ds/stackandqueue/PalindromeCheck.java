package com.interview.ds.stackandqueue;

import java.util.Stack;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str1 = "abccba";
		String str2 = "abcdcba";
		String str3 = "abcdmba";
		System.out.println("Is String " + str1 + "  Palindrome ? " + isPalindrome(str1));
		System.out.println("Is String " + str2 + " Palindrome ? " + isPalindrome(str2));
		System.out.println("Is String " + str3 + " Palindrome ? " + isPalindrome(str3));
	}

	private static boolean isPalindrome(String str) {
		Stack<Character> stack = new Stack<Character>();
		boolean isPalin = false;
		int stackEndIndex = str.length()/2-1 , stringStartIndex;
		boolean isEvenLength = (str.length() % 2 == 0) ? true : false;
		if(isEvenLength) {
			stringStartIndex = str.length()/2;
		}else {
			stringStartIndex = str.length()/2+1;
		}
		for(int i = 0 ; i <= stackEndIndex ; i++) {
			stack.push(str.charAt(i));
		}
		int i;
		for(i = stringStartIndex ; i < str.length() ; i++) {
			if(str.charAt(i) != stack.pop()) {
				return false;
			}
		}
		if(i == str.length()) isPalin = true;
		
		return isPalin;
	}

}
