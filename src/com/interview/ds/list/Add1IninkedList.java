package com.interview.ds.list;

public class Add1IninkedList {

	public static void main(String[] args) {
		ListNode start = new ListNode(3);
		start.setNext(new ListNode(8));
		start.next.setNext(new ListNode(9));
		start.next.next.setNext(new ListNode(7));
		start.next.next.next.setNext(new ListNode(9));
		System.out.println("Linked List Before Adding One:");
		LinkedListUtil.printList(start);
		
		start = addOneToList(start);
		
		System.out.println("\nLinked List After Adding One:");
		LinkedListUtil.printList(start);
		
		
		ListNode start2 = new ListNode(9);
		start2.setNext(new ListNode(9));
		start2.next.setNext(new ListNode(9));
		start2.next.next.setNext(new ListNode(9));
		start2.next.next.next.setNext(new ListNode(9));
		System.out.println("\nLinked List2 Before Adding One:");
		LinkedListUtil.printList(start2);
		
		start2 = addOneToList(start2);
		
		System.out.println("\nLinked List2 After Adding One:");
		LinkedListUtil.printList(start2);
	}

	private static ListNode addOneToList(ListNode start) {
		ListNode temp = start , lastNon9Node = null ;
		
		while(temp != null) {
			if(temp.data != 9) {
				lastNon9Node = temp;
			}
			temp = temp.next;
		}
		
		if(lastNon9Node == null) {
			ListNode newNode = new ListNode(1);
			newNode.setNext(start);
			start = newNode;
			lastNon9Node = start.next;		
		}
		
		else {
			lastNon9Node.data = lastNon9Node.data+1;
			lastNon9Node = lastNon9Node.next;
		}
		while(lastNon9Node != null) {
			lastNon9Node.data = 0;
			lastNon9Node = lastNon9Node.next;
		}
		
		return start;
	}

}
