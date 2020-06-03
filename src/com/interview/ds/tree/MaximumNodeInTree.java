package com.interview.ds.tree;

public class MaximumNodeInTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(3);
		root.setLeft(node1);
		root.setRight(node2);
		TreeNode node3 = new TreeNode(8);
		TreeNode node4 = new TreeNode(2);
		node1.setLeft(node3);
		node1.setRight(node4);

		System.out.println("Level Order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);

		int max = findMax(root);
		System.out.println("\nMaximum Node in Binary Tree : " + max);

		int min = findMin(root);
		System.out.println("Minimum Node in Binary Tree : " + min);

	}

	private static Integer findMax(TreeNode root) {
		if (root == null)
			return Integer.MIN_VALUE;

		int max = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);

		if (left > max)
			max = left;
		if (right > max)
			max = right;
		return max;

	}

	private static Integer findMin(TreeNode root) {
		if (root == null)
			return Integer.MAX_VALUE;

		int min = root.data;
		int left = findMin(root.left);
		int right = findMin(root.right);

		if (left < min)
			min = left;
		if (right < min)
			min = right;
		return min;

	}

}
