package com.interview.ds.stackandqueue;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1-----------------");
		String str = "abbaca";
		String reducedString = reduce(str);
			System.out.println(" Original String : "+str+" Reduced String : "+reducedString);
		System.out.println();
		
		
		System.out.println("--------------------Test Case 2-----------------");
		str = "aaaaaaaa";
		reducedString = reduce(str);
			System.out.println(" Original String : "+str+" Reduced String : "+reducedString);
		System.out.println();
		
		System.out.println("--------------------Test Case 3-----------------");
		str = "aaaaaaaaa";
		reducedString = reduce(str);
			System.out.println(" Original String : "+str+" Reduced String : "+reducedString);
		System.out.println();

	}

	private static String reduce(String S) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		stack.push(S.charAt(0));
		int i = 1;
		int n = S.length();
		while (i < n) {
			
			if(!stack.isEmpty() && stack.peek() == S.charAt(i)) {
				stack.pop();
				i++;
			}else{
				stack.push(S.charAt(i++));
			}
			
		}
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		return sb.reverse().toString();
	}

}
