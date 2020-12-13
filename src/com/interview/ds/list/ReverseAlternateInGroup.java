package com.interview.ds.list;

public class ReverseAlternateInGroup {


	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList2();
		System.out.println("Print Original List :");
		LinkedListUtil.printList(start);
		System.out.println();
		start = reverseInGroupAlt(start , 4);
		System.out.println("Print List After Reversing in Group K :");
		LinkedListUtil.printList(start);
	}

	private static ListNode reverseInGroupAlt(ListNode start, int k) {
		ListNode curr = start , prev = null , next = null;
		int count  = 0;
		
		while(count < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
	    start.next = next;
	    count = 0;
	    while(start != null && count <k) {
	    	start = start.next;
	    	count++;
	    }
	    if(start != null)
	    start.next = reverseInGroupAlt(start.next, k);
		
		return prev;
	}

}

/*
 * Print Original List :
0->1->2->3->4->5->6->7->8->9->10->11->12->13->14->15->16->17->18->Null
Print List After Reversing in Group K :
3->2->1->0->4->5->6->7->11->10->9->8->12->13->14->15->18->17->16->Null
 * */
