package com.interview.ds.bst;

public class BSTNode {
	
	
	int data;
    BSTNode left;
	BSTNode right ;
	
	
	
	public BSTNode(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public BSTNode getLeft() {
		return left;
	}



	public void setLeft(BSTNode left) {
		this.left = left;
	}



	public BSTNode getRight() {
		return right;
	}



	public void setRight(BSTNode right) {
		this.right = right;
	}



	@Override
	public String toString() {
		return "BSTNode [data=" + data + "]";
	}
	
}
