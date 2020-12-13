package com.interview.ds.stackandqueue;

import com.interview.ds.list.ListNode;

public class StackLL {

	ListNode head = null;
	ListNode top = null;
	
	public void push (int data) {
		if(head == null) {
			head = new ListNode(data);
			top = head;
		}
		else {
			top.setNext(new ListNode(data));
			top = top.getNext();
		}
	}
	
	public int pop () {
		if(top == null) {
			System.out.println("Stack UnderFlow");
			return Integer.MIN_VALUE;
		}
		int data;
		if(top == head) {
			data = head.getData();
			top = head = null;
			return data;
		}
		
		ListNode tmp = head;
		
		while(tmp.getNext() != top) {
			tmp = tmp.getNext();
		}
		data = top.getData();
		top = tmp;
		tmp.setNext(null);
		
		return data;
	}
	
	public int peek () {
		if(top == null) {
			System.out.println("Stack UnderFlow");
			return Integer.MIN_VALUE;
		}	
		return top.getData();
	}
	
	public boolean isEmpty () {
		if(top == null) {
			return true;
		}	
		return false;
	}
	
	
	public static void main(String [] args) {
		StackLL s = new StackLL();
		s.push(1);
		System.out.println("Stack Peek : "+s.peek());
		s.push(2);
		System.out.println("Stack Peek : "+s.peek());
		s.push(3);
		System.out.println("Stack Peek : "+s.peek());
		s.push(4);
		System.out.println("Stack Peek : "+s.peek());
		s.pop();
		System.out.println("Stack Peek : "+s.peek());
		s.pop();
		System.out.println("Stack Peek : "+s.peek());
		s.pop();
		System.out.println("Stack Peek : "+s.peek());
		System.out.println("Is Stack Empty : "+s.isEmpty());
		s.pop();
		System.out.println("Stack Peek : "+s.peek());
		System.out.println("Is Stack Empty : "+s.isEmpty());
		
	}
}

/*
 * Stack Peek : 1
Stack Peek : 2
Stack Peek : 3
Stack Peek : 4
Stack Peek : 3
Stack Peek : 2
Stack Peek : 1
Is Stack Empty : false
Stack UnderFlow
Stack Peek : -2147483648
Is Stack Empty : true
 * */
