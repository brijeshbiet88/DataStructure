package com.interview.ds.lru;

public class ListNode {
	
	private int data ;
	ListNode next;
	ListNode pre;
	
	public ListNode(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
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
