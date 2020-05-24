package com.interview.ds.tree;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		
		TreeNode root = TreeUtil.get7NodeTree();
		System.out.println("Print Tree Level Order : ");
		TreeUtil.printLevelOrder(root);
		int height = findHeight(root);
		System.out.println("Height Of Binary Tree : "+height);
		
		TreeNode root2 = TreeUtil.getTree();
		System.out.println("Print Tree Level Order : ");
		TreeUtil.printLevelOrder(root2);
		int height2 = findHeight(root2);
		System.out.println("Height Of Binary Tree : "+height2);

	}

	private static int findHeight(TreeNode root) {
		
		if (root == null)
			return 0;
		
		/*Find the Height Of Left Subtree*/
		int leftHeight = findHeight(root.left);
		
		/*Find Height Of Right Subtree*/
		int rightHight = findHeight(root.right);
		
		/* Return MaxHeight */
		if(leftHeight > rightHight)
			return 1 + leftHeight;
		else 
			return 1 + rightHight;
		
	}

}
