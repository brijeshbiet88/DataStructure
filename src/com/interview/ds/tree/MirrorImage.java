package com.interview.ds.tree;

public class MirrorImage {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		root1.setLeft(node1);
		root1.setRight(node2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node1.setLeft(node3);
		node1.setRight(node4);
		
		TreeNode root2 = new TreeNode(0);
		TreeNode node5 = new TreeNode(1);
		TreeNode node6 = new TreeNode(2);
		root2.setLeft(node6);
		root2.setRight(node5);
		TreeNode node7 = new TreeNode(3);
		TreeNode node8 = new TreeNode(4);
		node5.setLeft(node8);
		node5.setRight(node7);
		
		boolean areMirrors = findIfMirror(root1, root2);
		System.out.println("Are Both Tree  root1 and root2 Mirrors : " + areMirrors);
	
		

	}

	private static boolean findIfMirror(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		return (root1.data == root2.data && findIfMirror(root1.left, root2.right)
				&& findIfMirror(root1.right, root2.left));
	}

}
