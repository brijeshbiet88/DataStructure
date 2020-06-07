package com.interview.ds.string;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		String str = "true friends are never apart may be in distance but never in heart";
		System.out.println("Print Frequency Of Each Character");
		printFrequencyOfCharacters(str);

	}

	// assuming only small case letters and from a to z
	private static void printFrequencyOfCharacters(String str) {
		int [] arr = new int[26];
		str = str.replace(" ", "");
		for(int i = 0 ; i < str.length(); i++) {
			arr[str.charAt(i)-'a']++;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("Frequency of "+(char)('a'+i) +" is : "+arr[i]);
		}
	}

}
