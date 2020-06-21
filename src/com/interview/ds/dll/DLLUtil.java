package com.interview.ds.dll;

public class DLLUtil {

	public static DListNode getList() {
		DListNode head = new DListNode(1);
		
		DListNode node1 = new DListNode(2);
		DListNode node2 = new DListNode(4);
		DListNode node3 = new DListNode(6);
		DListNode node4 = new DListNode(8);
		DListNode node5 = new DListNode(10);
		DListNode node6 = new DListNode(12);
		DListNode node7 = new DListNode(13);
		DListNode node8 = new DListNode(15);
		DListNode node9 = new DListNode(17);
		
		head.setNext(node1);
		node1.setPrev(head);
		
		node1.setNext(node2);
		node2.setPrev(node1);

		node2.setNext(node3);
		node3.setPrev(node2);
		
		node3.setNext(node4);
		node4.setPrev(node3);
		
		node4.setNext(node5);
		node5.setPrev(node4);
		
		node5.setNext(node6);
		node6.setPrev(node5);
		
		node6.setNext(node7);
		node7.setPrev(node6);
		
		node7.setNext(node8);
		node8.setPrev(node7);
		
		node8.setNext(node9);
		node9.setPrev(node8);
		
		return head;
	}
	
	public static void printList(DListNode head) {
		DListNode temp = head;
		
		while(temp != null) {
			System.out.print("["+temp.data+"]-->");
			temp = temp.next;
		}
		System.out.println("Null");
	}
}
