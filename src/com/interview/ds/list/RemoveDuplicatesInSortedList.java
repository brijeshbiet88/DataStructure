package com.interview.ds.list;

public class RemoveDuplicatesInSortedList {

	public static void main(String[] args) {
		ListNode start = new ListNode(0);
		start.setNext(new ListNode(1));
		start.next.setNext(new ListNode(1));
		start.next.next.setNext(new ListNode(3));
		start.next.next.next.setNext(new ListNode(3));
		start.next.next.next.next.setNext(new ListNode(3));
		start.next.next.next.next.next.setNext(new ListNode(4));
		
		System.out.println("Linked List Before Duplicate Removal ");
		LinkedListUtil.printList(start);

		start = removeDuplicates(start);
		System.out.println("Linked List After Duplicate Removal ");
		LinkedListUtil.printList(start);
	}

	private static ListNode removeDuplicates(ListNode start) {
		if(start == null) return start;
		ListNode prev = start, current = start.next;
		while (current != null) {
			while(current != null && prev.data == current.data) {
				current = current.next;
			}
			prev.setNext(current);
			prev = current;
			current = current.next;
		}
		return start;
	}

}
