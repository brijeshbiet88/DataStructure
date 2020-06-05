package com.interview.ds.tree;

public class LowestCommonAncestorInBT {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Leval Order Traversal Of Tree :");
		TreeUtil.printLevelOrder2(root);
		TreeNode node1 = root.left.left.right;
		TreeNode node2 = root.left.right.right;
		
		System.out.println("Node for which LCA to be found are : "+node1.data +" and "+node2.data);
		TreeNode lca = findLca(root , node1 , node2);
		if(n1 && n2)
		System.out.println("LCA of Nodes "+node1 +" and "+node2+" is : "+lca);
		else
		{	
			lca = null;
			System.out.println("LCA of Nodes "+node1 +" and "+node2+" is : "+lca);
		}
	}

	static boolean n1 , n2 ;
	private static TreeNode findLca(TreeNode root, TreeNode node1, TreeNode node2) {
		if(root == null) return root;
		
		/*
		 *Assuming that both nodes are present in the tree 
		 */
		 
		if(root == node1 || root == node2) { 
			if(root == node1) n1 = true;
			if(root == node2) n2 = true; 
			return root;
		}
		
		TreeNode left  = findLca(root.left, node1, node2);
		TreeNode right = findLca(root.right, node1, node2);
		
		
		if(right != null && left != null) return root;
		else return left != null ? left : right;
	}

}
