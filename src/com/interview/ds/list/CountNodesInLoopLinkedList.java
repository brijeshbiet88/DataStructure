package com.interview.ds.list;

public class CountNodesInLoopLinkedList {

	public static void main(String[] args) {
		ListNode start = new ListNode(0);
		start.setNext(new ListNode(1));
		start.next.setNext(new ListNode(2));
		start.next.next.setNext(new ListNode(3));
		start.next.next.next.setNext(new ListNode(4));
		start.next.next.next.next.setNext(new ListNode(5));
		start.next.next.next.next.next.setNext(new ListNode(6));
		start.next.next.next.next.next.next.setNext(start.next.next);
		
		int  count = countNodesinLoop(LinkedListUtil.getList());
		System.out.println("Number Of Loops in Linked List Loop : "+count);
		count = 0;
		count = countNodesinLoop(start);
		System.out.println("Number Of Loops in Linked List Loop : "+count);

	}

	private static int countNodesinLoop(ListNode start) {
		int count = 0;
		ListNode slow = start, fast = start;

		while (slow != null && fast != null) {
			slow = slow.next;
			fast = fast.next;
			if (fast != null)
				fast = fast.next;

			if (slow == fast) {
				return countNodes(slow);
			}
		}
		return count;
	}

	private static int countNodes(ListNode slow) {
	
		ListNode temp = slow.next;
		int count = 1;
		
		while(slow != temp) {
			temp = temp.next;
			count ++;
		}
		
		return count;
	}

}
