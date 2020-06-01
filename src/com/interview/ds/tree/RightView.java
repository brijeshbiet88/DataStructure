package com.interview.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RightView {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Level Order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		System.out.println("\nRight View Of Tree : ");
		rightView(root);
	}

	private static void rightView(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);

		while (!q.isEmpty()) {

			int n = q.size();
			for (int i = 1; i <= n; i++) {
				TreeNode temp = q.poll();
				if (i == n)
					System.out.print(temp.data + " ");
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}

		}

	}

}
