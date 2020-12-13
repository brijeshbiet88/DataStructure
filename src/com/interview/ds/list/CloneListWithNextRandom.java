package com.interview.ds.list;

import java.util.HashMap;

public class CloneListWithNextRandom {

	public static void main(String[] args) {
		ListNodeRandom start = getListWithRandom();
		System.out.println("Print List With Next and Random Pointers : ");
		printListWithRandom(start);
		System.out.println();
		ListNodeRandom cloned = cloneList(start);
		System.out.println("Print Cloned List With Next and Random Pointers : ");
		printListWithRandom(cloned);
	}

	private static ListNodeRandom cloneList(ListNodeRandom start) {
		if (start == null) {
			return start;
		}

		ListNodeRandom tmp = start;
		ListNodeRandom cloned = null;
		ListNodeRandom tmpCloned = null;
		HashMap<ListNodeRandom, ListNodeRandom> map = new HashMap<ListNodeRandom, ListNodeRandom>();
		while (tmp != null) {
			if (cloned == null) {
				cloned = new ListNodeRandom(tmp.data);
				tmpCloned = cloned;
				map.put(tmpCloned , tmp);
			} else {
				ListNodeRandom node = new ListNodeRandom(tmp.data);
				tmpCloned.next = node;
				tmpCloned = tmpCloned.next;
				map.put(tmpCloned, tmp);
			}

			tmp = tmp.next;
		}

		tmp = start;
		tmpCloned = cloned;
		while (tmpCloned != null) {
			ListNodeRandom random = map.get(tmpCloned).random;
			tmpCloned.random = random;
			tmpCloned = tmpCloned.next;
			tmp = tmp.next;
		}

		return cloned;
	}

	public static ListNodeRandom getListWithRandom() {

		ListNodeRandom start = new ListNodeRandom(1);
		ListNodeRandom next1 = new ListNodeRandom(2);
		ListNodeRandom next2 = new ListNodeRandom(3);
		ListNodeRandom next3 = new ListNodeRandom(4);
		ListNodeRandom next4 = new ListNodeRandom(5);

		start.setNext(next1);
		next1.setNext(next2);
		next2.setNext(next3);
		next3.setNext(next4);

		start.setRandom(next3);
		next1.setRandom(start);
		next3.setRandom(next1);
		next4.setRandom(next2);

		return start;
	}

	private static void printListWithRandom(ListNodeRandom start) {
		if (start == null) {
			return;
		}
		ListNodeRandom tmp = start;

		while (tmp != null) {

			System.out.print(tmp.data + " ");
			if (tmp.next != null) {
				System.out.print("--N-->" + tmp.next.data + " ");
			}

			if (tmp.random != null) {
				System.out.print("--R-->" + tmp.random.data + " ");
			}
			tmp = tmp.next;
			System.out.println();
		}
	}

}

/*
 *Print List With Next and Random Pointers : 
1 --N-->2 --R-->4 
2 --N-->3 --R-->1 
3 --N-->4 
4 --N-->5 --R-->2 
5 --R-->3 

Print Cloned List With Next and Random Pointers : 
1 --N-->2 --R-->4 
2 --N-->3 --R-->1 
3 --N-->4 
4 --N-->5 --R-->2 
5 --R-->3  
*/
