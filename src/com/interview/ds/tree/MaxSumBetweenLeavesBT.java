package com.interview.ds.tree;

public class MaxSumBetweenLeavesBT {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		root.setLeft(node1);
		root.setRight(node2);

		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(-2);
		node1.setLeft(node3);
		node1.setRight(node4);

		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node2.setLeft(node5);
		node2.setRight(node6);

		node3.setLeft(new TreeNode(2));
		node5.setLeft(new TreeNode(4));
		node6.setRight(new TreeNode(3));

		System.out.println("Leval Order Traversal Of Tree :");
		TreeUtil.printLevelOrder2(root);

		Res res = new Res();
		res.value = Integer.MIN_VALUE;
		findMaxSumBetweenLeaves(root, res);
		System.out.println("\n Max Sum Between Two Leaves is : " + res.value);
	}

	private static int findMaxSumBetweenLeaves(TreeNode root , Res res) {

		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return root.data;

		int leftSum = findMaxSumBetweenLeaves(root.left, res);
		int rightSum = findMaxSumBetweenLeaves(root.right, res);

		// As we want o return the result for subtree which has two leaves
		if (root.left != null && root.right != null) {

			res.value = Math.max(res.value, leftSum + rightSum + root.data);
			
			// returning path with maxSum 
			return Math.max(leftSum, rightSum) + root.data;
		}
		return (root.left == null) ? rightSum + root.data : leftSum + root.data;
	}
	
	static class Res {
		int value;
	}

}
