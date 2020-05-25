package com.interview.ds.list;

import java.util.Scanner;

public class PrintNthNodeFromLast {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		System.out.println("Print List : ");
		LinkedListUtil.printList(start);
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter The Value Of n : ");
		int n = sc.nextInt();
		ListNode nthLastNode = findNthLastNode(start , n);
		if(nthLastNode != null)
		System.out.println("\nNth Node From Last : "+nthLastNode.data);
		
		System.out.println("Find Nth Last Node In Single Itearation");
		nthLastNode = findNthLastNodeOneIteration(start , n);
		if(nthLastNode != null)
		System.out.println("\nNth Node From Last : "+nthLastNode.data);

	}

	private static ListNode findNthLastNode(ListNode start, int n) {
		int length = 0;
		
		ListNode temp = start;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
				
		if(n>length || n <= 0) {
			System.out.println("\nNode Does Not Exist");
			return null;
		}
		temp = start;
		for(int i = 0 ; i < length-n; i++) {
			temp= temp.next;
		}
		return temp;
	}
	
	private static ListNode findNthLastNodeOneIteration(ListNode start, int n) {
		ListNode node1 = start , node2 = start;
		
		int i = 0;
		while(node2 != null && i < n ) {
			node2 = node2.next;
			i++;
		}
		
		if(node2 == null || n<= 0) {
			System.out.println("Node Does Not Exist");
			return null;
		}
		
		while(node2 != null) {
			node1 = node1.next;
			node2 = node2.next;
		}
		
		return node1;
	}

}
