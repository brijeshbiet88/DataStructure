package com.interview.ds.list;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {

	public static void main(String[] args) {
	
		int k = 3 ;
		
		ListNode start1 = new ListNode(1);
		start1.setNext(new ListNode(4));
		start1.next.setNext(new ListNode(7));
		
		ListNode start2 = new ListNode(2);
		start2.setNext(new ListNode(5));
		start2.next.setNext(new ListNode(8));
		
		ListNode start3 = new ListNode(3);
		start3.setNext(new ListNode(6));
		start3.next.setNext(new ListNode(9));
		
		ListNode [] arr = new ListNode[k];
		arr[0] = start1;
		arr[1] = start2;
		arr[2] = start3;
		
		ListNode start = mergeKSortedList(arr , k );
		
		System.out.println("Print Final List After Merging K Sorted List");
		LinkedListUtil.printList(start);
	}

	private static ListNode mergeKSortedList(ListNode[] arr, int k) {
		ListNode start = null, tail = null;

		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode a, ListNode b) {
				return a.data - b.data;
			}
		});

		// add First Element of each List
		for (int i = 0; i < k; i++) {
			if (arr[i] != null)
				pq.add(arr[i]);
		}

		while (!pq.isEmpty()) {
			ListNode temp = pq.peek();
			pq.remove();
			if (temp.next != null)
				pq.add(temp.next);
			if (start == null) {
				start = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
		}
		return start;

	}

}
/*
Print Final List After Merging K Sorted List
1->2->3->4->5->6->7->8->9->Null
 */
