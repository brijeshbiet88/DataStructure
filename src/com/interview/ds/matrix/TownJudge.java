package com.interview.ds.matrix;

public class TownJudge {

	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1----------------------");
		int N = 2;
		int [][] trust = {{1 ,2}};
		System.out.println("Town Judge is : "+findJudge(N, trust));
		System.out.println();
		
		System.out.println("--------------------Test Case 2----------------------");
		N = 3;
		int [][] trust2 = {{1 ,3} , {2 , 3}};
		System.out.println("Town Judge is : "+findJudge(N, trust2));
		System.out.println();
		
		System.out.println("--------------------Test Case 3----------------------");
		N = 3;
		int [][] trust3 = {{1 ,3} , {2 , 3} , {3 , 1}};
		System.out.println("Town Judge is : "+findJudge(N, trust3));
		System.out.println();
		
		System.out.println("--------------------Test Case 4----------------------");
		N = 3;
		int [][] trust4 = {{1 ,2} , {2 , 3}};
		System.out.println("Town Judge is : "+findJudge(N, trust4));
		System.out.println();
		
		System.out.println("--------------------Test Case 5----------------------");
		N = 4;
		int [][] trust5 = {{1 ,3} ,{1 , 4}, {2 , 3}, {2 ,4} , {4 , 3}};
		System.out.println("Town Judge is : "+findJudge(N, trust5));
		System.out.println();

	}
	
	public static int findJudge(int N, int[][] trust) {
		
		int [] persons = new int [N];
		for(int [] t : trust) {
			persons[t[0]-1]--;
			persons[t[1]-1]++;
		}
		
		for(int i = 0 ; i < N ; i++) {
			
			if(persons[i] == N-1) return i+1; 
		}
		
		return -1;

        
    }

}
