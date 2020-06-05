package com.interview.ds.tree;

public class CheckIfBTIsBST {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.getBST();
		System.out.println("Level Order Traversal Of BST : ");
		TreeUtil.printLevelOrder2(root);
		boolean isBst = checkIfBST(root);
		System.out.println("If Binary Tree is Binary Search Tree ? "+isBst);	
		
		TreeNode root2 = TreeUtil.get7NodeTree();
		System.out.println("Level Order Traversal Of BST : ");
		TreeUtil.printLevelOrder2(root2);
		isBst = checkIfBST(root2);
		System.out.println("If Binary Tree is Binary Search Tree ? "+isBst);	
	}

	private static boolean checkIfBST(TreeNode root) {
		
		if(root == null) return true;
		
		if(root.left == null && root.right == null) return true;
		
		if(root.left != null && root.data > root.left.data) return true;
		else if (root.left != null && root.data < root.left.data) return false;
		if(root.right != null && root.data < root.right.data) return true;
		else if(root.right != null && root.data > root.right.data) return false;
		
		return checkIfBST(root.left) && checkIfBST(root.right);
	}

}
