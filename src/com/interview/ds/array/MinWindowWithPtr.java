package com.interview.ds.array;

public class MinWindowWithPtr {

	public static void main(String[] args) {
		System.out.println("-------------------Test Case 1------------------");
		String str = "ADOBECODEBANC";
		String ptr = "ABC";
		String minWindow = findMinWindow(str , ptr);
		System.out.println("Minimum Window in String: "+str+" containing Pattern: "+ptr +" is "+minWindow+" And Length is: "+minWindow.length());
		System.out.println();
		
		System.out.println("-------------------Test Case 2------------------");
		str = "this is another test case . is it working?";
		ptr = "iit";
		minWindow = findMinWindow(str , ptr);
		System.out.println("Minimum Window in String: "+str+" containing Pattern: "+ptr +" is "+minWindow+" And Length is: "+minWindow.length());
		System.out.println();
		
		System.out.println("-------------------Test Case 3------------------");
		str = "INDIA IS A GREAT COUNTRY";
		ptr = "IC";
		minWindow = findMinWindow(str , ptr);
		System.out.println("Minimum Window in String: "+str+" containing Pattern: "+ptr +" is "+minWindow+" And Length is: "+minWindow.length());
		System.out.println();
	}

	private static String findMinWindow(String str, String ptr) {
		int minW = Integer.MAX_VALUE;
		int count = 0;
		int ptrLen = ptr.length();
		int strLen = str.length();
		
		int strArr [] = new int [256];
		int ptrArr [] = new int [256];
		
		for(int i = 0 ; i < ptrLen ; i++) {
			ptrArr[ptr.charAt(i)]++;
		}
		int startIndex = -1 , start = 0;
		for (int i = 0 ; i < strLen ; i++) {
			char ch = str.charAt(i);  
			strArr[ch]++;
			if(ptrArr[ch] != 0 && strArr[ch] <= ptrArr[ch]) {
				count++;
			}
			
			if(count == ptrLen) {
				
				while (strArr[str.charAt(start)] > ptrArr[str.charAt(start)] || ptrArr[str.charAt(start)] == 0) {
					if (strArr[str.charAt(start)] > ptrArr[str.charAt(start)])
						strArr[str.charAt(start)]--;
					start++;
					

				}
				
				 int len_window = i - start + 1; 
	                if (minW > len_window) 
	                { 
	                    minW = len_window; 
	                    startIndex = start; 
	                } 
					
			}
		}
		  if (startIndex == -1) 
	        { 
	        System.out.println("window doesn't exists"); 
	        return ""; 
	        } 
		return str.substring(startIndex , startIndex + minW);
	}

}

/*
 * -------------------Test Case 1------------------
Minimum Window in String: ADOBECODEBANC containing Pattern: ABC is BANC And Length is: 4

-------------------Test Case 2------------------
Minimum Window in String: this is another test case . is it working? containing Pattern: iit is is it And Length is: 5

-------------------Test Case 3------------------
Minimum Window in String: INDIA IS A GREAT COUNTRY containing Pattern: IC is IS A GREAT C And Length is: 12


 * */
