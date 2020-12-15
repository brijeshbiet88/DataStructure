package com.interview.ds.tree;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;



public class TopView {

	static class Pair {
		int data, level;

		Pair() {
		}

		Pair(int data, int level) {
			this.data = data;
			this.level = level;
		}
	} 
	
	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Print Level Order Traversal :");
		TreeUtil.printLevelOrder2(root);
		System.out.println();
		System.out.println("Vertical Order Traversal Of Tree : ");
		printTopView(root);
		System.out.println();
		System.out.println("---------------------------------------");
		
		TreeNode root2 = TreeUtil.getTree();
		System.out.println("Print Level Order Traversal :");
		TreeUtil.printLevelOrder2(root2);
		System.out.println();
		System.out.println("Vertical Order Traversal Of Tree : ");
		printTopView(root2);

	}

	private static void printTopView(TreeNode root) {
		int hd = 0 , level = 0;
		TreeMap<Integer, Pair> map = new TreeMap<>();
		fillMap(root, hd, level , map);

		Iterator<Entry<Integer, Pair>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, Pair> entry = itr.next();
			Pair node = entry.getValue();
			System.out.print(node.data + " ");
		}
	}

	private static void fillMap(TreeNode root, int hd, int level, TreeMap<Integer, Pair> map) {
		if (root == null) {
			return;
		}

		if (map.get(hd) == null) {
			map.put(hd, new Pair(root.data, level));
		} else if (map.get(hd).level > level) {
			map.put(hd, new Pair(root.data, level));
		}

		fillMap(root.left, hd - 1, level + 1, map);
		fillMap(root.right, hd + 1, level + 1, map);
	}
}

/*
 *Print Level Order Traversal :
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 

Vertical Order Traversal Of Tree : 
8 4 2 1 3 7 15 
---------------------------------------
Print Level Order Traversal :
1 
2 3 
4 5 6 7 
8 9 
10 11 

Vertical Order Traversal Of Tree : 
10 8 4 2 1 3 7  
 */
