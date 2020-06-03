package com.interview.ds.tree;

public class IdenticalBT {

	public static void main(String[] args) {
		TreeNode root1 = TreeUtil.get15NodeTree();
		TreeNode root2 = TreeUtil.get15NodeTree();

		boolean areIdenticals = findIfIdenticals(root1, root2);
		System.out.println("Are Both Tree  root1 and root2 Identicals : " + areIdenticals);
		
		TreeNode root3 = TreeUtil.get15NodeTree();
		root3.left.right.data = 88;
		
		areIdenticals = findIfIdenticals(root1, root3);
		System.out.println("Are Both Tree  root1 and root3 Identicals : " + areIdenticals);

	}

	private static boolean findIfIdenticals(TreeNode root1, TreeNode root2) {
		
		if(root1 == null && root2 == null) return true;
		
		if(root1 == null || root2 == null) return false;
		
		return (root1.data == root2.data && findIfIdenticals(root1.left, root2.left) && findIfIdenticals(root1.right, root2.right));
	}

}
