package com.interview.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTreeTraversal {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Print Level Order Traversal :");
		TreeUtil.printLevelOrder2(root);
		System.out.println();
		System.out.println("Zig zag Traversal Of Tree Using Two Stacks : ");
		zigzagTraverse(root);
		
	}
	
	
	private static void zigzagTraverse(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> currLevel = new Stack<TreeNode>();
		Stack<TreeNode> nextLevel = new Stack<TreeNode>();

		boolean leftToRight = true;

		currLevel.add(root);

		while (!currLevel.isEmpty()) {

			TreeNode node = currLevel.pop();
			System.out.print(node.data + " ");
			if (leftToRight) {
				if (node.left != null) {
					nextLevel.add(node.left);
				}
				if (node.right != null) {
					nextLevel.add(node.right);
				}

			} else {
				if (node.right != null) {
					nextLevel.add(node.right);
				}
				if (node.left != null) {
					nextLevel.add(node.left);
				}
			}
			if (currLevel.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<TreeNode> tmp = currLevel;
				currLevel = nextLevel;
				nextLevel = tmp;
				System.out.println();
			}
		}

	}

}
/*
 * Print Level Order Traversal :
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 

Zig zag Traversal Of Tree Using Two Stacks : 
1 
3 2 
4 5 6 7 
15 14 13 12 11 10 9 8 
 * */
