package com.interview.ds.array;

public class MaxSumNonAdjacent
{
    /*Function to return max sum such that no two elements
      are adjacent */
    int FindMaxSum(int arr[], int n)
    {
        int incl = arr[0];
        int excl = 0;
        int exclNew;
        int i;
  
        for (i = 1; i < n; i++)
        {
            /* current max excluding i */
            exclNew = Math.max(incl, excl);
  
            /* current max including i */
            incl = excl + arr[i];
            excl = exclNew;
        }
  
        /* return max of incl and excl */
        return Math.max(incl, excl);
    }
  
    // Driver program to test above functions
    public static void main(String[] args)
    {
    	MaxSumNonAdjacent sum = new MaxSumNonAdjacent();
        int arr[] = new int[]{5, 5, 10, 100, 10, 5};
        System.out.println(sum.FindMaxSum(arr, arr.length));
    }
}