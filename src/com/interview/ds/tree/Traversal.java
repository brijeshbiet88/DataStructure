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
		

		System.out.println("Method 2 Iterative Preorder Traversal Of Tree : ");
		preOrderTraversalIterative2(root);
		
		System.out.println();
		
		System.out.println("Postorder Traversal Of Tree : ");
		postOrderTraversal(root);
		
		System.out.println();
		
		System.out.println("Itearative Postorder Traversal Of Tree : ");
		postOrderTraversalIterative(root);
		
		System.out.println();
		
		System.out.println("Itearative Postorder Traversal Of Tree Using One Stack: ");
		postorderIterOneStack(root);
	}
	
	
	private static void preOrderTraversalIterative2(TreeNode root) {
		
		if(root == null) return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		
		while(!s.isEmpty()) {
			
			TreeNode temp = s.pop();
			System.out.print(temp.data+" ");
			if(temp.right != null) {
				s.push(temp.right);
			}
			if(temp.left != null) {
				s.push(temp.left);
			}
			
		}
		
	}


	private static void postOrderTraversalIterative(TreeNode root) {
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		TreeNode temp = root;
		s1.push(temp);
		while (!s1.isEmpty()) {
			TreeNode tmp = s1.pop();
			s2.push(tmp);
			
			if(tmp.left != null) {
				s1.push(tmp.left);
			}
			if(tmp.right != null) {
				s1.push(tmp.right);
			}
		
		}
		
		while(!s2.isEmpty()) {
			System.out.print(s2.pop().data+" ");
		}
		
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
	
	
	public static void postorderIterOneStack(TreeNode root) {
		if (root == null)
			return;
		TreeNode pre = null;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while (root != null || !s.empty()) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				root = s.peek();
				if (root.right == null || root.right == pre) {
					System.out.print(root.data + " ");
					s.pop();
					pre = root;
					root = null;
				} else
					root = root.right;
			}
		}
	}

}
