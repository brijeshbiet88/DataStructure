package com.interview.ds.stackandqueue;

public class DynamicArrayStack {
	
	public static void main(String [] args) {
		DynamicArrayStack stack = new DynamicArrayStack();
		System.out.println("Stack capacity : "+stack.capacity);
		System.out.println("Stack Top : "+stack.top);
		System.out.println("Is Empty : ? "+stack.isEmpty());
		stack.push(1);
		System.out.println("Is Empty : ? "+stack.isEmpty());
		stack.push(2);
		stack.push(3);
		System.out.println("Is Full : ? "+stack.isFull());
		stack.push(4);
		System.out.println("Size Of Stack : "+stack.size());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Is Empty : ? "+stack.isEmpty());
		stack.pop();
		
		System.out.println("Size Of Stack : "+stack.size());
	}

	
	
	private int top ;
	private int capacity ;
	private int [] array;
	
	public DynamicArrayStack() {
		top = -1;
		capacity = 1;
		array = new int[capacity];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == capacity-1);
	}

	public void push(int data) {
		if(isFull()) {
			doubleStack();
		}
		array[++top] = data;
	}
	
	private void doubleStack() {
		int [] newArray = new int[capacity*2];
		System.arraycopy(array, 0, newArray, 0, capacity);
		capacity = capacity*2;
		array = newArray;
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
	
	public int size() {
		return top + 1;
	}

}
