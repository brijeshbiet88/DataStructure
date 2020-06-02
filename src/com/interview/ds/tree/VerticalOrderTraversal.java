package com.interview.ds.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VerticalOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Level Order Traversal Of Tree : ");
		TreeUtil.printLevelOrder(root);
		System.out.println("\nVertical Order Traversal Of Tree : \n");
		verticalOrderTraversal(root);

	}

	private static void verticalOrderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
		int hd = 0;
		
		getVerticalOrderTraversal(root , map , hd );
		
		Iterator<Entry<Integer, ArrayList<Integer>>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, ArrayList<Integer>> entry = itr.next();
			list = entry.getValue();
			for(Integer data : list)
			System.out.print(data+" ");
		}
		
	}

	private static void getVerticalOrderTraversal(TreeNode root, Map<Integer, ArrayList<Integer>> map, int hd) {
		
		if(root == null) return ;
		
		if(map.get(hd) == null) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list = new ArrayList<Integer>();
			list.add(root.data);
			map.put(hd, list);
		}
		else {
			map.get(hd).add(root.data);
		}
		
		
		getVerticalOrderTraversal(root.left, map, hd-1);
		getVerticalOrderTraversal(root.right, map, hd+1);
		
	}

}
