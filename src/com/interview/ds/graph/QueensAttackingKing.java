package com.interview.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensAttackingKing {

	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1------------------------");
		int [][] queens = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
		int [] king = {0 , 0};
		
		List<List<Integer>> res = queensAttacktheKing(queens, king);
		System.out.println("Result");
		res.forEach(l -> System.out.println(l.get(0)+","+l.get(1)));
		
		System.out.println();

	}
	
	
	 public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
	       List<List<Integer>> res = new ArrayList();
	        boolean [][] queensFound = new boolean[8][8];
	        
	        for(int i = 0 ;i < queens.length ; i++){
	            queensFound[queens[i][0]][queens[i][1]] = true;
	        }
	        
	        int [] moves = {-1 , 0 , 1};
	        
	        for(int xM : moves ){
	            for(int yM : moves ){
	                
	                if(xM == 0 && yM == 0) continue;
	                
	                int x = king[0];
	                int y = king[1];
	                
	                while(x+xM >= 0 && x+xM < 8 && y+yM >= 0 && y+yM < 8){
	                    x += xM;
	                    y += yM;
	                    
	                    if(queensFound[x][y] == true){
	                        res.add(Arrays.asList(x,y));
	                        break;
	                    }
	                }
	                
	            }
	        }
	        
	        return res;
	    }

}

/*
 * --------------------Test Case 1------------------------
Result
0,1
1,0
3,3
 * */
