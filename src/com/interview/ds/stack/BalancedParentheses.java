package com.interview.ds.stack;

import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		String expression = "[(A+B)- { D * (A*B+C) } + (C*D)]";
		boolean isBalanced = isParenthesesBalanced(expression);
		System.out.println("Is Parentheses Balanced for Expression : "+expression+" : "+isBalanced);
		expression = "[(A+B)- { D * (A*B+C) }} + (C*D)]";
		isBalanced = isParenthesesBalanced(expression);
		System.out.println("Is Parentheses Balanced for Expression : "+expression+" : "+isBalanced);
		expression = "[(A+B)- { D * ({A*B+C) }} + (C*D)]";
		isBalanced = isParenthesesBalanced(expression);
		System.out.println("Is Parentheses Balanced for Expression : "+expression+" : "+isBalanced);
	}

	private static boolean isParenthesesBalanced(String expression) {
		boolean isBalanced = false;
		Stack<Character> stack = new Stack<Character>();
		expression = expression.replaceAll(" ", "");
		for(int i = 0 ; i < expression.length() ; i++) {
			
			if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
				stack.push(expression.charAt(i));
			}
			else if (expression.charAt(i) == ')' || expression.charAt(i) == '}' || expression.charAt(i) == ']') {
				 if(stack.isEmpty()) return false;
				 
				 if(expression.charAt(i) == ')' && stack.peek() == '(') {
					 stack.pop();
				 }
				 
				 else if(expression.charAt(i) == '}' && stack.peek() == '{') {
					 stack.pop();
				 }
				 else if(expression.charAt(i) == ']' && stack.peek() == '[') {
					 stack.pop();
				 }
				 else {
					 return false;
				 }
			}
		}
		
		if(stack.isEmpty()) return true;
		
		return isBalanced;
	}

}

/*
Is Parentheses Balanced for Expression : [(A+B)- { D * (A*B+C) } + (C*D)] : true
Is Parentheses Balanced for Expression : [(A+B)- { D * (A*B+C) }} + (C*D)] : false
Is Parentheses Balanced for Expression : [(A+B)- { D * ({A*B+C) }} + (C*D)] : false

 * 
 * */
