package com.interview.ds.tree;

public class NodeCountRec {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get7NodeTree();
		System.out.println("Traversal Of Tree : ");
		LevelOrderTraversal.printLevelOrder(root);
		int nodeCount = countNodes(root);
		System.out.println("\nNode Count : "+nodeCount);
	}

	private static int countNodes(TreeNode root) {
		if(root == null)
			return 0;
		
		return 1 + countNodes(root.left)+countNodes(root.right);
	}

}
