package com.interview.ds.stackandqueue;

import java.util.Stack;

public class UnixPathSimplification {

	public static void main(String[] args) {
		String  unixPath = "/a/b/../c.//" ;
		System.out.println("Unix Path : "+unixPath);
		System.out.println("Simplified path : "+giveSimplifiedPath(unixPath));
		
		unixPath = "/a/b/../../../c.//" ;
		System.out.println("Unix Path : "+unixPath);
		System.out.println("Simplified path : "+giveSimplifiedPath(unixPath));
		
		unixPath = "/home/brijesh/../../programming/ds.//.//" ;
		System.out.println("Unix Path : "+unixPath);
		System.out.println("Simplified path : "+giveSimplifiedPath(unixPath));
	}

	private static String giveSimplifiedPath(String unixPath) {
		StringBuilder  simplifiedPath = new StringBuilder();
		Stack<String> s1 = new Stack<String>();
		Stack<String> s2 = new Stack<String>();
		String [] strArr = unixPath.split("/");
		
		for(int i = 0 ; i < strArr.length ; i++) {
			
			if("..".equals(strArr[i])) {
				if(!s1.isEmpty()) {
					s1.pop();
				}
			}
			
			else if(".".equals(strArr[i]) || "".equals(strArr[i]) || "/".equals(strArr[i])) {
				
			}
			else  {
				s1.push(strArr[i]);
			}
			
			
		}
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		while(!s2.isEmpty()) {
			simplifiedPath.append("/");
			simplifiedPath.append(s2.pop().replace(".", ""));
		}
		
		return simplifiedPath.toString();
		
	}

}

/*
Unix Path : /a/b/../c.//
Simplified path : /a/c
Unix Path : /a/b/../../../c.//
Simplified path : /c
Unix Path : /home/brijesh/../../programming/ds.//.//
Simplified path : /programming/ds
 
 */
