package com.interview.ds.tree;

public class DiameterOfBT {
	
	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();

		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		
		int diameter = findDiameterOfTree(root);
		System.out.println("\nDiameter Of Tree : "+diameter);

	}

	private static int findDiameterOfTree(TreeNode root) {

		if (root == null)
			return 0;

		int lheight = height(root.left);
		int rheight = height(root.right);

		int ldiameter = findDiameterOfTree(root.left);
		int rdiameter = findDiameterOfTree(root.right);

		/*
		 * In case the diameter passes through the root diameter will be lHeight+rHeight+1
		 * but in case it does not pass through the root it will be Max among the
		 * below three
		 */
		return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
	}

	private static int height(TreeNode root) {
		if (root == null)
			return 0;

		return (1 + Math.max(height(root.left), height(root.right)));
	} 

}
