package com.interview.ds.recandbacktrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LetterCombinationOfAPhoneNumber {

	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1-------------------------");
		String digits = "23";
		List<String> result = letterCombinations(digits);
		System.out.println("Letter Combination of Digits "+digits+" is :");
		result.forEach((s) -> System.out.print(s+" "));
		System.out.println();
		
		System.out.println("--------------------Test Case 2-------------------------");
		digits = "79";
		result.clear();
		result = letterCombinations(digits);
		System.out.println("Letter Combination of Digits "+digits+" is :");
		result.forEach((s) -> System.out.print(s+" "));
		System.out.println();
		
		System.out.println("--------------------Test Case 3-------------------------");
		digits = "234";
		result.clear();
		result = letterCombinations(digits);
		System.out.println("Letter Combination of Digits "+digits+" is :");
		result.forEach((s) -> System.out.print(s+" "));
		System.out.println();

		System.out.println("--------------------Test Case 4-------------------------");
		digits = "";
		result.clear();
		result = letterCombinations(digits);
		System.out.println("Letter Combination of Digits "+digits+" is :");
		result.forEach((s) -> System.out.print(s+" "));
		System.out.println();
		
		System.out.println("--------------------Test Case 5-------------------------");
		digits = "9";
		result.clear();
		result = letterCombinations(digits);
		System.out.println("Letter Combination of Digits "+digits+" is :");
		result.forEach((s) -> System.out.print(s+" "));
		System.out.println();


	}

	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if(digits.length() == 0) {
			return result;
		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "");
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("");

		
		for(int i = 0 ; i < digits.length() ; i++) {
			String digitChars = map.get(String.valueOf(digits.charAt(i)));
				int n = queue.size();
				for(int j = 0 ; j < n ; j++) {
					String queueStr = queue.poll();
					for(int k = 0 ; k < digitChars.length() ; k++) {
						String digitChar = String.valueOf(digitChars.charAt(k));
						String content = queueStr.concat(digitChar);
						queue.add(content);
					}
					
				}
			
		}
		
		while(!queue.isEmpty()) {
			result.add(queue.poll());
		}
		
		return result;

	}

}
/*
 * --------------------Test Case 1-------------------------
Letter Combination of Digits 23 is :
ad ae af bd be bf cd ce cf 
--------------------Test Case 2-------------------------
Letter Combination of Digits 79 is :
pw px py pz qw qx qy qz rw rx ry rz sw sx sy sz 
--------------------Test Case 3-------------------------
Letter Combination of Digits 234 is :
adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi 
--------------------Test Case 4-------------------------
Letter Combination of Digits  is :

--------------------Test Case 5-------------------------
Letter Combination of Digits 9 is :
w x y z 

 * */