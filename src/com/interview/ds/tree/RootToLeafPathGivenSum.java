package com.interview.ds.tree;

public class RootToLeafPathGivenSum {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();

		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		
		for(int pathSum = 15; pathSum <= 25 ; pathSum = pathSum + 1) {
		boolean hasPathSum = hasPathSumFromRootToLeaf(root , pathSum);
		System.out.print("\nHas Path Sum : "+pathSum+" in the Tree : " +hasPathSum);
		}

	}

	private static boolean hasPathSumFromRootToLeaf(TreeNode root, int pathSum) {
		if(root == null) return false;
		if(root.left == null && root.right== null && root.data == pathSum) return true;
		int subSum = pathSum - root.data;
		
		return (hasPathSumFromRootToLeaf(root.left, subSum) || hasPathSumFromRootToLeaf(root.right, subSum));
	}

}
