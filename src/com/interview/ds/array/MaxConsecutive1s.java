package com.interview.ds.array;

public class MaxConsecutive1s {

	public static void main(String[] args) {
		int a[] = {1 ,1 , 0 , 0, 1 , 1, 1, 1, 1, 1,  0 , 0 , 1 ,1 ,1 ,0};
		int maxConsecutive1s = findMaxConsecutive1s(a);
		System.out.println("Max Consecutive 1's in Array : "+maxConsecutive1s);
	}

	private static int findMaxConsecutive1s(int[] a) {
		if(a == null || a.length == 0) {
			return 0;
		}
		
		int max = 0;
		int count = 0;
		int i = 0;
		while(i < a.length) {
			if(a[i] == 1) {
				count++;
			}else {
				max = Math.max(max, count);
				count = 0;
			}
			
			i++;
		}
		return max;
	}

}
/*Max Consecutive 1's in Array : 6 */
