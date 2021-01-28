package com.interview.ds.tree;

public class DiameterOfBinaryTree {
	public static int diameter = 0;
	public static int maxDiameter = 0;
	public static void main(String[] args) {
		TreeNode root = TreeUtil.get7NodeTree();
		root.right.right.setLeft(new TreeNode(8));
		root.left.left.setLeft(new TreeNode(9));
		root.left.left.left.setRight(new TreeNode(10));
		root.left.right.setLeft(new TreeNode(12));
		root.left.right.left.setRight(new TreeNode(13));
		
		System.out.println("Level Order Traversal :");
		TreeUtil.printLevelOrder2(root);
		
		int dm = findDiameter(root);
		System.out.println("Diameter of Binary Tree : "+diameter);
	}

	
	private static int findDiameter(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int lH = getHeight(root.left);
		int rH = getHeight(root.right);
		
		int diamtr = (1 + lH + rH);
		
		diameter = Math.max(diamtr, diameter);
		return 1 + Math.max(lH, rH);
		
	}
	
	
	public static int getHeight(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		int lHeight = getHeight(root.left);
		int rHeight = getHeight(root.right);
		int height = Math.max(lHeight, rHeight);
		
		return 1 + height;
		
	}

}
