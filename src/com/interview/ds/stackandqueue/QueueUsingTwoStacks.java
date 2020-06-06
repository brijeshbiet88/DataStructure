package com.interview.ds.stackandqueue;

import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
	 QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
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
     
     queue.enQueue(4);
     System.out.println("Queue : "+queue);
     queue.deQueue();
     System.out.println("Queue : "+queue);
     queue.enQueue(5);
     System.out.println("Queue : "+queue);
	}
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void enQueue(int data) {
		stack1.push(data);
	}

	public int deQueue() {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue Is Empty");
			System.exit(0);
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	public String toString() {
		return "Stack2 : "+stack2.toString()+" Stack1 : "+stack1.toString();
	}

}
