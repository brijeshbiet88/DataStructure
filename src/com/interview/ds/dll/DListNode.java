package com.interview.ds.dll;

public class DListNode {
	
	int data ;
	DListNode next;
	DListNode prev;
	
	public DListNode(int data) {
		this.data = data;
	}
	
	

	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public DListNode getNext() {
		return next;
	}



	public void setNext(DListNode next) {
		this.next = next;
	}



	public DListNode getPrev() {
		return prev;
	}



	public void setPrev(DListNode prev) {
		this.prev = prev;
	}



	@Override
	public String toString() {
		return "DListNode [data=" + data + "]";
	}
	
	

}
