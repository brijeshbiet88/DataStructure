package com.interview.ds.tree;

import java.util.Stack;

public class Traversal {

	public static void main(String[] args) {
		
		TreeNode root = TreeUtil.get7NodeTree();
		
		System.out.println("Inorder Traversal Of Tree : ");
		inOrderTraversal(root);
		
		System.out.println();
		
		System.out.println("Iterative Inorder Traversal Of Tree : ");
		inOrderTraversalIterative(root);
		
		System.out.println();
		
		System.out.println("Preorder Traversal Of Tree : ");
		preOrderTraversal(root);
		
		System.out.println();
		

		System.out.println("Iterative Preorder Traversal Of Tree : ");
		preOrderTraversalIterative(root);
		
		System.out.println();
		
		System.out.println("Postorder Traversal Of Tree : ");
		postOrderTraversal(root);
	}
	
	
	private static void inOrderTraversalIterative(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode temp = root;
		while (true) {

			while (temp != null) {
				s.push(temp);
				temp = temp.left;
			}

			if (s.isEmpty())
				break;

			TreeNode node = s.pop();
			System.out.print(node.data + " ");
			temp = node.right;

		}
	}

	private static void preOrderTraversalIterative(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode temp = root;
		while (true) {

			while (temp != null) {
				s.push(temp);
				System.out.print(temp.data + " ");
				temp = temp.left;
			}

			if (s.isEmpty())
				break;

			TreeNode node = s.pop();
			temp = node.right;

		}
	}

	public static void inOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.getLeft());
		System.out.print(root.getData()+" ");
		inOrderTraversal(root.getRight());
		
	}
	
	public static void preOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.getData()+" ");
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
		
	}
	
	public static void postOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.print(root.getData()+" ");
	}

}
