package com.interview.ds.tree;

public class CountNodes {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Number Of Nodes the Tree : "+countNodes(root));
		System.out.println("Number Of Even Nodes the Tree : "+countEvenNodes(root));
		System.out.println("Number Of Even Nodes the Tree : "+countOddNodes(root));
	}

	private static int countEvenNodes(TreeNode root) {
		if (root == null)
			return 0;
		else if (root.data % 2 == 0)
			return 1 + countEvenNodes(root.left) + countEvenNodes(root.right);
		else
			return 0 + countEvenNodes(root.left) + countEvenNodes(root.right);
	}
	
	private static int countOddNodes(TreeNode root) {
		if (root == null)
			return 0;
		else if (root.data % 2 == 1)
			return 1 + countEvenNodes(root.left) + countEvenNodes(root.right);
		else
			return 0 + countEvenNodes(root.left) + countEvenNodes(root.right);
	}

	private static int countNodes(TreeNode root) {
		if(root == null)
			return 0;
		return 1+ countNodes(root.left) + countNodes(root.right);
	}

}
