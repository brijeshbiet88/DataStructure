package com.interview.ds.list;

public class ReverseListInGroupOfK {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		int k = 3;
		System.out.println("List Before Reversing in Group of : "+k);
		LinkedListUtil.printList(start);
		start = reverseInGroupK(start , k);
		System.out.println("\nList After Reversing in Group of : "+k);
		LinkedListUtil.printList(start);
	}

	private static ListNode reverseInGroupK(ListNode start, int k) {
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
	          start.next = reverseInGroupK(next, k); 
		
		return prev;
	}

}
