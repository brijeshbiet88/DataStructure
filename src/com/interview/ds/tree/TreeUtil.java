package com.interview.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtil {
	
	
	public static TreeNode get7NodeTree() {
		
		TreeNode root = new TreeNode(1);
		
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		
		root.setLeft(node1);
		root.setRight(node2);
		
		node1.setLeft(node3);
		node1.setRight(node4);
		
		node2.setLeft(node5);
		node2.setRight(node6);
		
		return root;
		
	} 
	
	
public static TreeNode get15NodeTree() {
		
		TreeNode root = new TreeNode(1);
		
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		
		TreeNode node7 = new TreeNode(8);
		TreeNode node8 = new TreeNode(9);
		TreeNode node9 = new TreeNode(10);
		TreeNode node10 = new TreeNode(11);
		TreeNode node11 = new TreeNode(12);
		TreeNode node12 = new TreeNode(13);
		TreeNode node13 = new TreeNode(14);
		TreeNode node14 = new TreeNode(15);
		
		root.setLeft(node1);
		root.setRight(node2);
		
		node1.setLeft(node3);
		node1.setRight(node4);
		
		node2.setLeft(node5);
		node2.setRight(node6);
		
		node3.setLeft(node7);
		node3.setRight(node8);
		
		node4.setLeft(node9);
		node4.setRight(node10);
		
		node5.setLeft(node11);
		node5.setRight(node12);
		
		node6.setLeft(node13);
		node6.setRight(node14);
		
		return root;
		
	} 
	
	
	public static void printLevelOrder(TreeNode root)  
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
	
	public static void printLevelOrder2(TreeNode root)  
    { 
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
        	int size = queue.size();
        	
			for (int i = 0; i < size; i++) {
				TreeNode tempNode = queue.poll();
				System.out.print(tempNode.data + " ");

				/* Enqueue left child */
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}

				/* Enqueue right child */
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			}
			System.out.println();
        } 
    }


	public static TreeNode getTree() {
		TreeNode root = new TreeNode(1);

		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(8);
		TreeNode node8 = new TreeNode(9);
		TreeNode node9 = new TreeNode(10);
		TreeNode node10 = new TreeNode(11);

		root.setLeft(node1);
		root.setRight(node2);

		node1.setLeft(node3);
		node1.setRight(node4);

		node2.setLeft(node5);
		node2.setRight(node6);
		
		node3.setLeft(node7);
		node3.setRight(node8);
		
		node7.setLeft(node9);
		node7.setRight(node10);
		

		return root;
	}
	
	public static TreeNode getBST() {
		TreeNode root = new TreeNode(50);

		TreeNode node1 = new TreeNode(30);
		TreeNode node2 = new TreeNode(70);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(40);
		TreeNode node5 = new TreeNode(60);
		TreeNode node6 = new TreeNode(80);
		
		root.setLeft(node1);
		root.setRight(node2);

		node1.setLeft(node3);
		node1.setRight(node4);

		node2.setLeft(node5);
		node2.setRight(node6);
		
		return root;
	}

}
