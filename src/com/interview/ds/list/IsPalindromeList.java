package com.interview.ds.list;

import java.util.Stack;

public class IsPalindromeList {

	public static void main(String[] args) {
		boolean isPalin = false;
		ListNode start1 = LinkedListUtil.getList();
		System.out.println("Traverse List 1: ");
		LinkedListUtil.printList(start1);
		isPalin = isPalinList(start1);
		System.out.println("\nIs Palindrome : "+isPalin);
		
		ListNode start2 = new ListNode(0);
		start2.setNext(new ListNode(1));
		start2.next.setNext(new ListNode(2));
		start2.next.next.setNext(new ListNode(3));
		start2.next.next.next.setNext(new ListNode(2));
		start2.next.next.next.next.setNext(new ListNode(1));
		start2.next.next.next.next.next.setNext(new ListNode(0));
		
		System.out.println("\nTraverse List 2: ");
		LinkedListUtil.printList(start2);
		isPalin = isPalinList(start2);
		System.out.println("\nIs Palindrome : "+isPalin);
		
	}

	private static boolean isPalinList(ListNode start) {
		boolean isPalin = false;
		Stack<Integer> stack = new Stack();
		ListNode temp = start;
		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}

		ListNode head = start;

		while (head != null) {
			int data = stack.pop();
			if (data == head.data) {
				isPalin = true;
				head = head.next;
			} else {
				isPalin = false;
				break;
			}
		}

		return isPalin;
	}

}
