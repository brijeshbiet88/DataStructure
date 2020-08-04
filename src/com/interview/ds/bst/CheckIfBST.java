package com.interview.ds.bst;

public class CheckIfBST {

	public static void main(String[] args) {
		System.out.println("---------------Test case 1---------------");
		BSTNode root = BSTUtil.getBST7Nodes();
		BSTUtil.traverseLevelOrder(root);
		System.out.println("Is The Given Tree is BST : "+isBST(root , Integer.MIN_VALUE , Integer.MAX_VALUE));
	
		System.out.println();
		
		System.out.println("---------------Test case 2---------------");
		BSTNode root2 = new BSTNode(10);
		root2.setLeft(new BSTNode(5));
		root2.setRight(new BSTNode(15));
		root2.right.setLeft(new BSTNode(6));
		root2.right.setRight(new BSTNode(20));
		BSTUtil.traverseLevelOrder(root2);
		System.out.println("Is The Given Tree is BST : "+isBST(root2 , Integer.MIN_VALUE , Integer.MAX_VALUE));
		
		System.out.println();
		
		System.out.println("---------------Test case 3---------------");
		BSTNode root3 = new BSTNode(6);
		root3.setRight(new BSTNode(10));
		BSTUtil.traverseLevelOrder(root3);
		System.out.println("Is The Given Tree is BST : "+isBST(root3, Integer.MIN_VALUE , Integer.MAX_VALUE));
		
		System.out.println();
		
		System.out.println("---------------Test case 4---------------");
		BSTNode root4 = new BSTNode(6);
		root4.setLeft(new BSTNode(8));
		BSTUtil.traverseLevelOrder(root4);
		System.out.println("Is The Given Tree is BST : "+isBST(root4, Integer.MIN_VALUE , Integer.MAX_VALUE));
		
		System.out.println();
		
		System.out.println("---------------Test case 5---------------");
		BSTNode root5 = new BSTNode(30);
		root5.setLeft(new BSTNode(20));
		root5.setRight(new BSTNode(50));
		root5.left.setLeft(new BSTNode(10));
		root5.left.setRight(new BSTNode(44));
		BSTUtil.traverseLevelOrder(root5);
		System.out.println("Is The Given Tree is BST : "+isBST(root5, Integer.MIN_VALUE , Integer.MAX_VALUE));

	}

	public static boolean isBST(BSTNode root , int min , int max) {
		if(root == null ) return true;
		
		if(root.data < min || root.data > max) return false;
		
		return (isBST(root.left, min, root.data-1) && 
                isBST(root.right, root.data+1, max)); 
		
	}

}
/*
---------------Test case 1---------------
-----------Level Order Traversal-------------
4	2	6	1	3	5	7	
Is The Given Tree is BST : true

---------------Test case 2---------------
-----------Level Order Traversal-------------
10	5	15	6	20	
Is The Given Tree is BST : true

---------------Test case 3---------------
-----------Level Order Traversal-------------
6	10	
Is The Given Tree is BST : true

---------------Test case 4---------------
-----------Level Order Traversal-------------
6	8	
Is The Given Tree is BST : false

---------------Test case 5---------------
-----------Level Order Traversal-------------
6	6	
Is The Given Tree is BST : false
 
 
 Needs to handle this case also:
 
        3
     2     5
  1    4
 * */
