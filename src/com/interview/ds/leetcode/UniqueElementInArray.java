package com.interview.ds.leetcode;

public class UniqueElementInArray {

	public static void main(String[] args) {
		int[] a = { 3, 7, 3, 1, 2, 1, 4, 2, 4 };
		System.out.println("Unique Element in Array is : "+findUnique(a));
		
		String str = "abcdbcaeepp";
		System.out.println("Unique Character in String" +str+" is : "+findUnique(str));
	}

	private static Character findUnique(String str) {
		int result = str.charAt(0);
		
		for(int i = 1 ; i < str.length() ; i++) {
			result = result ^ str.charAt(i);
		}
		
		return (char)result;
	}

	private static int findUnique(int[] a) {
		int result = a[0];
		for(int i = 1; i < a.length ; i++) {
			result = result ^ a[i];
		}
		
		return result;
	}

}
