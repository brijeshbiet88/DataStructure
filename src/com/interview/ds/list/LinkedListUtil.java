package com.interview.ds.list;

public class LinkedListUtil {
	
	
	public static ListNode getList() {
		ListNode start = new ListNode(0);

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		ListNode node8 = new ListNode(8);
		ListNode node9 = new ListNode(9);

		start.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(node7);
		node7.setNext(node8);
		node8.setNext(node9);

		return start;
	}
	
	public static ListNode get3NodeList() {
		ListNode start = new ListNode(0);

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		
		start.setNext(node1);
		node1.setNext(node2);
		
		return start;
	}
	
	public static void printList(ListNode start) {
		ListNode temp = start;
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("Null");
		
	}

}
