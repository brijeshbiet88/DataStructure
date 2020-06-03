package com.interview.ds.tree;

public class SearchInBinaryTree {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Level Order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		for (int num = 10; num < 20; num++) {
			boolean found = searchElementInBT(root, num);
			System.out.print("\nFound " + num +" : "+found);
		}
	}

	private static boolean searchElementInBT(TreeNode root, int item) {
		if (root == null)
			return false;

		if (item == root.data)
			return true;
		if (searchElementInBT(root.left, item))
			return true;
		return searchElementInBT(root.right, item);
	}

}
