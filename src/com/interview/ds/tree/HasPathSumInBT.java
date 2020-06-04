package com.interview.ds.tree;

public class HasPathSumInBT {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();

		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		
		for(int pathSum = 1; pathSum < 30 ; pathSum = pathSum + 3) {
		boolean hasPathSum = hasPathSumFromRoot(root , pathSum);
		System.out.print("\nHas Path Sum : "+pathSum+" in the Tree : " +hasPathSum);
		}
	}

	private static boolean hasPathSumFromRoot(TreeNode root, int pathSum) {
		if(root == null) return false;
		if(root.data == pathSum) return true;
		int subSum = pathSum - root.data;
		
		return (hasPathSumFromRoot(root.left, subSum) || hasPathSumFromRoot(root.right, subSum));
	}

}
