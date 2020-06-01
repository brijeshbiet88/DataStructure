package com.interview.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNthLevelBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Level Order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		System.out.println("\nRight View Of Tree : ");
		printNthLeval(root , 3);
	}

	private static void printNthLeval(TreeNode root, int n) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int level = 0;
		while (!q.isEmpty()) {
			level++;
			int size = q.size();
			for (int i = 1; i <= size; i++) {
				TreeNode temp = q.poll();
				if (level == n)
					System.out.print(temp.data + " ");
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}

		}
		
	}
}
