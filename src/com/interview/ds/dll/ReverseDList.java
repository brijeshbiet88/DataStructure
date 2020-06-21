package com.interview.ds.dll;

public class ReverseDList {

	public static void main(String[] args) {
		DListNode head = DLLUtil.getList();
		System.out.println("List Before Reversing : ");
		DLLUtil.printList(head);
		head = reverse(head);
		System.out.println("List After Reversing : ");
		DLLUtil.printList(head);
	}

	private static DListNode reverse(DListNode head) {
		DListNode prev = null, curr = head , next = null;
		
		while(curr != null) {
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
			
		}
		return prev;
	}

}
