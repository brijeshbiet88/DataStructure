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
