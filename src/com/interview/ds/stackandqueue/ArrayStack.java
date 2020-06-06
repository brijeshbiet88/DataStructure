package com.interview.ds.stackandqueue;

public class ArrayStack {
	
	public static void main(String [] args) {
		ArrayStack stack = new ArrayStack();
		System.out.println("Stack capacity : "+stack.capacity);
		System.out.println("Stack Top : "+stack.top);
		System.out.println("Is Empty : ? "+stack.isEmpty());
		stack.push(1);
		System.out.println("Is Empty : ? "+stack.isEmpty());
		stack.push(2);
		stack.push(3);
		System.out.println("Is Full : ? "+stack.isFull());
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Is Empty : ? "+stack.isEmpty());
		stack.pop();
	}

	private int top ;
	private int capacity ;
	private int [] array;
	
	public ArrayStack() {
		top = -1;
		capacity = 3;
		array = new int[capacity];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == capacity-1);
	}

	public void push(int data) {
		if(isFull())System.out.println("Stack Overflow");
		else {
			array[++top] = data;
		}
	}
	
	public int pop() {
	    int data = 0;
		if(isEmpty()) System.out.println("Stack Empty");
		else {
			data = array[top--];
			return data;
		}
		return data;
	}
}
/*Stack capacity : 3
Stack Top : -1
Is Empty : ? true
Is Empty : ? false
Is Full : ? true
Stack Overflow
Is Empty : ? true
Stack Empty*/
