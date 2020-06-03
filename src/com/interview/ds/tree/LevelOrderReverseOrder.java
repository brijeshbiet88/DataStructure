package com.interview.ds.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderReverseOrder {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		System.out.println("\nLevel order Traversal Of Tree In Reverse Order : ");
		levelOrderReverseOrder(root);
	}
	
	
	public static void levelOrderReverseOrder(TreeNode root)  
	{
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		ArrayList<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
		q.add(root);
		while (!q.isEmpty()) {

			int size = q.size();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode tempNode = q.poll();
				list.add(tempNode.data);
				if (tempNode.left != null) {
					q.add(tempNode.left);
				}

				if (tempNode.right != null) {
					q.add(tempNode.right);
				}

			}
			listOfList.add(list);
		}

		for (int i = listOfList.size() - 1; i >= 0; i--) {
			ArrayList<Integer> list = listOfList.get(i);
			for (int num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	} 

}
