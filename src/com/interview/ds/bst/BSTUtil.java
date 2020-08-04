package com.interview.ds.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BSTUtil {

	public static BSTNode getBST7Nodes(){
		BSTNode root = new BSTNode(4);
		
		BSTNode node1 = new BSTNode(1);
		BSTNode node2 = new BSTNode(2);
		BSTNode node3 = new BSTNode(3);
		BSTNode node5 = new BSTNode(5);
		BSTNode node6 = new BSTNode(6);
		BSTNode node7 = new BSTNode(7);
		
		root.setLeft(node2);
		root.setRight(node6);
		
		node2.setLeft(node1);
		node2.setRight(node3);
		
		node6.setLeft(node5);
		node6.setRight(node7);
		
		return root;
	}
	
	public static void traverseLevelOrder(BSTNode root) {
		System.out.println("-----------Level Order Traversal-------------");
		if(root == null) return;
		Queue<BSTNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			
			BSTNode temp = q.poll();
			
			System.out.print(temp.getData()+"\t");
			if(temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			
			if(temp.getRight() != null) {
				q.add(temp.getRight());
			}
			
		}
		System.out.println();
	}
}
