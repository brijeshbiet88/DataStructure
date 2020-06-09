package com.interview.ds.trie;

public class WordsWithPrefix {

	public static void main(String[] args) {
		TrieNode root = TrieUtil.getTrie();

		String prefix = "al";
		System.out.println("If Prefix : " + prefix + " exists ? " + isExists(root, prefix));

		prefix = "am";
		System.out.println("If Prefix : " + prefix + " exists ? " + isExists(root, prefix));

		prefix = "amr";
		System.out.println("If Prefix : " + prefix + " exists ? " + isExists(root, prefix));

		prefix = "mang";
		System.out.println("If Prefix : " + prefix + " exists ? " + isExists(root, prefix));
	}

	private static boolean isExists(TrieNode root, String prefix) {
		TrieNode temp = root;

		for (int i = 0; i < prefix.length(); i++) {
			if (temp.children.get(prefix.charAt(i)) == null) {
				return false;
			}
			temp = temp.children.get(prefix.charAt(i));
		}

		return true;
	}

}
/*
If Prefix : al exists ? true
If Prefix : am exists ? false
If Prefix : amr exists ? false
If Prefix : mang exists ? true
*/
