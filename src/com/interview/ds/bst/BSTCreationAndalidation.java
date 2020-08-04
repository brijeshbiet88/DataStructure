package com.interview.ds.bst;

public class BSTCreationAndalidation {
	
	public static void main(String[] args) {
		int [] a = {7 , 3 , 1 , 2 , 4 , 5 , 6};
		BSTNode root = createBST(a);
		System.out.println("Level Order Traversal : ");
		BSTUtil.traverseLevelOrder(root);
		System.out.println("Is Valid BST : "+CheckIfBST.isBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE));
		
	}

	private static BSTNode createBST(int[] a) {
		BSTNode root = null;
		for (int i = 0 ; i < a.length ; i++) {
			if(root == null) {
				root = new BSTNode(a[i]);
			}
			else {
				BSTNode node = new BSTNode(a[i]);
				addNodeinBST(root , node);
			}
		}
		return root;
		
	}

	private static void addNodeinBST(BSTNode root, BSTNode node) {
		if(root == null) 
			root = node;
		BSTNode tmp = root;
		
		while(true) {
			if(tmp.data == node.data) {
				return;
			}
			if(tmp.left != null && tmp.data > node.data) {
				tmp = tmp.left;
			}
			else if(tmp.right != null && tmp.data < node.data){
				tmp = tmp.right;
			}
			else if(tmp.left == null && tmp.data > node.data) {
				tmp.setLeft(node);
				break;
			}
			
			else if(tmp.right == null && tmp.data < node.data) {
				tmp.setRight(node);
				break;
			}
		}
		
		
	}
}
