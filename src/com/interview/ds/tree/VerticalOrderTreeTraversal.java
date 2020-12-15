package com.interview.ds.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VerticalOrderTreeTraversal {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Print Level Order Traversal :");
		TreeUtil.printLevelOrder2(root);
		System.out.println();
		System.out.println("Vertical Order Traversal Of Tree : ");
		verticalTraverse(root);

	}

	private static void verticalTraverse(TreeNode root) {
		int hd = 0;
		TreeMap<Integer, LinkedList<TreeNode>> map = new TreeMap<>();
		fillMap(root , hd , map);
		
		Iterator<Entry<Integer, LinkedList<TreeNode>>> itr =  map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, LinkedList<TreeNode>> entry = itr.next();
			LinkedList<TreeNode> list = entry.getValue();
			list.forEach(s -> System.out.print(s.data+" "));
		}
	}

	private static void fillMap(TreeNode root, int hd, TreeMap<Integer, LinkedList<TreeNode>> map) {
		if(root == null) {
			return ;
		}
		
		
		
		if(map.get(hd) == null) {
			LinkedList<TreeNode> list = new LinkedList<TreeNode>();
			list.add(root);
			map.put(hd, list);
		}else {
			map.get(hd).add(root);
		}
		
		fillMap(root.left, hd-1, map);
		fillMap(root.right, hd+1, map);
	}

}
