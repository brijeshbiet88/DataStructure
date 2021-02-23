package com.interview.ds.array;

import java.util.Arrays;
import java.util.List;

public class LongestWordInDixtionaryThrougghDeleting {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1---------------");
		String s = "abpcplea";
		List<String> d = Arrays.asList("ale","apple","monkey","plea");
		System.out.println("Longest Word In Dictionary through deleting : "+findLongestWord(s, d));
		System.out.println();
		
		System.out.println("----------------Test Case 1---------------");
		d = Arrays.asList("b","a","c","d");
		System.out.println("Longest Word In Dictionary through deleting : "+findLongestWord(s, d));
		System.out.println();
	}

	static public String findLongestWord(String s, List<String> d) {
		String longestWord = "";
		for(String word : d) {
			if(isSubSeq(word , s)) {
				if(word.length() > longestWord.length() || word.length() == longestWord.length() && word.compareTo(longestWord) < 0)
					longestWord = word;
			}
		}
		return longestWord;

	}

	private static boolean isSubSeq(String word, String s) {
		int j = 0;
		for(int i = 0; i < s.length() && j < word.length() ; i++) {
			if(s.charAt(i) == word.charAt(j)) {
				j++;
			}
		}
		return j >= word.length();
	}

}

/*
 * ----------------Test Case 1---------------
Longest Word In Dictionary through deleting : apple

----------------Test Case 1---------------
Longest Word In Dictionary through deleting : a


 * */
