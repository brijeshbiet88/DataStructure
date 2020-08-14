package com.interview.ds.list;

public class DeleteWithReferenceToNode {

	public static void main(String[] args) {
		ListNode start = LinkedListUtil.getList();
		ListNode temp = start.next.next.next;
		System.out.println("List Before Deleting temp Node : "+temp.data);
		LinkedListUtil.printList(start);
		deleteNode(temp);
		System.out.println("\nList After Deleting Temp Node : ");
		LinkedListUtil.printList(start);

	}
	
	 public static void deleteNode(ListNode node) {
		 if(node == null || node.next == null) return;
	        
		 ListNode next = node.next;
		 
		 int temp = node.data;
		 node.setData(next.data);
		 next.setData(temp);
		 
		 node.setNext(next.next);
		 next.next = null;
		 
	 }

}
/*
 List Before Deleting temp Node : 3
0->1->2->3->4->5->6->7->8->9->Null
List After Deleting Temp Node : 
0->1->2->4->5->6->7->8->9->Null 
 * */
 