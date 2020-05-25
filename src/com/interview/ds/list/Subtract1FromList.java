package com.interview.ds.list;

public class Subtract1FromList {

	public static void main(String[] args) {
		ListNode start = new ListNode(2);
		start.setNext(new ListNode(0));
		start.next.setNext(new ListNode(0));
		start.next.next.setNext(new ListNode(0));
		start.next.next.next.setNext(new ListNode(0));
		System.out.println("Linked List Before Adding One:");
		LinkedListUtil.printList(start);
		
		start = subtractOneFromList(start);
		
		System.out.println("\nLinked List After Subtracting One:");
		LinkedListUtil.printList(start);

	}

	private static ListNode subtractOneFromList(ListNode start) {

		ListNode temp = start, lastNon0Node = null;

		while (temp != null) {
			if (temp.data != 0) {
				lastNon0Node = temp;
			}
			temp = temp.next;
		}

		if (lastNon0Node == null) {
			ListNode newNode = new ListNode(-1);
			return newNode;
		}

		else {
			lastNon0Node.data = lastNon0Node.data - 1;
			lastNon0Node = lastNon0Node.next;
		}
		while (lastNon0Node != null) {
			lastNon0Node.data = 9;
			lastNon0Node = lastNon0Node.next;
		}

		return start;

	}

}
