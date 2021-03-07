package com.interview.ds.graph;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfIslandsBFS {

	public static void main(String[] args)  
	{  
		System.out.println("-------------Test Case 1----------------------");
	    int mat[][] = { { 1, 1, 0, 0, 0 },  
	                    { 0, 1, 0, 0, 1 },  
	                    { 1, 0, 0, 1, 1 },  
	                    { 0, 0, 0, 0, 0 },  
	                    { 1, 0, 1, 0, 1 } };  
	  
	    System.out.print(countIslands(mat));  
	    System.out.println();
	    
	    System.out.println("-------------Test Case 2----------------------");
	    int mat2[][] = { { 1, 1, 0, 0, },  
	                    { 0, 1, 0, 0,  },  
	                    { 1, 0, 0, 1,  },  
	                    { 0, 0, 0, 1, },  
	                    { 1, 1, 1, 0, } };  
	  
	    System.out.print(countIslands(mat2));  
	    System.out.println();
	} 
	
	static int countIslands(int mat[][]) {
		int R = mat.length , C = mat[0].length;
		boolean[][] visited = new boolean[R][C];
		int res = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (mat[i][j] == 1 && !visited[i][j]) {
					BFS(mat, visited, i, j);
					res++;
				}
			}
		}
		return res;
	}

	private static void BFS(int[][] mat, boolean[][] visited, int i, int j) {
		int [] rowArr = {-1 , -1 ,  0 , 1 , 1 , 1 , 0 , -1};
		int [] colArr = {0  ,  1,   1 , 1 , 0 , -1, -1, -1};
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair (i , j));
		visited[i][j] = true;
		while(!q.isEmpty()) {
			Pair pair = q.poll();
			for(int index = 0 ; index < 8 ; index++)
			if(isSafe(mat, pair.r+rowArr[index], pair.c+colArr[index], visited)) {
				visited[pair.r+rowArr[index]][pair.c+colArr[index]] = true;
				q.add(new Pair(pair.r+rowArr[index], pair.c+colArr[index]));
			}
		}
		
	}
	
	
	private static boolean isSafe(int mat[][], int i, int j, boolean visited[][]) {
		int R = mat.length, C = mat[0].length;
		return (i >= 0) && (i < R) && (j >= 0) && (j < C) && (mat[i][j] == 1 && !visited[i][j]);
	}
	

}

class Pair {
	int r , c;

	public Pair(int r, int c) {
		super();
		this.r = r;
		this.c = c;
	}
}