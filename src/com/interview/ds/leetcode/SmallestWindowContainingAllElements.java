package com.interview.ds.leetcode;


public class SmallestWindowContainingAllElements {
	
	public static void main(String[] args) {
	String str = "this is a test string with some twist";
	String ptr = "tist";
	
	int smallestWindow = findSmallestWindow(str , ptr);
	System.out.println("Smallest Window Length : "+smallestWindow);
	}

	private static int findSmallestWindow(String str, String ptr) {
		int smallestWindow = Integer.MAX_VALUE;
		int len1 = str.length();
		int len2 = ptr.length();
		
		int ptrArr[] = new int[256];  
        int strArr[] = new int[256]; 
      
       
        for (int i = 0; i < len2; i++) 
            ptrArr[ptr.charAt(i)]++; 
		

		if (len1 < len2) {
			System.out.println("Window Does Not Exists");
			return Integer.MAX_VALUE;
		}
		
		 int start = 0, startIndex = -1; 
		 
		 int count = 0;
	        for (int j = 0; j < len1 ; j++) { 
	            strArr[str.charAt(j)]++; 
	      
	            // If string's char matches with pattern's char 
	            // then increment count and do if the character occurence in string is <= ptr 
	            if (ptrArr[str.charAt(j)] != 0 && 
	            		strArr[str.charAt(j)] <= ptrArr[str.charAt(j)] ) 
	                count++; 
	      
	            // if all the characters are matched 
	            if (count == len2) 
	            { 
	                // Minimize the window with two conditions
	            	// a) any character occurs in window more no of times than in pattern
	            	// b) The character does not occur in pattern
	                while ( strArr[str.charAt(start)] > ptrArr[str.charAt(start)] 
	                    || ptrArr[str.charAt(start)] == 0) 
	                { 
	      
	                    if (strArr[str.charAt(start)] > ptrArr[str.charAt(start)]) 
	                        strArr[str.charAt(start)]--; 
	                    start++; 
	                } 
	      
	                // update window size 
	                int windowLen = j - start + 1; 
	                if (smallestWindow > windowLen) 
	                { 
	                	smallestWindow = windowLen; 
	                    startIndex = start; 
	                } 
	            } 
	        } 

	        if (startIndex == -1) 
	        { 
	        System.out.println("No such window exists"); 
	        return Integer.MAX_VALUE; 
	        } 
	      
	        // Return substring starting from startIndex 
	        // and length smallestWindow 
	        
	        System.out.println("Smallest Window : "+str.substring(startIndex, startIndex + smallestWindow));
	        return smallestWindow;
	}
}
