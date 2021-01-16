package com.interview.ds.list;

public class ReverseInGroupK {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList2();
		start = start.next.next;
		System.out.println("Print Original List :");
		LinkedListUtil.printList(start);
		System.out.println();
		start = reverseInGroup(start , 3);
		System.out.println("Print List After Reversing in Group K :");
		LinkedListUtil.printList(start);
	}

	private static ListNode reverseInGroup(ListNode head, int k) {
		ListNode curr = head , prev = null , next = null;
		int count  = 0;
		if(head == null) {
			return head;
		}else if(length(head) < k) {
			return head;
		}
		curr = head;
		while(count < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		
		 if (next != null)  
	          head.next = reverseInGroup(next, k); 
		
		return prev;
	}

	private static int length(ListNode start) {
		int len = 0;
		ListNode curr = start;
		while(curr != null) {
			curr = curr.next;
			len++;
		}
		
		return len;
	}

}
