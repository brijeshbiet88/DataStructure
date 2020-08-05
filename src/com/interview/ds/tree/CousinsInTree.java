package com.interview.ds.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CousinsInTree {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		TreeUtil.printLevelOrder2(root);
		System.out.println("-----------Test Case 1---------------");
		int n1 = 4 ,n2 = 7;
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins(root, n1 , n2));
		
		System.out.println("-----------Test Case 2---------------");
		n1 = 4 ;n2 = 5;
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins(root, n1 , n2));
		
		System.out.println("-----------Test Case3---------------");
		n1 = 1 ;n2 = 3;
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins(root, n1 , n2));
		
	}


	private static boolean areCousins(TreeNode root, int x, int y) {
		if (root == null)
			return false;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<Integer> list = new LinkedList<Integer>();
		q.add(root);
		TreeNode temp = null;
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 0; i < n; i++) {
				
				temp = q.poll();
				if (temp.left != null) {
					q.add(temp.left);
				}

				if (temp.right != null) {
					q.add(temp.right);
				}
				list.add(temp.data);
				if(temp.left != null && temp.right != null) {
				  if(temp.left.data == x && temp.right.data == y) {
					  return false;
				  }
				  if(temp.left.data == y && temp.right.data == x) {
					  return false;
				  }

				}
				
			}
			
			if(list.contains(x) && list.contains(y)) {
				return true;
			}
			list.clear();

		}
		return false;

	}
}
