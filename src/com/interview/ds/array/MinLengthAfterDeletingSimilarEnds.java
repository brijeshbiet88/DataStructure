package com.interview.ds.array;

public class MinLengthAfterDeletingSimilarEnds {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1-----------------");
		String str = "aabccabba";
		int minLen = findMinLen(str);
		System.out.println("Min String Length After Deleting: "+minLen);
		System.out.println();
		
		System.out.println("--------------Test Case 2-----------------");
	    str = "carrac";
		minLen = findMinLen(str);
		System.out.println("Min String Length After Deleting: "+minLen);
		System.out.println();
		
		System.out.println("--------------Test Case 3-----------------");
	    str = "ease";
		minLen = findMinLen(str);
		System.out.println("Min String Length After Deleting: "+minLen);
		System.out.println();
		
	}

	private static int findMinLen(String s) {
		int l = 0, r = s.length() - 1;
		while (l < r && s.charAt(l) == s.charAt(r)) {
			char ch = s.charAt(l);
			while (l <= r && s.charAt(l) == ch) {
				l++;
			}
			while (r >= l && s.charAt(r) == ch) {
				r--;
			}

		}
		if (l <= r) {
			System.out.println("Minimum String : " + s.substring(l, r + 1));
		}

		return l > r ? 0 : r - l + 1;
	}

}

/*
 * --------------Test Case 1-----------------
Minimum String : cca
Min String Length After Deleting: 3

--------------Test Case 2-----------------
Min String Length After Deleting: 0

--------------Test Case 3-----------------
Minimum String : as
Min String Length After Deleting: 2


 * */
