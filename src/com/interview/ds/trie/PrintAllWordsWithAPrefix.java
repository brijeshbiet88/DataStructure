package com.interview.ds.trie;

import java.util.Iterator;

public class PrintAllWordsWithAPrefix {

	public static void main(String[] args) {
		TrieNode root = TrieUtil.getTrie();
		String prefix = "m";
		printAllWordsWithPrefix(root, prefix);

	}

	private static void printAllWordsWithPrefix(TrieNode root, String prefix) {
		TrieNode temp = root;
		for (int i = 0; i < prefix.length(); i++) {
			if (temp.children.get(prefix.charAt(i)) == null) {
				return;
			}
			temp = temp.children.get(prefix.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		printAllWordsUtil(temp , prefix );
		
		
		
		return;
	}

	private static void printAllWordsUtil(TrieNode root, String prefix) {
		
		if(root.endOfWord) {
			System.out.println(" "+prefix);
			return;
		}
		
		Iterator<Character> itr = root.children.keySet().iterator();
		while(itr.hasNext()) {
			char c = itr.next();
			prefix = prefix + c;
			printAllWordsUtil(root.children.get(c), prefix);
			prefix = prefix.substring(0 , prefix.length() - 1);
		}
	}
}
