package com.interview.ds.bst;

public class CheckIfBST {

	public static void main(String[] args) {
		System.out.println("---------------Test case 1---------------");
		BSTNode root = BSTUtil.getBST7Nodes();
		BSTUtil.traverseLevelOrder(root);
		System.out.println("Is The Given Tree is BST : "+isBST(root));
	
		System.out.println();
		
		System.out.println("---------------Test case 2---------------");
		BSTNode root2 = new BSTNode(6);
		root2.setLeft(new BSTNode(4));
		System.out.println("Is The Given Tree is BST : "+isBST(root2));
		
		System.out.println();
		
		System.out.println("---------------Test case 3---------------");
		BSTNode root3 = new BSTNode(6);
		root3.setRight(new BSTNode(10));
		System.out.println("Is The Given Tree is BST : "+isBST(root3));
		
		System.out.println();
		
		System.out.println("---------------Test case 4---------------");
		BSTNode root4 = new BSTNode(6);
		root4.setLeft(new BSTNode(8));
		System.out.println("Is The Given Tree is BST : "+isBST(root4));
		
		System.out.println();
		
		System.out.println("---------------Test case 5---------------");
		BSTNode root5 = new BSTNode(6);
		root5.setRight(new BSTNode(4));
		System.out.println("Is The Given Tree is BST : "+isBST(root5));

	}

	private static boolean isBST(BSTNode root) {
		if(root == null ) return true;
		else if(root.left == null && root.right == null) return true;
		else if(root.left != null && root.data < root.left.data) return false;
		else if(root.right != null && root.data > root.right.data) return false;
		else if(root.left != null && root.right != null
				&& root.left.data < root.data
				&& root.right.data > root.data) return true;
		return (isBST(root.getLeft()) && isBST(root.getRight()));
		
	}

}
