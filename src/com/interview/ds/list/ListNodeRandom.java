package com.interview.ds.list;

public class ListNodeRandom {
	int data;
	ListNodeRandom next;
	ListNodeRandom random;
	
	public ListNodeRandom(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNodeRandom getNext() {
		return next;
	}

	public void setNext(ListNodeRandom next) {
		this.next = next;
	}

	public ListNodeRandom getRandom() {
		return random;
	}

	public void setRandom(ListNodeRandom random) {
		this.random = random;
	}

	@Override
	public String toString() {
		return "ListNodeRandom [data=" + data + "]";
	}
}
