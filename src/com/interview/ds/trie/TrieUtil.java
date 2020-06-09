package com.interview.ds.trie;

public class TrieUtil {
	
	public static TrieNode getTrie() {
		TrieNode root = new TrieNode();
		insert(root, "apple");
		insert(root, "ape");
		insert(root, "alarm");
		insert(root, "allow");
		insert(root, "always");
		insert(root, "alfa");
		insert(root, "arm");
		insert(root, "art");
		insert(root, "ask");
		insert(root, "acer");
		insert(root, "acre");
		insert(root, "acne");
		insert(root, "alert");
		insert(root, "allow");
		insert(root, "all");
		insert(root, "bat");
		insert(root, "banana");
		insert(root, "batman");
		insert(root, "banish");
		insert(root, "band");
		insert(root, "bank");
		insert(root, "ban");
		insert(root, "bite");
		insert(root, "cat");
		insert(root, "camera");
		insert(root, "card");
		insert(root, "car");
		insert(root, "dog");
		insert(root, "date");
		insert(root, "delete");
		insert(root, "day");
		insert(root, "eye");
		insert(root, "elephant");
		insert(root, "engine");
		insert(root, "earning");
		insert(root, "fox");
		insert(root, "fish");
		insert(root, "fat");
		insert(root, "goat");
		insert(root, "girl");
		insert(root, "garland");
		insert(root, "glow");
		insert(root, "hen");
		insert(root, "hat");
		insert(root, "height");
		insert(root, "hiring");
		insert(root, "inkpot");
		insert(root, "india");
		insert(root, "intestine");
		insert(root, "invoke");
		insert(root, "jug");
		insert(root, "jolly");
		insert(root, "jar");
		insert(root, "jam");
		insert(root, "kite");
		insert(root, "kind");
		insert(root, "kill");
		insert(root, "know");
		insert(root, "lion");
		insert(root, "lemon");
		insert(root, "liar");
		insert(root, "lawyer");
		insert(root, "mango");
		insert(root, "man");
		insert(root, "meet");
		insert(root, "mess");
		insert(root, "nest");
		insert(root, "next");
		insert(root, "near");
		insert(root, "noun");
		insert(root, "owl");
		insert(root, "orange");
		insert(root, "parrot");
		insert(root, "pan");
		insert(root, "prism");
		insert(root, "queen");
		insert(root, "quilt");
		insert(root, "queue");
		insert(root, "rabbit");
		insert(root, "rat");
		insert(root, "rashes");
		insert(root, "rubbish");
		insert(root, "ship");
		insert(root, "shine");
		insert(root, "scene");
		insert(root, "tiger");
		insert(root, "triangle");
		insert(root, "umbrella");
		insert(root, "vein");
		insert(root, "vocal");
		insert(root, "watch");
		insert(root, "warn");
		insert(root, "wary");
		insert(root, "word");
		insert(root, "xmas");
		insert(root, "xyz");
		insert(root, "xoxo");
		insert(root, "xiomee");
		insert(root, "yatch");
		insert(root, "zebra");
		

		return root;

	}
	
	private static void insert(TrieNode root, String str) {

		TrieNode temp = root;

		for (int i = 0; i < str.length(); i++) {

			if (temp.children.containsKey(str.charAt(i))) {
				temp = temp.children.get(str.charAt(i));
			}

			else {
				temp.children.put(str.charAt(i), new TrieNode());
				temp = temp.children.get(str.charAt(i));
			}
		}

		temp.endOfWord = true;

	}
	
	public static boolean search(TrieNode root, String str) {
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
}
