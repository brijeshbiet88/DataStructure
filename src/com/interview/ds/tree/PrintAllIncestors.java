package com.interview.ds.tree;

public class PrintAllIncestors {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();

		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);

		TreeNode node = root.left.left.right;
		System.out.println("\nPrint All Ancestors of Node " + node);
		printAllAncestor(root, node);

	}

	private static boolean printAllAncestor(TreeNode root, TreeNode node) {
		if(root == null ) return false;
		
		if(root.left == node || root.right == node || printAllAncestor(root.left, node) || printAllAncestor(root.right, node)) {
			System.out.print(root.data+" ");
			return true;
		}
		
		return false;
	}

}
