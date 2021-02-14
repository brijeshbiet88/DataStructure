package com.interview.ds.array;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1-----------------------");
		int [] flowerbed = {1 , 0  , 0 , 0 ,1};
		int n = 1;
		boolean canBePlaced = canPlaceFlowers(flowerbed, n);
		System.out.println("Can "+n+" Flowers Be Placed in flowerbed: "+canBePlaced);
		System.out.println();
		
		System.out.println("-----------------Test Case 2-----------------------");
		int [] flowerbed2 = {1 , 0  , 0 , 0 ,1};
		n = 2;
		canBePlaced = canPlaceFlowers(flowerbed2, n);
		System.out.println("Can "+n+" Flowers Be Placed in flowerbed: "+canBePlaced);
		System.out.println();
		
		System.out.println("-----------------Test Case 3-----------------------");
		int [] flowerbed3 = {1 , 0  , 1 , 0 ,1 , 0 , 1};
		n = 0;
		canBePlaced = canPlaceFlowers(flowerbed3, n);
		System.out.println("Can "+n+" Flowers Be Placed in flowerbed: "+canBePlaced);
		System.out.println();
		
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		if (n == 0) {
			return true;
		}
		int count = 0;

		for (int i = 0; i < flowerbed.length; i++) {

			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				count++;
				i++;
				if (count == n)
					return true;

			}

		}
		return false;
	}

}
