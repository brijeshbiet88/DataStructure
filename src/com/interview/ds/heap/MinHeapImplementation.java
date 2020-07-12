package com.interview.ds.heap;

public class MinHeapImplementation {

	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap(10);
		
		minHeap.insert(9);
		minHeap.insert(0);
		minHeap.insert(1);
		minHeap.insert(3);
		minHeap.insert(6);
		minHeap.insert(7);
		minHeap.insert(8);
		minHeap.insert(2);
		minHeap.insert(5);
		minHeap.insert(4);
		
		System.out.println(" Print Min Heap ...");
		minHeap.print();
		
		minHeap.remove();
		
		System.out.println("\n Print Min Heap ...");
		minHeap.print();
		
		minHeap.remove();
		
		System.out.println("\n Print Min Heap ...");
		minHeap.print();
		
		minHeap.remove();
		
		System.out.println("\n Print Min Heap ...");
		minHeap.print();
		
		minHeap.remove();
		
		System.out.println("\n Print Min Heap ...");
		minHeap.print();
		
		minHeap.remove();
		
		System.out.println("\n Print Min Heap ...");
		minHeap.print();

	}

}

/*
 Print Min Heap ...
 PARENT : 0 LEFT CHILD : 2 RIGHT CHILD : 1
 PARENT : 2 LEFT CHILD : 3 RIGHT CHILD : 4
 PARENT : 1 LEFT CHILD : 7 RIGHT CHILD : 8
 PARENT : 3 LEFT CHILD : 9 RIGHT CHILD : 5
 PARENT : 4 LEFT CHILD : 6

 Print Min Heap ...
 PARENT : 1 LEFT CHILD : 2 RIGHT CHILD : 6
 PARENT : 2 LEFT CHILD : 3 RIGHT CHILD : 4
 PARENT : 6 LEFT CHILD : 7 RIGHT CHILD : 8
 PARENT : 3 LEFT CHILD : 9 RIGHT CHILD : 5

 Print Min Heap ...
 PARENT : 2 LEFT CHILD : 3 RIGHT CHILD : 6
 PARENT : 3 LEFT CHILD : 5 RIGHT CHILD : 4
 PARENT : 6 LEFT CHILD : 7 RIGHT CHILD : 8
 PARENT : 5 LEFT CHILD : 9

 Print Min Heap ...
 PARENT : 3 LEFT CHILD : 4 RIGHT CHILD : 6
 PARENT : 4 LEFT CHILD : 5 RIGHT CHILD : 9
 PARENT : 6 LEFT CHILD : 7 RIGHT CHILD : 8

 Print Min Heap ...
 PARENT : 4 LEFT CHILD : 5 RIGHT CHILD : 6
 PARENT : 5 LEFT CHILD : 8 RIGHT CHILD : 9
 PARENT : 6 LEFT CHILD : 7

 Print Min Heap ...
 PARENT : 5 LEFT CHILD : 7 RIGHT CHILD : 6
 PARENT : 7 LEFT CHILD : 8 RIGHT CHILD : 9
 
 */
