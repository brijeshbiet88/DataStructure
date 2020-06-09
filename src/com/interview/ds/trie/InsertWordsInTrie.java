package com.interview.ds.trie;

import javax.naming.directory.SearchResult;

public class InsertWordsInTrie {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "pqrs";
		String str3 = "wxyz";
		String str4 = "post";
		String str5 = "apple";
		
		TrieNode root = new TrieNode();
		
		insert(root , str1);
		insert(root , str2);
		insert(root , str3);
		insert(root, str5);
		
		boolean doesExist = search(root,str1);
		System.out.println("Does Word : "+str1+" exists : "+doesExist);
		doesExist = search(root,str1);
		System.out.println("Does Word : "+str2+" exists : "+doesExist);
		doesExist = search(root,str1);
		System.out.println("Does Word : "+str3+" exists : "+doesExist);
		doesExist = search(root,str4);
		System.out.println("Does Word : "+str4+" exists : "+doesExist);
		doesExist = searchRecursive(root,str5);
		System.out.println("Does Word : "+str5+" exists : "+doesExist);
	}

	private static boolean search(TrieNode root, String str) {
		TrieNode temp = root;
		for (int i = 0; i < str.length(); i++) {
			if(temp.children.containsKey(str.charAt(i))) {
				temp = temp.children.get(str.charAt(i));
			}
			else {
				return false;
			}
		}
		return true;
	}

	private static void insert(TrieNode root, String str) {

		TrieNode temp = root;

		for (int i = 0; i < str.length(); i++) {

			if (temp.children.containsKey(str.charAt(i))) {
				temp = temp.children.get(str.charAt(i));
			}

			else {
				temp.children.put(str.charAt(i), new TrieNode());
				temp.endOfWord = false;
				temp = temp.children.get(str.charAt(i));
			}
		}

		temp.endOfWord = true;

	}
	
	public static void insertRecursive(TrieNode root, String word) {
		insertRecursive(root, word, 0);
	}


	private static void insertRecursive(TrieNode temp, String word, int index) {
		if (index == word.length()) {
			temp.endOfWord = true;
			return;
		}
		char ch = word.charAt(index);
		TrieNode node = temp.children.get(ch);

		if (node == null) {
			node = new TrieNode();
			temp.children.put(ch, node);
		}
		insertRecursive(node, word, index + 1);
	}
    
	public static boolean searchRecursive(TrieNode root, String word) {
		return searchRecursive(root, word, 0);
	}
    
	private static boolean searchRecursive(TrieNode temp, String word, int index) {
		if (index == word.length()) {
			return temp.endOfWord;
		}
		char ch = word.charAt(index);
		TrieNode node = temp.children.get(ch);
		if (node == null) {
			return false;
		}
		return searchRecursive(node, word, index + 1);
	}

}




/*
 *Does Word : abcd exists : true
Does Word : pqrs exists : true
Does Word : wxyz exists : true
Does Word : post exists : false
Does Word : apple exists : true
 
 */
