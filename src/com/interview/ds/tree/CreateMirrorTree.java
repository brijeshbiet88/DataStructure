package com.interview.ds.tree;

public class CreateMirrorTree {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();

		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder2(root);
		root = createMirrorTree(root);
		System.out.println("\nLevel order Traversal Of Tree After Converting To Mirror Tree : ");
		TreeUtil.printLevelOrder2(root);

	}

	private static TreeNode createMirrorTree(TreeNode root) {
		
		if(root == null) return root;
		
		if(root != null) {
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			
			createMirrorTree(root.left);
			createMirrorTree(root.right);
		}
		return root;
		
	}

}

/*
 * Level order Traversal Of Tree : 
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 

Level order Traversal Of Tree After Converting To Mirror Tree : 
1 
3 2 
7 6 5 4 
15 14 13 12 11 10 9 8 
 * 
 * */
