package com.interview.ds.streams;

public class FirstNonRepeatedCharacterInStream {
	private static ListNode head = new ListNode(' ');
	private static ListNode tail = new ListNode(' ');
	private static ListNode[] a;

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1 ---------------------");
		String str = "coming back on track";
		System.out.println("String Entered : " + str);
		System.out.println("First Non Repeating Character In Stream is : " + firstNRChar(str));
		System.out.println();

		System.out.println("--------------Test Case 2 ---------------------");
		str = "cricbuzz";
		System.out.println("String Entered : " + str);
		System.out.println("First Non Repeating Character In Stream is : " + firstNRChar(str));
		System.out.println();
		
		System.out.println("--------------Test Case 3 ---------------------");
		str = "banana ball";
		System.out.println("String Entered : " + str);
		System.out.println("First Non Repeating Character In Stream is : " + firstNRChar(str));
		System.out.println();
	}

	private static Character firstNRChar(String str) {
		int strLen = str.length();
		head.next = tail;
		tail.pre = head;
		a = new ListNode[256];
		for (int i = 0; i < strLen; i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				continue;
			} else if (a[ch] != null && a[ch].getData() != ' ') {
				ListNode node = a[ch];
				node.pre.next = node.next;
				node.next.pre = node.pre;
				a[ch] = new ListNode(' ');
			} else {
				ListNode node = new ListNode(ch);
				a[ch] = node;
				node.next = tail;
				node.pre = tail.pre;
				tail.pre.next = node;
				tail.pre = node;
			}

		}
		return head.next.getData();

	}

}
/*
 * --------------Test Case 1 ---------------------
String Entered : coming back on track
First Non Repeating Character In Stream is : m

--------------Test Case 2 ---------------------
String Entered : cricbuzz
First Non Repeating Character In Stream is : r

--------------Test Case 3 ---------------------
String Entered : banana ball
First Non Repeating Character In Stream is :  


 * */
