package com.interview.ds.list;

public class SearchInListRec {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		System.out.println("List : ");
		LinkedListUtil.printList(start);
		int element = 7;
		ListNode node = findElement(start , element);
		if (node != null)
			System.out.println("\nElement Found : " + element);
		else
			System.out.println("Element Not Found : " + element);
		element = 12;
		node = findElement(start , 12);
		node = findElement(start , element);
		if (node != null)
			System.out.println("Element Found : " + element);
		else
			System.out.println("Element Not Found : " + element);

	}

	private static ListNode findElement(ListNode start, int element) {
		ListNode temp = start;
		if(temp == null) return temp;
		if(temp.data == element)
			return temp;
		else return findElement(temp.next, element);
		
	}

}
