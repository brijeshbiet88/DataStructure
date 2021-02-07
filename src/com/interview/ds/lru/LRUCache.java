package com.interview.ds.lru;

import java.util.HashMap;

public class LRUCache {

	private int capacity;
	private HashMap<Integer, ListNode> map;
	private ListNode head;
	private ListNode tail;
	private int count;

	public LRUCache(int capacity) {
		super();
		this.capacity = capacity;
		this.map = new HashMap<Integer, ListNode>();
		head = new ListNode(0);
		tail = new ListNode(0);

		head.next = tail;
		tail.pre = head;

		this.count = 0;
	}

	public int getKey(int key) {
		ListNode node = map.get(key);
		int res = -1;
		if (node == null) {
			System.out.println("No key Found: " + key);
		}

		else {
			res = node.getData();
			ListUtil.deleteNode(node);
			ListUtil.addToHead(node, head);
			System.out.println("Key  Found : " + node);
		}
		return res;
	}

	public void setKey(int key) {
		System.out.println(" Set Key : "+key);
		ListNode node = map.get(key);
		if (node == null) {
			node = new ListNode(key);
			if (count < capacity) {
				head = ListUtil.addToHead(node, head);
				count++;
			} else {
				int tailKey = tail.pre.getData();
				map.remove(tailKey);
				ListUtil.deleteTail(tail);
				ListUtil.addToHead(node, head);
			}
			map.put(key, node);
		} else {
			ListUtil.deleteNode(node);
			ListUtil.addToHead(node, head);
		}
	}

	public void printCache() {
		System.out.println();
		ListNode tmp = head.next;
		while (tmp != tail) {
			System.out.print(tmp.getData() + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}

}

/*
 *  Set Key : 1
 Set Key : 2
 Set Key : 3
Print Cache Content :

3 2 1 
 Set Key : 4
 Set Key : 5
Print Cache Content :

5 4 3 
 Set Key : 3
Print Cache Content :

3 5 4 
 Set Key : 5
Print Cache Content :

5 3 4 
No key Found: 6
Key Found : -1
Key  Found : ListNode [data=5]
Key Found : 5
Print Cache Content :

5 3 4 
Key  Found : ListNode [data=3]
Key Found : 3
Print Cache Content :

3 5 4 
Key  Found : ListNode [data=4]
Key Found : 4
Print Cache Content :

4 3 5 

 * */
