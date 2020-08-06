package com.interview.ds.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianDS {

	private Queue <Integer> small = new PriorityQueue<>((a , b) -> b -a);
	private Queue <Integer> large = new PriorityQueue<>();
	
	public void addData(int data) {
		large.add(data);
		small.add(large.poll());
		
		if(large.size() < small.size()) {
			large.add(small.poll());
		}
		
		System.out.println("Added : "+data);
	}
	
	public double findMedian() {
		return large.size() > small.size()?
				large.peek() :
				(large.peek() + small.peek())/2.0;
	}
	
	public static void main(String args[]) {
		MedianDS medianDS = new MedianDS();
		int [] a = {5 , 4 , 1 , 6 ,8 ,9, 3, 9 , 0 ,2 , 8};
		for(int num : a) {
			medianDS.addData(num);
			System.out.println("Median "+medianDS.findMedian());
		}
				
				
	}
}
