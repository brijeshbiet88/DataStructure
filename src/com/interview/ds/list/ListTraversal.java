package com.interview.ds.list;

public class ListTraversal {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		System.out.println("Traverse List : ");
		traverseList(start);
	}

	private static void traverseList(ListNode start) {
		ListNode temp = start;
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("Null");
		
	}

}
