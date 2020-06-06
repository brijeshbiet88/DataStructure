package com.interview.ds.stackandqueue;

import java.util.Stack;

public class GetMinStackSingleStack
{ 
	public static void main(String[] args) {
		GetMinStackSingleStack stack = new GetMinStackSingleStack();
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
	
	
    Stack<Integer> stack; 
    Integer minElement; 
  
    public GetMinStackSingleStack() { 
    	stack = new Stack<Integer>(); 
    	} 
  
	public int getMin() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty");

		}
		return minElement;
	}
  
	public int peek() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty ");
			return stack.peek();
		}
		Integer data = stack.peek();
		if (data < minElement)
			return minElement;
		else
			return data;
	}
  
	public int pop() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty");
			return stack.pop();
		}

		System.out.print("Top Most Element Removed: ");
		Integer data = stack.pop();

		if (data < minElement) {
			minElement = 2 * minElement - data;
			return minElement;
		}

		else
			return data;
	}
  
    public void push(Integer data) 
    { 
        if (stack.isEmpty()) 
        { 
            minElement = data; 
            stack.push(data); 
            System.out.println("Number Inserted: " + data); 
            return; 
        } 
  
        /*The Stack will not hold original Values */
        if (data < minElement) 
        { 
            stack.push(2*data - minElement); 
            minElement = data; 
        } 
  
        else
            stack.push(data); 
  
        System.out.println("Number Inserted: " + data); 
    } 
}; 