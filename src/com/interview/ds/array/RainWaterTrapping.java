package com.interview.ds.array;

public class RainWaterTrapping {

	public static void main(String[] args) {
		System.out.println("------------Test Case 1-------------------");
		int [] heights = {4 , 2, 0 ,3 ,2, 5 };
		int unitsOfWaterStored = findRainWaterTrapped(heights);
		System.out.println("Units of Rain Water Trapped : "+unitsOfWaterStored);
		
		System.out.println();
		
		System.out.println("------------Test Case 2-------------------");
		int [] heights2 = {6 , 2, 5 ,3, 4 };
		unitsOfWaterStored = findRainWaterTrapped(heights2);
		System.out.println("Units of Rain Water Trapped : "+unitsOfWaterStored);
		
		System.out.println();
		
		System.out.println("------------Test Case 3-------------------");
		int [] heights3 = {0,1,0,2,1,0,1,3,2,1,2,1};
		unitsOfWaterStored = findRainWaterTrapped(heights3);
		System.out.println("Units of Rain Water Trapped : "+unitsOfWaterStored);

	}

	private static int findRainWaterTrapped(int[] height) {
		if(height == null || height.length == 0) {
			return 0;
		}
		int len = height.length;
		int result = 0;

		int[] rightMax = new int[len];
		int[] leftMax = new int[len];

		rightMax[len - 1] = 0;
		leftMax[0] = 0;
        int max = 0;
		for (int i = 1; i < len; i++){
			max = Math.max(max, height[i-1]);
			leftMax[i]= max;
         
		}

		max = 0;
		for (int i = len-2; i >= 0; i--){
			max = Math.max(max, height[i+1]);
			rightMax[i]= max;
         
		}
		
		int minHeight = 0;
		for (int i = 1; i < len-1; i++){
			minHeight = Math.min(leftMax[i], rightMax[i]);
			if(minHeight-height[i] > 0)
			result += minHeight - height[i];
		}
		
		return result;
	}

}

/*
------------Test Case 1-------------------
Units of Rain Water Trapped : 9

------------Test Case 2-------------------
Units of Rain Water Trapped : 4

------------Test Case 3-------------------
Units of Rain Water Trapped : 6
 * */
