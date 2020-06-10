package com.interview.ds.list;

public class ReverseAlternateKNodes {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList2();
		System.out.println("Print List Before Revrsing Alternate K Nodes : ");
		LinkedListUtil.printList(start);
		int k = 3;
		start = reverseAlternateKNode(start , k);
		System.out.println("\nPrint List After Revrsing Alternate K Nodes : ");
		LinkedListUtil.printList(start);
	}

	private static ListNode reverseAlternateKNode(ListNode start, int k) {
		ListNode curr = start, prev = null, next = null;
		int count = 0;

		while (count < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}

		// start points to kth Node , So change start to curr 
		if (start != null) {
			start.next = curr;
		}

		count = 0;
		// advance curr to k-1 positions to skip reversals
		while (count < k - 1 && curr != null) {
			curr = curr.next;
			count++;
		}

		if (curr != null) {
			curr.next = reverseAlternateKNode(curr.next, k);
		}

		return prev; 
	}

}

/*
Print List Before Revrsing Alternate K Nodes : 
0->1->2->3->4->5->6->7->8->9->10->11->12->13->14->15->16->17->18->Null
Print List After Revrsing Alternate K Nodes : 
2->1->0->3->4->5->8->7->6->9->10->11->14->13->12->15->16->17->18->Null
*/
