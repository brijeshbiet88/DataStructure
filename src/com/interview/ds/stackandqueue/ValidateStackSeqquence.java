package com.interview.ds.stackandqueue;

import java.util.Stack;

public class ValidateStackSeqquence {

	public static void main(String[] args) {
		System.out.println("------------------- Test Case 1----------------------");
		int [] pushed = {1 , 2 , 3 ,4 ,5};
		int [] popped = {4 , 5 , 3 , 2 , 1};
		System.out.println("Result : "+validateStackSequences(pushed, popped));
		System.out.println();
		System.out.println("------------------- Test Case 2----------------------");
		int [] pushed1 = {1 , 2 , 3 ,4 ,5};
		int [] popped1 = {4 , 5 , 1 , 2 , 3};
		System.out.println("Result : "+validateStackSequences(pushed1, popped1));
	}

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0 , j = 0;
		int n = pushed.length;
		while(i < n || j < n) {
			
			if(!stack.isEmpty() && stack.peek() == popped[j]) {
				stack.pop();
				j++;
			}else if(i < n){
				stack.push(pushed[i++]);
			}else {
				break;
			}
		}
		
		return stack.isEmpty() && j == n ? true : false;

	}

}

/*
 * ------------------- Test Case 1----------------------
Result : true

------------------- Test Case 2----------------------
Result : false

 * */
