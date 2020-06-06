package com.interview.ds.stackandqueue;

import java.util.Stack;

public class QueueUsingStack {

	public static void main(String[] args) {
     QueueUsingStack queue = new QueueUsingStack();
     queue.enQueue(1);
     System.out.println("Queue : "+queue);
     queue.enQueue(2);
     System.out.println("Queue : "+queue);
     queue.enQueue(3);
     System.out.println("Queue : "+queue);
     
     queue.deQueue();
     System.out.println("Queue : "+queue);
     queue.deQueue();
     System.out.println("Queue : "+queue);
     queue.deQueue();
     System.out.println("Queue : "+queue);
	}
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void enQueue(int data) {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		stack1.push(data);

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}

	public int deQueue() {
		if (stack1.isEmpty()) {
			System.out.println("Q is Empty");
			stack1.pop();
		}

		int data = stack1.pop();
		return data;
	}
	
	public String toString() {
		return "Stack2 : "+stack2.toString()+" Stack1 : "+stack1.toString();
	}

}
/*
Queue : Stack2 : [] Stack1 : [1]
Queue : Stack2 : [] Stack1 : [2, 1]
Queue : Stack2 : [] Stack1 : [3, 2, 1]
Queue : Stack2 : [] Stack1 : [3, 2]
Queue : Stack2 : [] Stack1 : [3]
Queue : Stack2 : [] Stack1 : []
*/
