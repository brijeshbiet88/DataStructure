package com.interview.ds.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class VerticalSumOfTree {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get7NodeTree();

		System.out.println("Level order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		System.out.println("\nVerical Sum Of Nodes in Binary Tree \n");
		printVerticalSum(root);
	}

	private static void printVerticalSum(TreeNode root) {
		int hd = 0;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		varticalSumUtil(root, map, hd);

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println("Sum : " + map.get(itr.next()));
		}

	}

	private static void varticalSumUtil(TreeNode root, Map<Integer, Integer> map, int hd) {
		if (root == null)
			return;

		if (map.get(hd) != null) {
			map.put(hd, map.get(hd) + root.data);
		} else {
			map.put(hd, root.data);
		}

		varticalSumUtil(root.left, map, hd - 1);
		varticalSumUtil(root.right, map, hd + 1);
	}

}
