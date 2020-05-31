package com.interview.ds.list;

public class LengthOfLinkedListRec {
	
	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		System.out.println("List : ");
		LinkedListUtil.printList(start);
		int length = findLenRec(start);
		System.out.println("\nLength of Linked List : "+length);
	}

	private static int findLenRec(ListNode start) {
		ListNode temp = start;
		if (temp == null) {
			return 0;
		}

		else
			return 1 + findLenRec(temp.next);
	}
}
