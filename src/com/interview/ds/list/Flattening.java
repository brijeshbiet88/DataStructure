package com.interview.ds.list;

public class Flattening {

	public static void main(String[] args) {
		ListNodeBottom start = getNextBottomList();
		System.out.println("Print List with Next Pointers : ");
		printListWithNextPointers(start);

		System.out.println("Print List with Bottom Pointers : ");
		printListWithBottomPointers(start);
		System.out.println();
		start = flatten(start);
		System.out.println();
		System.out.println("Print List with Bottom Pointers After Flattening : ");
		printListWithBottomPointers(start);

	}

	private static void printListWithBottomPointers(ListNodeBottom start) {
		if (start == null) {
			return;
		}
		ListNodeBottom tmp = start;

		while (tmp != null) {
			ListNodeBottom btmTemp = tmp;
			while (btmTemp != null) {
				System.out.print(btmTemp.data + " --B--> ");
				btmTemp = btmTemp.bottom;
			}
			System.out.println("Null");
			System.out.println("|");
			System.out.println("N");
			System.out.println("|");
			tmp = tmp.next;
		}
		System.out.println("Null");

	}

	private static void printListWithNextPointers(ListNodeBottom start) {
		if (start == null) {
			return;
		}
		ListNodeBottom tmp = start;

		while (tmp != null) {
			System.out.print(tmp.data + "-->");
			tmp = tmp.next;
		}
		System.out.println("Null");
	}

	public static ListNodeBottom getNextBottomList() {
		ListNodeBottom start = new ListNodeBottom(5);

		ListNodeBottom next1 = new ListNodeBottom(10);

		ListNodeBottom next2 = new ListNodeBottom(19);

		ListNodeBottom next3 = new ListNodeBottom(28);

		start.next = next1;
		next1.next = next2;
		next2.next = next3;

		start.setBottom(new ListNodeBottom(7));
		start.bottom.setBottom(new ListNodeBottom(8));
		start.bottom.bottom.setBottom(new ListNodeBottom(30));

		next1.setBottom(new ListNodeBottom(20));

		next2.setBottom(new ListNodeBottom(22));
		next2.bottom.setBottom(new ListNodeBottom(50));

		next3.setBottom(new ListNodeBottom(35));
		next3.bottom.setBottom(new ListNodeBottom(40));
		next3.bottom.bottom.setBottom(new ListNodeBottom(45));

		return start;
	}

	public static ListNodeBottom flatten(ListNodeBottom start) {
		if (start == null || start.next == null) {
			return start;
		}

		start.next = flatten(start.next);
		start = merge(start, start.next);

		return start;
	}

	public static ListNodeBottom merge(ListNodeBottom a, ListNodeBottom b) {

		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}

		ListNodeBottom result = null;
		ListNodeBottom tmp = null;

		if (a.data < b.data) {
			result = new ListNodeBottom(a.data);
			a = a.bottom;
		} else {
			result = new ListNodeBottom(b.data);
			b = b.bottom;
		}
		tmp = result;

		while (a != null && b != null) {
			if (a.data < b.data) {
				tmp.bottom = new ListNodeBottom(a.data);
				tmp = tmp.bottom;
				a = a.bottom;
			} else {
				tmp.bottom = new ListNodeBottom(b.data);
				tmp = tmp.bottom;
				b = b.bottom;
			}

		}

		if (a != null)
			tmp.bottom = a;
		else
			tmp.bottom = b;

		return result;
	}
}
/*
 * Print List with Next Pointers : 
5-->10-->19-->28-->Null
Print List with Bottom Pointers : 
5 --B--> 7 --B--> 8 --B--> 30 --B--> Null
|
N
|
10 --B--> 20 --B--> Null
|
N
|
19 --B--> 22 --B--> 50 --B--> Null
|
N
|
28 --B--> 35 --B--> 40 --B--> 45 --B--> Null
|
N
|
Null


Print List with Bottom Pointers After Flattening : 
5 --B--> 7 --B--> 8 --B--> 10 --B--> 19 --B--> 20 --B--> 22 --B--> 28 --B--> 30 --B--> 35 --B--> 40 --B--> 45 --B--> 50 --B--> Null
|
N
|
Null
 
 */
 