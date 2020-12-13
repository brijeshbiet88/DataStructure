package com.interview.ds.list;

public class ReverseInGroupK {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList2();
		System.out.println("Print Original List :");
		LinkedListUtil.printList(start);
		System.out.println();
		start = reverseInGroup(start , 3);
		System.out.println("Print List After Reversing in Group K :");
		LinkedListUtil.printList(start);
	}

	private static ListNode reverseInGroup(ListNode start, int k) {
		ListNode curr = start , prev = null , next = null;
		int count  = 0;
		
		while(count < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		
		 if (next != null)  
	          start.next = reverseInGroup(next, k); 
		
		return prev;
	}

}
