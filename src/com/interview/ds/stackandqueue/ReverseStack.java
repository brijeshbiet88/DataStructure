package com.interview.ds.stackandqueue;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Stack Before Reversing ");
		System.out.println(stack);
		reverseStack(stack);
		System.out.println("Stack After Reversing");
		System.out.println(stack);
	}

	private static void reverseStack(Stack<Integer> stack) {

		if (stack.isEmpty())
			return;
		int data = stack.pop();
		reverseStack(stack);
		insertAtBottom(stack, data);
	}

	private static void insertAtBottom(Stack<Integer> stack, int data) {
		if (stack.isEmpty())
			stack.push(data); // If stack is Empty push the data
		else {
			Integer temp = stack.pop();
			insertAtBottom(stack, data); // if stack is Not empty pop the element
			stack.push(temp);
		}
	}

}
