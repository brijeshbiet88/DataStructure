package com.interview.ds.tree;

public class LeftInternalBoundaryNodes {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(3));
		
		root.left.setRight(new TreeNode(4));
		root.left.right.setLeft(new TreeNode(5));
		
		root.right.setLeft(new TreeNode(6));
		root.right.setRight(new TreeNode(7));
		
		System.out.println("Level Order Traversal Of Tree ");
		TreeUtil.printLevelOrder2(root);
		System.out.println("Print Left Internal Boundary Nodes ");
		printLeftInternalBoundaryNodes(root.left);
	}

	private static void printLeftInternalBoundaryNodes(TreeNode root) {
		
		if(root == null) {
			return ;
		}
		
		if(root.left != null) {
			System.out.println(root.data);
			printLeftInternalBoundaryNodes(root.left);
		}else if(root.right != null) {
			System.out.println(root.data);
			printLeftInternalBoundaryNodes(root.right);
		}
		
		
	}

}

/*
 * Level Order Traversal Of Tree 
1 
2 3 
4 6 7 
5 
Print Left Internal Boundary Nodes 
2
4
 * */
