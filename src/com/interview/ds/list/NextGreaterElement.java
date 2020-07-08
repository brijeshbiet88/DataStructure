package com.interview.ds.list;

import java.util.Stack;

/*
 * Examples 
 * Input1: 2->1->3->0->5
 * Output1: 3->3->5->5->0 
 * Input2: 1->2->3
 * Output2: 2->3->0  
 */
public class NextGreaterElement {

	public static void main(String[] args) {
		ListNode start = new ListNode(2);
		start.setNext(new ListNode(1));
		start.next.setNext(new ListNode(3));
		start.next.next.setNext(new ListNode(0));
		start.next.next.next.setNext(new ListNode(5));

		System.out.println("Initial List ...");
		LinkedListUtil.printList(start);

		start = createNextGreaterElementList(start);

		System.out.println("\nList With Elements as Next Greater Element ...");
		LinkedListUtil.printList(start);

		ListNode start2 = new ListNode(1);
		start2.setNext(new ListNode(2));
		start2.next.setNext(new ListNode(3));

		System.out.println("\n\nInitial List ...");
		LinkedListUtil.printList(start2);

		start2 = createNextGreaterElementList(start2);

		System.out.println("\nList With Elements as Next Greater Element ...");
		LinkedListUtil.printList(start2);

	}

	private static ListNode createNextGreaterElementList(ListNode start) {
		ListNode temp = start;
		ListNode newStart = null;
		ListNode newLast = null;
		Stack<Integer> stack = new Stack<Integer>();

		while (temp != null) {
			if (!stack.isEmpty() && stack.peek() > temp.data) {
				stack.push(temp.data);
			} else if (stack.isEmpty()) {
				stack.push(temp.data);
			} else {
				while (!stack.isEmpty() && stack.peek() < temp.data) {
					stack.pop();
					if (newStart == null) {
						newStart = new ListNode(temp.data);
						newLast = newStart;
					} else {
						newLast.setNext(new ListNode(temp.data));
						newLast = newLast.next;
					}

				}
				stack.push(temp.data);
			}
			temp = temp.next;
		}

		while (!stack.isEmpty()) {
			newLast.setNext(new ListNode(0));
			newLast = newLast.next;
			stack.pop();
		}
		return newStart;
	}
}

/*
Initial List ...
2->1->3->0->5->Null
List With Elements as Next Greater Element ...
3->3->5->5->0->Null

Initial List ...
1->2->3->Null
List With Elements as Next Greater Element ...
2->3->0->Null 
*/
