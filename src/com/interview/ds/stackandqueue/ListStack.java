package com.interview.ds.stackandqueue;

import com.interview.ds.list.ListNode;

public class ListStack {

	public static void main(String[] args) {
	
		ListStack stack = new ListStack();
		System.out.println("Is Stack Empty : "+stack.isEmpty());
		stack.push(1);
		System.out.println("Is Stack Empty : "+stack.isEmpty());
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Stack Size : "+stack.size());
		
		Integer poppedNode = stack.pop();
		System.out.println("Popped element : "+poppedNode);
		poppedNode = stack.pop();
		System.out.println("Popped element : "+poppedNode);
		poppedNode = stack.pop();
		System.out.println("Popped element : "+poppedNode);
		poppedNode = stack.pop();
		System.out.println("Popped element : "+poppedNode);
		poppedNode = stack.pop();
		System.out.println("Popped element : "+poppedNode);
		stack.pop();
		System.out.println("Stack Size : "+stack.size());
		stack.pop();
		System.out.println("Is Stack Empty : "+stack.isEmpty());
	}
	
	ListNode head ;
	
	public ListStack() {
		
	}
	
	public Integer pop() {
		if (head == null) {
			System.out.println("Stack is Empty");
			return null;
		}
		int data = head.getData();
		head = head.getNext();
		return data;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void push(int data) {
		if(head == null) {
			head = new ListNode(data);
		}
		else {
			ListNode newNode = new ListNode(data);
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public int size() {
		if (head == null) return 0;
		else {
			int count = 0;
			ListNode tmp = head;
			while(tmp != null) {
				tmp = tmp.getNext();
				count++;
			}
			return count;
		}
	}

}
