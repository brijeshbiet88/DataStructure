package com.interview.ds.bst;

public class KthSmallestAndHigestBST {
	static int count = 0;
	public static void main(String[] args) {
		int [] a = {7 , 3 , 1 , 9 , 4 , 22 , 15 , 27};
		BSTNode root = BSTCreationAndalidation.createBST(a);
		System.out.println("Is Valid BST : "+ CheckIfBST.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		int k = 3;
		
		BSTNode kthSmallest = findKthSmallest(root , k);
		System.out.println("Kth Smallest Where K ="+k+" is : "+kthSmallest.data);
		
		k = 2;
		count = 0;
		BSTNode kthHighest = findKthHighest(root , k);
		System.out.println("Kth Highest Where K ="+k+" is : "+kthHighest.data);
	}
	
	private static BSTNode findKthHighest(BSTNode root, int k) {
		if (root == null) 
            return null; 
        BSTNode right = findKthHighest(root.right, k); 
       
        // if k'th highest is found in left subtree, return it 
        if (right != null) 
            return right; 
       
        // if current element is k'th highest, return it 
        count++; 
        if (count == k) 
            return root; 
       
        return findKthHighest(root.left, k);
	}

	public static BSTNode findKthSmallest(BSTNode root, int k) 
    { 
        if (root == null) 
            return null; 
        BSTNode left = findKthSmallest(root.left, k); 
       
        if (left != null) 
            return left; 
       
        count++; 
        if (count == k) 
            return root; 
       
        return findKthSmallest(root.right, k); 
    } 

}
/*Is Valid BST : true
Kth Smallest Where K =3 is : 4
Kth Highest Where K =2 is : 22
*/
