package com.interview.ds.graph;

import java.util.LinkedList;
import java.util.Queue;


public class KnightwalkProblem {

	public static void main(String[] args) {
		System.out.println("-------------------Test Case 1-------------------");
		Cell startPoint = new Cell(0, 0);
		Cell targetPoint = new Cell(7, 7);
		int minMovesToReachTarget = findMinMovesToReachTarget(startPoint , targetPoint);
		System.out.println("Start Point "+startPoint.row+","+startPoint.col);
		System.out.println("Target Point "+targetPoint.row+","+targetPoint.col);
		System.out.println("Min Moves To reach To target "+minMovesToReachTarget);
		System.out.println();
		
		System.out.println("-------------------Test Case 2`-------------------");
		startPoint = new Cell(0, 0);
		targetPoint = new Cell(2, 2);
		minMovesToReachTarget = findMinMovesToReachTarget(startPoint , targetPoint);
		System.out.println("Start Point "+startPoint.row+","+startPoint.col);
		System.out.println("Target Point "+targetPoint.row+","+targetPoint.col);
		System.out.println("Min Moves To reach To target "+minMovesToReachTarget);System.out.println();
		
		System.out.println("-------------------Test Case 3`-------------------");
		startPoint = new Cell(0, 1);
		targetPoint = new Cell(2, 2);
		minMovesToReachTarget = findMinMovesToReachTarget(startPoint , targetPoint);
		System.out.println("Start Point "+startPoint.row+","+startPoint.col);
		System.out.println("Target Point "+targetPoint.row+","+targetPoint.col);
		System.out.println("Min Moves To reach To target "+minMovesToReachTarget);System.out.println();
	}

	private static int findMinMovesToReachTarget(Cell startPoint, Cell targetPoint) {
		if (startPoint.row == targetPoint.row && startPoint.col == targetPoint.col)
			return 0;
		int minMoves = 0;
		boolean[][] visited = new boolean[8][8];
		int[] row = { -2, -1, 1, 2, 2, 1, -1, -2 };
		int[] col = { 1, 2, 2, 1, -1, -2, -2, -1 };
		Moves moves = new Moves(startPoint, 0);
		visited[startPoint.row][startPoint.col] = true;
		Queue<Moves> q = new LinkedList<Moves>();
		q.add(moves);
		while (!q.isEmpty()) {
			
			Moves temp = q.poll();
			
			for(int index = 0 ; index < 8 ; index++) {
				if(isSafe(temp.cell.row + row[index], temp.cell.col + col[index], visited)) {
					Cell c = new Cell(temp.cell.row + row[index] ,temp.cell.col + col[index]);
					visited[c.row][c.col] = true;
					if(c.row == targetPoint.row && c.col == targetPoint.col) {
						return temp.dist + 1;
					}
					q.add(new Moves(c, temp.dist+1));
				}
				
			}
				
		}

		return minMoves;

	}
	
	private static boolean isSafe(int i, int j, boolean visited[][]) {
		int R = 8, C = 8;
		return (i >= 0) && (i < R) && (j >= 0) && (j < C) && !visited[i][j];
	}

}

class Cell {
	int row, col;

	public Cell(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
}

class Moves {
	Cell cell ;
	int dist;
	public Moves(Cell cell, int dist) {
		super();
		this.cell = cell;
		this.dist = dist;
	}
	
}

/*
 * -------------------Test Case 1-------------------
Start Point 0,0
Target Point 7,7
Min Moves To reach To target 6

-------------------Test Case 2`-------------------
Start Point 0,0
Target Point 2,2
Min Moves To reach To target 4

-------------------Test Case 3`-------------------
Start Point 0,1
Target Point 2,2
Min Moves To reach To target 1

 * */

