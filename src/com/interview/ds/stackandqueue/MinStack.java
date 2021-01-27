package com.interview.ds.stackandqueue;

import java.util.Stack;

public class MinStack extends Stack<Integer>{
  
	private static final long serialVersionUID = 1L;
	Stack<Integer> minStack ;
	
	public MinStack() {
		minStack = new Stack<Integer>();
	}
	
	public void push(int x) {
		super.push(x);
		if(minStack.isEmpty()) {
			minStack.push(x);
		}
		else {
			int y = minStack.peek();
			if(y > x) {
				minStack.push(x);
			}else {
				minStack.push(y);
			}
		}
	}
	
	public Integer pop()
    {
        int x = super.pop();
        minStack.pop();
        return x;
    }
 
    /* SpecialStack's member method to get 
minimum element from it. */
    int getMin()
    {
        int x = minStack.pop();
        minStack.push(x);
        return x;
    }
	
	public static void main (String [] args) {
		MinStack s = new MinStack();
		s.push(15);
		System.out.println("Pushed Element : "+s.peek());
		System.out.println("Min Element: "+s.getMin());
		s.push(9);
		System.out.println("Pushed Element : "+s.peek());
		System.out.println("Min Element: "+s.getMin());
		s.push(5);
		System.out.println("Pushed Element : "+s.peek());
		System.out.println("Popped Element : "+s.pop());
		System.out.println("Min Element : "+s.getMin());
		s.push(3);
		System.out.println("Pushed Element : "+s.peek());
		System.out.println("Popped Element : "+s.pop());
		System.out.println("Popped Element : "+s.pop());
		System.out.println("Min Element: "+s.getMin());
		s.push(2);
		System.out.println("Pushed Element : "+s.peek());
		s.push(7);
		System.out.println("Pushed Element : "+s.peek());
		System.out.println("Popped Element : "+s.pop());
		System.out.println("Min Element: "+s.getMin());
		s.push(8);
		System.out.println("Pushed Element : "+s.peek());
		System.out.println("Popped Element : "+s.pop());
		System.out.println("Min Element: "+s.getMin());
		s.push(7);
		System.out.println("Pushed Element : "+s.peek());
		System.out.println("Min Element: "+s.getMin());
		s.push(2);
		System.out.println("Pushed Element : "+s.peek());
		System.out.println("Popped Element : "+s.pop());
		System.out.println("Min Element: "+s.getMin());
	}

}
