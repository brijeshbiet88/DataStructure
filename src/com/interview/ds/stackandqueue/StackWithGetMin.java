package com.interview.ds.stackandqueue;

import java.util.Stack;

public class StackWithGetMin {

	public static void main(String[] args) {
		StackWithGetMin stack = new StackWithGetMin();
		stack.push(14);
		stack.push(12);
		stack.push(6);
		stack.push(9);
		stack.push(10);
		
		System.out.println("Min : "+stack.getMin());
		
		stack.pop();
		System.out.println("Min : "+stack.getMin());
		
		stack.pop();
		System.out.println("Min : "+stack.getMin());
		
		stack.pop();
		System.out.println("Min : "+stack.getMin());
		
		stack.pop();
		System.out.println("Min : "+stack.getMin());
				
		stack.push(7);
		System.out.println("Min : "+stack.getMin());
		
		stack.push(5);
		System.out.println("Min : "+stack.getMin());
		
		stack.push(1);
		System.out.println("Min : "+stack.getMin());
		
		stack.push(8);
		System.out.println("Min : "+stack.getMin());
		
		stack.push(9);
		System.out.println("Min : "+stack.getMin());
	}
	
	Stack <Integer> stack ;
	Stack <Integer> minStack;
	
	public StackWithGetMin() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}
	
	public int getMin() {
		if (stack.isEmpty()) {
			System.out.println("Stack Is Empty");		
		} 
		return minStack.peek();
	}

	public void push (int data) {
		if(!minStack.isEmpty() && data <= minStack.peek()) {
			minStack.push(data);
		}
		if(minStack.isEmpty()) minStack.push(data);
		stack.push(data);
	}
	
	public int pop() {
		if (stack.isEmpty()) {
			System.out.println("Stack Is Empty");
			return stack.pop();
		} else {
			int data = stack.pop();
			if (minStack.peek() == data) {
				minStack.pop();
			} 
			return data;
		}
	}
	
	public int peek() {
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
			return stack.peek();
			
		}
		return stack.peek();
	}
}
