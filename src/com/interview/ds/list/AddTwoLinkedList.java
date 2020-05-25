package com.interview.ds.list;

public class AddTwoLinkedList {

	public static void main(String[] args) {
		ListNode start = new ListNode(9);
		start.setNext(new ListNode(8));
		start.next.setNext(new ListNode(9));
		start.next.next.setNext(new ListNode(7));
		start.next.next.next.setNext(new ListNode(9));
		System.out.println("Linked List 1:");
		LinkedListUtil.printList(start);
		
		start = ReverseList.reverse(start);
		
		
		
		
		ListNode start2 = new ListNode(6);
		start2.setNext(new ListNode(9));
		start2.next.setNext(new ListNode(9));
		start2.next.next.setNext(new ListNode(4));
		System.out.println("\nLinked List 2:");
		LinkedListUtil.printList(start2);
		start2 = ReverseList.reverse(start2);
		
		
		ListNode result = addLinkedList(start,start2);
		
		System.out.println("\nLinked List After Summation :");
		LinkedListUtil.printList(result);

	}

	/*
	 * Adding two LinkedLists Represented by numbers 98979 and 6994
	 * Assuming that start is longer is greater than start2 
	 */
	private static ListNode addLinkedList(ListNode start, ListNode start2) {
		int carry = 0;
		ListNode result = start;
		while(start!=null && start2 != null) {
			int sum = carry + start.data + start2.data;
			carry = sum / 10;
			sum = sum % 10;
			start.data = sum ;
			start = start.next;
			start2 = start2.next;
		}
		
		if(carry != 0) {
			while(start != null) {
			start.data = start.data + carry;
			carry = start.data/10;
			start.data = start.data % 10;
			start = start.next;
			}
		}
		
	    result = ReverseList.reverse(result);
		
		if (carry != 0) {
			ListNode newNode = new ListNode(carry);
			newNode.setNext(result);
			result = newNode;
		}
		return result;
	}

}
