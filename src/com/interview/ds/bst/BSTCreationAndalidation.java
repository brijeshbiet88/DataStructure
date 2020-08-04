package com.interview.ds.bst;

public class BSTCreationAndalidation {
	
	public static void main(String[] args) {
		System.out.println("-----------------------Test  Case 1 ------------------------");
		int [] a = {4 , 2 , 5 , 1 , 3 , 6 , 7};
		BSTNode root = createBST(a);
		System.out.println("Level Order Traversal : ");
		BSTUtil.traverseLevelOrder(root);
		System.out.println("Is Valid BST : "+CheckIfBST.isBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE));
		System.out.println();
		
		System.out.println("-----------------------Test  Case 2 ------------------------");
		int [] b = {1 , 2 , 3 , 1 , 2};
		BSTNode root2 = createBST(b);
		System.out.println("Level Order Traversal : ");
		BSTUtil.traverseLevelOrder(root2);
		System.out.println("Is Valid BST : "+CheckIfBST.isBST(root2, Integer.MIN_VALUE,Integer.MAX_VALUE));
		System.out.println();
		
		System.out.println("-----------------------Test  Case 3 ------------------------");
		int [] c = {1 , 1};
		BSTNode root3 = createBST(c);
		System.out.println("Level Order Traversal : ");
		BSTUtil.traverseLevelOrder(root3);
		System.out.println("Is Valid BST : "+CheckIfBST.isBST(root3, Integer.MIN_VALUE,Integer.MAX_VALUE));
		System.out.println();
		
		System.out.println("-----------------------Test  Case 4 ------------------------");
		int [] d = {};
		BSTNode root4 = createBST(d);
		System.out.println("Level Order Traversal : ");
		BSTUtil.traverseLevelOrder(root4);
		System.out.println("Is Valid BST : "+CheckIfBST.isBST(root4, Integer.MIN_VALUE,Integer.MAX_VALUE));
		System.out.println();
		
	}

	private static BSTNode createBST(int[] a) {
		BSTNode root = null;
		for (int i = 0 ; i < a.length ; i++) {
			if(root == null) {
				root = new BSTNode(a[i]);
			}
			else {
				BSTNode node = new BSTNode(a[i]);
				addNodeinBST(root , node);
			}
		}
		return root;
		
	}

	private static void addNodeinBST(BSTNode root, BSTNode node) {
		if(root == null) 
			root = node;
		BSTNode tmp = root;
		
		while(true) {
			if(tmp.data == node.data) {
				return;
			}
			if(tmp.left != null && tmp.data > node.data) {
				tmp = tmp.left;
			}
			else if(tmp.right != null && tmp.data < node.data){
				tmp = tmp.right;
			}
			else if(tmp.left == null && tmp.data > node.data) {
				tmp.setLeft(node);
				break;
			}
			
			else if(tmp.right == null && tmp.data < node.data) {
				tmp.setRight(node);
				break;
			}
		}
		
		
	}
}
/*
 -----------------------Test  Case 1 ------------------------
Level Order Traversal : 
-----------Level Order Traversal-------------
4	2	5	1	3	6	7	
Is Valid BST : true

-----------------------Test  Case 2 ------------------------
Level Order Traversal : 
-----------Level Order Traversal-------------
1	2	3	
Is Valid BST : true

-----------------------Test  Case 3 ------------------------
Level Order Traversal : 
-----------Level Order Traversal-------------
1	
Is Valid BST : true

-----------------------Test  Case 4 ------------------------
Level Order Traversal : 
-----------Level Order Traversal-------------
Is Valid BST : true
 */
