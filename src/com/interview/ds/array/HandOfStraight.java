package com.interview.ds.array;

import java.util.TreeMap;

public class HandOfStraight {

	public static void main(String[] args) {
		System.out.println("------------------Tes Case 1------------------");
		int [] hand = {1 , 2 , 3 , 6 , 2 , 3 , 4 , 8 , 7};
		int W = 3;
		boolean result = isNStraightHand(hand, W);
		System.out.println("Is N Straight Hands Possible : "+result);
		System.out.println();
		
		System.out.println("------------------Tes Case 2------------------");
		int [] hands = {1 , 2 , 3 , 4 , 5 , 6};
		W = 2;
		result = isNStraightHand(hands, W);
		System.out.println("Is N Straight Hands Possible : "+result);
		System.out.println();

		System.out.println("------------------Tes Case 3------------------");
		int [] hands3 = {1 , 2 , 7 , 9 , 0 , 5 , 6};
		W = 2;
		result = isNStraightHand(hands3, W);
		System.out.println("Is N Straight Hands Possible : "+result);
		System.out.println();

	}

	public static boolean isNStraightHand(int[] hand, int W) {

		if (hand.length % W != 0) {
			return false;

		}

		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

		for (int card : hand) {
			 if(!treeMap.containsKey(card)) {
				 treeMap.put(card , 1);
			 }else {
				 treeMap.replace(card, treeMap.get(card) + 1);
			 }

		}

		int count = hand.length;
		int groupCount = W;
		while (count != 0) {
			groupCount = W;
			int firstkey = treeMap.firstKey();
			decrementOrRemove(treeMap, firstkey, -1);
			groupCount--;
			count--;
			while (groupCount != 0) {
				if (!treeMap.containsKey(++firstkey)) {
					return false;
				} else {
					groupCount--;
					count--;
					decrementOrRemove(treeMap, firstkey, -1);
				}
			}

		}

		return true;

	}
	 
	 public static void decrementOrRemove(TreeMap<Integer, Integer> treeMap , int key , int change) {
		 if(treeMap.get(key) == 1) {
			 treeMap.remove(key);
		 }else {
			 treeMap.replace(key, treeMap.get(key) + change);
		 }
	 }
}

/*
 * ------------------Tes Case 1------------------
Is N Straight Hands Possible : true

------------------Tes Case 2------------------
Is N Straight Hands Possible : true

------------------Tes Case 3------------------
Is N Straight Hands Possible : false
 * */
