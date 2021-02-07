package com.interview.ds.streams;

public class ListNode {

	private Character data;
	ListNode next;
	ListNode pre;
	
	
	
	public ListNode(Character data) {
		super();
		this.data = data;
	}
	
	
	public Character getData() {
		return data;
	}
	public void setData(Character data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public ListNode getPre() {
		return pre;
	}
	public void setPre(ListNode pre) {
		this.pre = pre;
	}


	@Override
	public String toString() {
		return "ListNode [data=" + data + "]";
	}
	
	
}
