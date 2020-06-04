package com.interview.ds.tree;

public class AllRootToLeafPathSum {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();

		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		allRootToLeafPathsSum(root);

	}

	private static void allRootToLeafPathsSum(TreeNode root) {
		if (root == null)
			return;
		int pathLen = 0;
		int[] paths = new int[256];
		printRootToLeafPathSum(root, paths, pathLen);
	}

	private static void printRootToLeafPathSum(TreeNode root, int[] paths, int pathLen) {

		if (root == null)
			return;
		paths[pathLen++] = root.data;
		if (root.left == null && root.right == null) {
			printPath(paths, pathLen);
		}

		printRootToLeafPathSum(root.left, paths, pathLen);
		printRootToLeafPathSum(root.right, paths, pathLen);

	}

	private static void printPath(int[] paths, int pathLen) {
		System.out.println();
		int sum = 0;
		for (int i = 0; i < pathLen; i++)
			sum = sum + paths[i];
			System.out.print("Sum Of Path : "+sum);

	}
}
