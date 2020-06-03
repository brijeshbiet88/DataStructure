package com.interview.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertNodeInBT {

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
		
		TreeNode node = new TreeNode(6);
		insertNode(root , node);
		
		System.out.println("\nLevel Order Traversal Of Tree After Inserting Node : "+node);
		TreeUtil.printLevelOrder(root);
	}

	private static void insertNode(TreeNode root, TreeNode newNode) {
		if (root == null) {
			root = newNode;
			return;
		}
		if (newNode == null) {
			return;
		}

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode current = root;
		q.add(current);

		while (!q.isEmpty()) {
			
			TreeNode temp = q.poll();
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			else {
				temp.left = newNode;
				break;
			}
			
			if(temp.right != null) {
				q.add(temp.right);
			}
			else {
				temp.right = newNode;
				break;
			}
		}
	}

}
