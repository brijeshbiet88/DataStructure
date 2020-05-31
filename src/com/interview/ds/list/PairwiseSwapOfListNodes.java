package com.interview.ds.list;

public class PairwiseSwapOfListNodes {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		System.out.println("List Before Pairwise Swapping: ");
		LinkedListUtil.printList(start);
		pairwiseSwap(start);
		System.out.println("\nList After Pairwise Swapping: ");
		LinkedListUtil.printList(start);

	}

	private static void pairwiseSwap(ListNode start) {
		
		ListNode temp = start;
		
		while(temp != null && temp.next != null) {
			int data = temp.data;
			temp.data = temp.next.data;
			temp.next.data = data;
			temp = temp.next.next;
		}
	}

}
