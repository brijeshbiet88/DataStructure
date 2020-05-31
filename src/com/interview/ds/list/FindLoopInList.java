package com.interview.ds.list;

import java.util.HashSet;
import java.util.Set;

public class FindLoopInList {

	public static void main(String[] args) {
		ListNode start = new ListNode(0);
		start.setNext(new ListNode(1));
		start.next.setNext(new ListNode(2));
		start.next.next.setNext(new ListNode(3));
		start.next.next.next.setNext(new ListNode(4));
		start.next.next.next.next.setNext(new ListNode(5));
		start.next.next.next.next.next.setNext(new ListNode(6));
		start.next.next.next.next.next.next.setNext(start.next.next);
		
		boolean hasLoop = findLoop(LinkedListUtil.getList());
		System.out.println("Linked List Has Loop Two Pointers ? : "+hasLoop);
		
		hasLoop = findLoopHashing(start);
		System.out.println("Linked List Has Loop Hashing ? : "+hasLoop);

	}

	private static boolean findLoopHashing(ListNode start) {
		boolean hasLoop = false;
		ListNode temp = start;
		Set<ListNode> set = new HashSet<ListNode>();
		set.add(temp);
		while(temp != null ) {
			temp = temp.next;
			if(set.contains(temp)) {
				hasLoop = true;
				break;
			}else {
				set.add(temp);
			}
			
		}
		
		return hasLoop;
	}

	private static boolean findLoop(ListNode start) {
		boolean hasLoop = false;
		ListNode slow = start , fast = start;
		
		while(slow != null && fast != null ) {
			slow = slow.next;
			fast = fast.next;
			if(fast != null)
				fast = fast.next;
			
			if(slow == fast) {
				hasLoop = true;
				break;
			}
		}
		
		return hasLoop;
	}

}
