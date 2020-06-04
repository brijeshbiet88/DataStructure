package com.interview.ds.tree;

public class AllRootToLeafPathsBT {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();

		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		allRootToLeafPaths(root);

	}

	private static void allRootToLeafPaths(TreeNode root) {
		if (root == null)
			return;
		int pathLen = 0;
		int[] paths = new int[256];
		printRootToLeafPath(root, paths, pathLen);
	}

	private static void printRootToLeafPath(TreeNode root, int[] paths, int pathLen) {

		if (root == null)
			return;
		paths[pathLen++] = root.data;
		if (root.left == null && root.right == null) {
			printPath(paths, pathLen);
		}

		printRootToLeafPath(root.left, paths, pathLen);
		printRootToLeafPath(root.right, paths, pathLen);

	}

	private static void printPath(int[] paths, int pathLen) {
		System.out.println();
		for (int i = 0; i < pathLen; i++)
			System.out.print(paths[i] + " ");

	}

}
