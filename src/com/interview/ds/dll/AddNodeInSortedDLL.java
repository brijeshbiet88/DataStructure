package com.interview.ds.dll;

import java.util.Scanner;

public class AddNodeInSortedDLL {

	public static void main(String[] args) {
		DListNode head = DLLUtil.getList();
		System.out.println("List Before Adding A Node In Sorted List : ");
		DLLUtil.printList(head);
		
		DListNode node0 = new DListNode(0);
		head = addInSortedDLL(head , node0);
		
		System.out.println("\nList After Adding Node In Sorted List : "+node0);
		DLLUtil.printList(head);
		
		DListNode node5 = new DListNode(5);
		head = addInSortedDLL(head , node5);
		
		System.out.println("\nList After Adding Node In Sorted List : "+node5);
		DLLUtil.printList(head);
		
		DListNode node20 = new DListNode(20);
		head = addInSortedDLL(head , node20);
		
		System.out.println("\nList After Adding Node In Sorted List : "+node20);
		DLLUtil.printList(head);
		
	}

	private static DListNode addInSortedDLL(DListNode head, DListNode node) {
		if(node == null || head == null) return head;
		DListNode temp = head;
		while(temp.next != null && temp.next.data < node.data) {
			temp = temp.next;
		}
		
		if(temp == head) {
			node.setNext(temp);
			temp.setPrev(node);
			head = node;
		}
		
		else {
			node.setNext(temp.next);
			node.setPrev(temp);
			temp.setNext(node);
		}
		
		return head;
		
	}

}
