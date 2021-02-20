package com.interview.ds.array;

public class IsSubsequence {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1---------------------");
		String s = "cat";
		String t = "carter";
		System.out.println("Is String "+s+" subsequence of "+t+" ? "+isSubsequence(s, t));
		System.out.println();
		
		System.out.println("---------------Test Case 2---------------------");
		s = "deed";
		t = "day weed dream";
		System.out.println("Is String "+s+" subsequence of "+t+" ? "+isSubsequence(s, t));
		System.out.println();
		
		
		System.out.println("---------------Test Case 3---------------------");
		s = "axc";
		t = "ace xray";
		System.out.println("Is String "+s+" subsequence of "+t+" ? "+isSubsequence(s, t));
		System.out.println();
		
		System.out.println("---------------Test Case 4---------------------");
		s = "";
		t = "ace xray";
		System.out.println("Is String "+s+" subsequence of "+t+" ? "+isSubsequence(s, t));
		System.out.println();

	}

	public static boolean isSubsequence(String s, String t) {
		if (s.isEmpty()) {
			return true;
		}
		int len = 0;
		int currIndex = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				len++;
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (ch >= 'a' && ch <= 'z' && ch == s.charAt(currIndex)) {
				currIndex++;
				if (currIndex == len)
					return true;
			}

		}

		return false;
	}
	
}

/*
 * ---------------Test Case 1---------------------
Is String cat subsequence of carter ? true

---------------Test Case 2---------------------
Is String deed subsequence of day weed dream ? true

---------------Test Case 3---------------------
Is String axc subsequence of ace xray ? false

---------------Test Case 4---------------------
Is String  subsequence of ace xray ? true


 * */
