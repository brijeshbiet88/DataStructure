package com.interview.ds.tree;

import java.util.HashMap;

public class BottomView {

	public static void main(String[] args) {
		TreeNode root = TreeUtil.get15NodeTree();
		System.out.println("Level Order Of a Tree : ");
		TreeUtil.printLevelOrder2(root);
		System.out.println();
		System.out.println();
		System.out.println("Bottom View Of a Tree : ");
		bottomView(root);
	}

	private static void bottomView(TreeNode root) {
		HashMap<Integer, Integer> dataMap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> levelMap = new HashMap<Integer, Integer>();
		printBottomView(root , dataMap , levelMap , 0 , 0);
		System.out.println(dataMap);
	}

	private static void printBottomView(TreeNode root, HashMap<Integer, Integer> dataMap,
			HashMap<Integer, Integer> levelMap, int distance, int level) {
		
		if(root == null) {
			return;
		}
		
		if(dataMap.get(distance) != null) {
			if(levelMap.get(distance) < level ) {
				levelMap.put(distance, level);
				dataMap.put(distance, root.data);
			}
		}else {
			dataMap.put(distance, root.data);
			levelMap.put(distance, level);
		}
		
		printBottomView(root.left, dataMap, levelMap, distance-1, level+1);
		printBottomView(root.right, dataMap, levelMap, distance+1, level+1);
		
	}

}

/*
 * Level Order Of a Tree : 
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 


Bottom View Of a Tree : 
{0=5, -1=9, -2=4, 1=11, -3=8, 2=7, 3=15}

 * */
