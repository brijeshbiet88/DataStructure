package com.interview.ds.list;

public class RotateList {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		System.out.println("Print List : ");
		LinkedListUtil.printList(start);
		System.out.println();
		System.out.println("--------------------Test Case 1-----------------------");
		System.out.println();
		int k = 41;
		start = rotateList(start , k);
		System.out.println("Print List After Rotating K : "+k+" Places ");
		LinkedListUtil.printList(start);
		System.out.println();
		
		System.out.println("--------------------Test Case 2-----------------------");
		System.out.println();
		k = 35;
		start = rotateList(start , k);
		System.out.println("Print List After Rotating K : "+k+" Places ");
		LinkedListUtil.printList(start);
		System.out.println();
		
		System.out.println("--------------------Test Case 3-----------------------");
		System.out.println();
		k = 70;
		start = rotateList(start , k);
		System.out.println("Print List After Rotating K : "+k+" Places ");
		LinkedListUtil.printList(start);
		System.out.println();
	}

	private static ListNode rotateList(ListNode start, int k) {
		if(start == null || k == 0) {
			return start;
		}
		
		ListNode tmp = start;
		int len = 1;
		
		while(tmp != null && tmp.next != null) {
			len++;
			tmp = tmp.next;
		}
		
		k = k % len;
		if(k == 0) {
			return start;
		}
		tmp.next = start;
		k = len - k ;
		
		tmp = start;
		len = 1;
		while(len != k) {
			len++;
			tmp = tmp.next;
		}
		
		start = tmp.next;
		tmp.next = null;
		
		return start;
	}

}

/*
 * Print List : 
0->1->2->3->4->5->6->7->8->9->Null
--------------------Test Case 1-----------------------

Print List After Rotating K : 41 Places 
9->0->1->2->3->4->5->6->7->8->Null
--------------------Test Case 2-----------------------

Print List After Rotating K : 35 Places 
4->5->6->7->8->9->0->1->2->3->Null
--------------------Test Case 3-----------------------

Print List After Rotating K : 70 Places 
4->5->6->7->8->9->0->1->2->3->Null

 * */
