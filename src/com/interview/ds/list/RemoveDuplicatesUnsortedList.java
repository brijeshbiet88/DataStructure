package com.interview.ds.list;

import java.util.HashSet;

public class RemoveDuplicatesUnsortedList {

	public static void main(String[] args) {
		ListNode start = new ListNode(1);
		start.setNext(new ListNode(1));
		start.next.setNext(new ListNode(1));
		start.next.next.setNext(new ListNode(3));
		start.next.next.next.setNext(new ListNode(4));
		start.next.next.next.next.setNext(new ListNode(3));
		start.next.next.next.next.next.setNext(new ListNode(1));
		
		System.out.println("\nLinked List Before Duplicate Removal ");
		LinkedListUtil.printList(start);

		start = removeDuplicatesHashing(start);
		System.out.println("\nLinked List After Duplicate Removal Using Hashing ");
		LinkedListUtil.printList(start);
		
		start = removeDuplicates(start);
		System.out.println("\nLinked List After Duplicate Removal Using Loops ");
		LinkedListUtil.printList(start);

	}

	private static ListNode removeDuplicatesHashing(ListNode start) {
		if (start == null)
			return start;
		ListNode curr = start.next, prev = start;
		HashSet<Integer> set = new HashSet<>();
		set.add(prev.data);
		while (curr != null) {
			if (set.contains(curr.data)) {
				prev.setNext(curr.next);
				curr = curr.next;
			} else {
				set.add(curr.data);
				prev = curr;
				curr = curr.next;
			}
		}
		return start;
	}
	
	private static ListNode removeDuplicates(ListNode start) {
	   ListNode ptr1 , ptr2 ;
	   ptr1 = start;
	   while(ptr1 != null && ptr1.next != null) {
		   ptr2 = ptr1;
		   
		   while(ptr2.next != null) {
			   
			   if(ptr1.data == ptr2.next.data) {
				   ListNode deleteNode = ptr2.next;
				   ptr2.setNext(ptr2.next.next);
				   System.gc();
			   }else {
				   ptr2 = ptr2.next;
			   }
		   }
		   ptr1 = ptr1.next;
	   }
		
		return start;
	}

}
