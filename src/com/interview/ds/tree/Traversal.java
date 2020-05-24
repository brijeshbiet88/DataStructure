package com.interview.ds.tree;

public class Traversal {

	public static void main(String[] args) {
		
		TreeNode root = TreeUtil.get7NodeTree();
		
		System.out.println("Inorder Traversal Of Tree : ");
		inOrderTraversal(root);
		
		System.out.println();
		
		System.out.println("Preorder Traversal Of Tree : ");
		preOrderTraversal(root);
		
		System.out.println();
		
		System.out.println("Postorder Traversal Of Tree : ");
		postOrderTraversal(root);
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
