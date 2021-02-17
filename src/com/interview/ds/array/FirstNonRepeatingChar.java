package com.interview.ds.array;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1-------------------");
		String str1 = "a friend in need is a friend indeed";
		int index = findFirstNRChar(str1);
		System.out.println("First Non Repaeting character in String "+str1+"\nis :"+str1.charAt(index));
		System.out.println();
		
		System.out.println("---------------Test Case 2-------------------");
		str1 = "sanfrancisco";
		index = findFirstNRChar(str1);
		System.out.println("First Non Repaeting character in String "+str1+"\nis :"+str1.charAt(index));
		System.out.println();

		System.out.println("---------------Test Case 3-------------------");
		str1 = "target achieved";
		index = findFirstNRChar(str1);
		System.out.println("First Non Repaeting character in String "+str1+"\nis :"+str1.charAt(index));
		System.out.println();
		
		System.out.println("---------------Test Case 4-------------------");
		str1 = "take care";
		index = findFirstNRChar(str1);
		System.out.println("First Non Repaeting character in String "+str1+"\nis :"+str1.charAt(index));
		System.out.println();
	}

	private static int findFirstNRChar(String str) {
		int result = Integer.MAX_VALUE;
		
		for(int i = 'a' ; i <= 'z' ; i++) {
			int firstOccurence = str.indexOf((char)i);
			if(firstOccurence != -1 && firstOccurence == str.lastIndexOf((char)i)) {
				result = Math.min(result, firstOccurence);
			}
			
		}
		
		return result;
	}

}
