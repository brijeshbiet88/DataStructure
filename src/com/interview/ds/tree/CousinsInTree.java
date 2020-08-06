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
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins2(root, n1 , n2));
		
		System.out.println("-----------Test Case 2---------------");
		n1 = 4 ;n2 = 5;
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins(root, n1 , n2));
		
		System.out.println("-----------Test Case3---------------");
		n1 = 1 ;n2 = 3;
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins(root, n1 , n2));
		
		System.out.println("-----------Test Case4---------------");
		n1 = 11 ;n2 = 8;
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins(root, n1 , n2));
		
		System.out.println("-----------Test Case5---------------");
		n1 = 10 ;n2 = 11;
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins(root, n1 , n2));
		
		System.out.println("-----------Test Case6---------------");
		n1 = 11 ;n2 = 12;
		System.out.println("Are Nodes "+n1+" and "+n2+" Cousins : "+areCousins(root, n1 , n2));
		
		System.out.println("-----------Test Case6---------------");
		n1 = 2 ;n2 = 4;
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
				if (temp.left != null && temp.right != null) {
					if (temp.left.data == x && temp.right.data == y) {
						return false;
					}
					if (temp.left.data == y && temp.right.data == x) {
						return false;
					}

				}

			}

			if (list.contains(x) && list.contains(y)) {
				return true;
			}
			list.clear();

		}
		return false;

	}
	
	private static boolean areCousins2(TreeNode root, int x, int y) {
		int level1 = findLevel(root, x);
		int level2 = findLevel(root, x);
	    if(level1 != level2) {
	    	return false;
	    }
	    return !areSiblings(root ,x ,y);
		
	}
	
	private static boolean areSiblings(TreeNode root, int x, int y) {
		   if(root == null) return false;
		   if(root.left != null && root.left.data == x 
			 && root.right != null && root.right.data == y) {
			   return true;
		   }
		   return (areSiblings(root.left, x, y) || areSiblings(root.right, x, y));
		   
	}


	public static int findLevel(TreeNode root , int x) {
		return findLevelUtil(root , x , 1);
	}


	private static int findLevelUtil(TreeNode root, int x, int level) {
		if(root == null) return 0;
		
		if(root.data == x) {
			return level;
		}
		
		int downLevel = findLevelUtil(root.left, x, level+1);
		if(downLevel != 0) {
			return downLevel;
		}
		
		return findLevelUtil(root.right, x, level+1);
		
	}
}



/*
 			1 
	   2             3 
  4        5     6        7 
 8 9     10 11 12 13    14 15 

-----------Test Case 1---------------
Are Nodes 4 and 7 Cousins : true
-----------Test Case 2---------------
Are Nodes 4 and 5 Cousins : false
-----------Test Case3---------------
Are Nodes 1 and 3 Cousins : false
-----------Test Case4---------------
Are Nodes 11 and 8 Cousins : true
-----------Test Case5---------------
Are Nodes 10 and 11 Cousins : false
-----------Test Case6---------------
Are Nodes 11 and 12 Cousins : true
-----------Test Case6---------------
Are Nodes 2 and 4 Cousins : false
 * */
