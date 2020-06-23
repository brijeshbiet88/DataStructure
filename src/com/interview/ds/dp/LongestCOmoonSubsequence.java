package com.interview.ds.dp;

public class LongestCOmoonSubsequence {

	public static void main(String[] args) {
		String str1 = "abcdefa";
		String str2 = "acbcfa";
		
		System.out.println("Longest Common SubSeuqence Of Strings "+str1+" and "+str2);
		
		int lcs = findLCS(str1 , str2);
		System.out.println("Longest Common SubSequence Using Dynamic Programming : "+lcs);
		
		lcs = findLCSRec(str1.toCharArray() , str2.toCharArray() , 0 ,  0);
		System.out.println("Longest Common SubSequence Using Recursion  Method   : "+lcs);

	}

	private static int findLCS(String str1, String str2) {
		int n1 = str1.length() , n2 = str2.length();
		int [][] arr = new int [n1+1][n2+1];
		
		for (int i = 1 ; i <= n1 ; i++) {
			for(int j = 1 ; j <= n2 ; j++ ) {
				
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1] + 1;
				}
				else {
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
				}
			}
		}
		
		return arr[n1][n2];
	}
	
	 private static int findLCSRec(char str1[],char str2[],int len1, int len2){
	        
	        if(len1 == str1.length || len2 == str2.length){
	            return 0;
	        }
	        if(str1[len1] == str2[len2]){
	            return 1 + findLCSRec(str1,str2,len1+1,len2+1);
	        }
	        else{
	            return Math.max(findLCSRec(str1,str2,len1+1,len2),findLCSRec(str1,str2,len1,len2+1));
	        }
	    }

}
/*
Longest Common SubSeuqence Of Strings abcdefa and acbcfa
Longest Common SubSequence Using Dynamic Programming : 5
Longest Common SubSequence Using Recursion  Method   : 5

 */
