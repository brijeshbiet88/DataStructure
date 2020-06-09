package com.interview.ds.trie;

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
		insert(root , str5);
		
		boolean doesExist = checkWord(root,str1);
		System.out.println("Does Word : "+str1+" exists : "+doesExist);
		doesExist = checkWord(root,str1);
		System.out.println("Does Word : "+str2+" exists : "+doesExist);
		doesExist = checkWord(root,str1);
		System.out.println("Does Word : "+str3+" exists : "+doesExist);
		doesExist = checkWord(root,str4);
		System.out.println("Does Word : "+str4+" exists : "+doesExist);
		doesExist = checkWord(root,str5);
		System.out.println("Does Word : "+str5+" exists : "+doesExist);
	}

	private static boolean checkWord(TrieNode root, String str) {
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
		
		for(int i = 0; i < str.length() ; i++) {
			
			if(temp.children.containsKey(str.charAt(i))) {
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

}
