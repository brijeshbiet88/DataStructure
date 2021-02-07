package com.interview.ds.lru;

public class ListUtil {

	public static void deleteNode(ListNode node ) {
			node.pre.next = node.next;
			node.next.pre = node.pre;
			node.next = null;
			node.pre = null;
		
	}
	
	public static ListNode addToHead(ListNode node , ListNode head) {
			node.next = head.next;
			head.next = node;
			node.next.pre = node;
			node.pre = head;
			
		
		return head;
	}

	public static void deleteTail(ListNode tail) {
		tail.pre.pre.next= tail;
		tail.pre = tail.pre.pre;
		
	}
	
}
