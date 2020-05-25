package com.interview.ds.list;

public class ReverseList {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		System.out.println("List Before Reversing : ");
		LinkedListUtil.printList(start);
		start = reverse(start);
		System.out.println("\nList After Reversing : ");
		LinkedListUtil.printList(start);
		
		
		start = LinkedListUtil.get3NodeList();
		System.out.println("\nList Before Reversing Recursivley: ");
		LinkedListUtil.printList(start);
		start = reverseRec(start , null);
		System.out.println("\nList After Reversing Recursivley: ");
		LinkedListUtil.printList(start);
	}

	public static ListNode reverseRec(ListNode curr, ListNode prev) {
		
		if(curr == null) return prev;
		
		ListNode next = curr.next;
		curr.setNext(prev);
		prev = curr; 
		return reverseRec(next, prev);
		
	}

	public static ListNode reverse(ListNode start) {
		ListNode prev = null , curr = start, next ;
		
		while(curr != null) {
			next = curr.next;
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		
		return prev;
	}

}
