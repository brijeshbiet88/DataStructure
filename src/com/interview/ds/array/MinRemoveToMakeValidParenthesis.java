package com.interview.ds.array;

public class MinRemoveToMakeValidParenthesis {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1 -------------------");
		String s = "lee(t(c)o)de)";
		System.out.println("Input : "+s+" and Result  "+minRemoveToMakeValid(s));
		System.out.println();

	}
	
	
	
	 public static String minRemoveToMakeValid(String s) {
	        int open = 0;
	        char ch [] = s.toCharArray();
	        for(int i = 0; i < s.length() ; i++) {
	        	if(ch[i] == '(') {
	        		open++;
	        	}else if( ch[i] == ')') {
	        		if(open == 0) {
	        			ch[i]='$';
	        		}else {
	        			open--;
	        		}
	        	}
	        }
	       
	        for(int i = ch.length -1 ; i >= 0 && open > 0; i--) {
	        	if(ch[i] == '(') {
	        		ch[i] = '$';
	        		open--;
	        	}
	        }
	        
	        StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < ch.length ; i++) {
				if(ch[i] != '$') {
					sb.append(ch[i]);
				}
			}
	        
	        return sb.toString();
	        
	  }

}
