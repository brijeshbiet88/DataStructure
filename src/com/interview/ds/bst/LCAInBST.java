package com.interview.ds.bst;

public class LCAInBST {

	public static void main(String[] args) {
		
		BSTNode root = BSTUtil.getBST7Nodes();
		System.out.println("BST Traversal");
		BSTUtil.traverseLevelOrder(root);
		System.out.println("------------Test Case 1-------------");
		int n1 = 5 , n2 = 7;
        BSTNode lcaNode = findLCA(root , n1 , n2);
        System.out.println("Least Common Ancestor of "+n1+" and "+n2 +" is : "+lcaNode.data);
        System.out.println();
        
        System.out.println("------------Test Case 2-------------");
		n1 = 6 ; n2 = 7;
        lcaNode = findLCA(root , n1 , n2);
        System.out.println("Least Common Ancestor of "+n1+" and "+n2 +" is : "+lcaNode.data);
        System.out.println();
        
        System.out.println("------------Test Case 3-------------");
		n1 = 1 ; n2 = 7;
        lcaNode = findLCA(root , n1 , n2);
        System.out.println("Least Common Ancestor of "+n1+" and "+n2 +" is : "+lcaNode.data);
        System.out.println();
        
        System.out.println("------------Test Case 3-------------");
		n1 = 3 ; n2 = 6;
        lcaNode = findLCA(root , n1 , n2);
        System.out.println("Least Common Ancestor of "+n1+" and "+n2 +" is : "+lcaNode.data);
        System.out.println();
        
	}

	private static BSTNode findLCA(BSTNode root, int n1, int n2) {
		if(root == null) {
			return null;
		}
		
		if(root.data > n1 && root.data > n2) {
			return findLCA(root.left, n1, n2);
		}
		if(root.data < n1 && root.data < n2) {
			return findLCA(root.right, n1, n2);
		}
		
		return root;
	}
}
/*
BST Traversal
-----------Level Order Traversal-------------
4	2	6	1	3	5	7	
------------Test Case 1-------------
Least Common Ancestor of 5 and 7 is : 6

------------Test Case 2-------------
Least Common Ancestor of 6 and 7 is : 6

------------Test Case 3-------------
Least Common Ancestor of 1 and 7 is : 4

------------Test Case 3-------------
Least Common Ancestor of 3 and 6 is : 4

 * */
