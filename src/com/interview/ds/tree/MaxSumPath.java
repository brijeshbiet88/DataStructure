package com.interview.ds.tree;

public class MaxSumPath {
	public static int res = Integer.MIN_VALUE;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(-20);
		root.setLeft(new TreeNode(9));
		root.setRight(new TreeNode(3));
		
		root.left.setLeft(new TreeNode(4));
		root.left.setRight(new TreeNode(1));
		
		root.right.setLeft(new TreeNode(2));
		root.right.setRight(new TreeNode(8));
		
		root.left.left.setLeft(new TreeNode(7));
		root.left.left.setRight(new TreeNode(1));
		
		root.right.left.setLeft(new TreeNode(16));
		root.right.left.setRight(new TreeNode(-3));
		
		System.out.println("Level Order Traversal Of Tree : ");
		TreeUtil.printLevelOrder2(root);
		System.out.println();
		int maxSum = findMaxSumPath(root);
		System.out.println("Max Sum Path In Tree : "+res);
		
		res = 0;
		TreeNode root2 = new TreeNode(10);
		root2.setLeft(new TreeNode(4));
		root2.setRight(new TreeNode(8));
		
		root2.left.setLeft(new TreeNode(5));
		root2.left.setRight(new TreeNode(9));
		
		root2.right.setLeft(new TreeNode(6));
		root2.right.setRight(new TreeNode(1));
		
		System.out.println("Level Order Traversal Of Tree : ");
		TreeUtil.printLevelOrder2(root2);
		System.out.println();
		maxSum = findMaxSumPath(root2);
		System.out.println("Max Sum Path In Tree : "+res);
	}
	private static int findMaxSumPath(TreeNode root) {
		int max ;
		if(root == null) {
			return 0;
		}
		
		int left = findMaxSumPath(root.left);
		int right = findMaxSumPath(root.right);
		
		max = Math.max(Math.max(root.data + left, root.data+ right ) , root.data);
		int topMax = Math.max(root.data +  left + right , max);
		res = Math.max(res, topMax);
		
		return max;
	}

}
/*
 * 
 * Level Order Traversal Of Tree : 
-20 
9 3 
4 1 2 8 
7 1 16 -3 

Max Sum Path In Tree : 29
Level Order Traversal Of Tree : 
10 
4 8 
5 9 6 1 

Max Sum Path In Tree : 37

 * 
 * 
 * */
