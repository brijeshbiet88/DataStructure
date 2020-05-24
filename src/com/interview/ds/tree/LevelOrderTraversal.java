package com.interview.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		
		TreeNode root = TreeUtil.get15NodeTree();
		
		System.out.println("Level order Traversal Of Tree : ");
		printLevelOrder(root);
		System.out.println();
		System.out.println("Level order Traversal Of Tree Each Level: ");
		printLevelOrderEachLevel(root);

	}
	
	
	static void printLevelOrder(TreeNode root)  
    { 
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
        	TreeNode tempNode = queue.poll(); 
            System.out.print(tempNode.data + " "); 
  
            /*Enqueue left child */
            if (tempNode.left != null) { 
                queue.add(tempNode.left); 
            } 
  
            /*Enqueue right child */
            if (tempNode.right != null) { 
                queue.add(tempNode.right); 
            } 
        } 
    } 
	
	
	
  private static  void printLevelOrderEachLevel(TreeNode root) 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    } 
  
 
    static int height(TreeNode root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.left); 
            int rheight = height(root.right); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
  
    /* Print nodes at the given level */
    static void printGivenLevel (TreeNode root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 

}
