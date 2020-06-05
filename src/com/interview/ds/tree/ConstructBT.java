package com.interview.ds.tree;

public class ConstructBT {

	public static void main(String[] args) {
		int [] inOrder = {4 , 2, 5 , 1 , 6, 3, 7};
		int [] preOrder = {1 , 2 , 4 , 5 , 3, 6 , 7};
		
		TreeNode root = constructTree(inOrder , preOrder , 0 , inOrder.length-1);
		System.out.println("Level Order Traversal Of Constructed Tree :");
		TreeUtil.printLevelOrder2(root);
	}
	
	static int preIndex = 0;
	private static TreeNode constructTree(int[] inOrder, int[] preOrder, int start, int end) {
		TreeNode newNode = new TreeNode();
		if(start > end) return null;
		newNode.setData(preOrder[preIndex]);
		preIndex++;
		if(start == end) return newNode;
		else {
			int inIndex = searchInorderIndex (inOrder , start , end , newNode.data);
			newNode.setLeft(constructTree(inOrder, preOrder, start, inIndex-1));
			newNode.setRight(constructTree(inOrder, preOrder, inIndex+1, end));
		}
		
		
		return newNode;
	}
	private static int searchInorderIndex(int[] inOrder, int start, int end, int data) {
	for(int i = 0 ; i < inOrder.length ; i++) {
		if(inOrder[i] == data)
			return i;
	}
	return -1;
		
	}

}
