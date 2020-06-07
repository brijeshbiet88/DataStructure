package com.interview.ds.string;

public class AllPermutationOfString {
	
	public static void main(String[] args) 
    { 
        String str = "abcd"; 
        permute(str, 0 , str.length()-1); 
    }

	private static void permute(String str, int low, int high) {
		if (low == high)
			System.out.print(str+" ");
		else {
			for (int i = low; i <= high; i++) {
				str = swap(str, low, i);
				permute(str, low + 1, high);
				str = swap(str, low, i);
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char temp; 
        char[] charArray = str.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
	}


	
}
