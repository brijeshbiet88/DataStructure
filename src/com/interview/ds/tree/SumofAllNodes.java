package com.interview.ds.tree;

public class SumofAllNodes {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Summation of all Nodes  : "+sumOfTreeNodes(root));
		System.out.println("Summation of all Even Nodes  : "+sumOfTreeEvenNodes(root));
		System.out.println("Summation of all Odd Nodes  : "+sumOfTreeOddNodes(root));
	}

	private static int sumOfTreeNodes(TreeNode root) {
		if(root == null)
			return 0;
		return root.data + sumOfTreeNodes(root.left) + sumOfTreeNodes(root.right);
	}
	
	private static int sumOfTreeEvenNodes(TreeNode root) {
		if(root == null)
			return 0;
		else if (root.data % 2 == 0)
			return root.data + sumOfTreeEvenNodes(root.left) + sumOfTreeEvenNodes(root.right);
		else
			return 0 + sumOfTreeEvenNodes(root.left) + sumOfTreeEvenNodes(root.right);
	}
	
	private static int sumOfTreeOddNodes(TreeNode root) {
		if (root == null)
			return 0;
		else if (root.data % 2 == 1)
			return root.data + sumOfTreeOddNodes(root.left) + sumOfTreeOddNodes(root.right);
		else
			return 0 + sumOfTreeOddNodes(root.left) + sumOfTreeOddNodes(root.right);
	}

}
