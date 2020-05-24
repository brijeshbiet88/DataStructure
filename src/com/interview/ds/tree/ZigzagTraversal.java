package com.interview.ds.tree;

import java.util.Stack;

public class ZigzagTraversal {

	public static void main(String[] args) {

TreeNode root = TreeUtil.get15NodeTree();
		
		System.out.println("Zigzag Level order Traversal Of Tree : ");
		printZigzagLevelOrder(root);

	}

	/*
	 * Use Two Stacks. CurrentLevelStacka and nextLevelStack
	 * NextStack is used to store value which is swapped
	 * to currentStack if currentstack is empty
	 * To keep track of left to right or vice versa
	 * use a boolean leftToRight
	 */
	private static void printZigzagLevelOrder(TreeNode root) {
		
		boolean leftToRight = true;
		Stack<TreeNode> currentLevel = new Stack<TreeNode>();
		Stack<TreeNode> nextLevel = new Stack<TreeNode>();
		currentLevel.add(root);
		while (!currentLevel.isEmpty()) {
			
			TreeNode node = currentLevel.pop();
			System.out.print(node.data+" ");
			
			if(leftToRight) {
				if(node.left != null) {
					nextLevel.push(node.left);
				}
				if(node.right != null) {
					nextLevel.push(node.right);
				}
			}
			else {
				if(node.right != null) {
					nextLevel.push(node.right);
				}
				if(node.left != null) {
					nextLevel.push(node.left);
				}
				
			}
			
			 if (currentLevel.isEmpty()) { 
			        leftToRight = !leftToRight; 
			        Stack<TreeNode> tempStack = currentLevel; 
			        currentLevel = nextLevel; 
			        nextLevel = tempStack; 
			    } 
			
			
		}
	}

}
