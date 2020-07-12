package com.interview.ds.heap;

public class MinHeap {
	
	private int[] Heap; 
    private int size; 
    private int maxsize; 
  
    private static final int FRONT = 0; 
    
    public MinHeap(int maxsize) 
    { 
        this.maxsize = maxsize; 
        this.size = 0; 
        Heap = new int[this.maxsize]; 
    } 
    
    private int parent(int pos) { 
        return (pos-1) / 2; 
    } 
    
    private int leftChild(int pos) { 
        return (2 * pos) + 1; 
    } 
  
   private int rightChild(int pos)  { 
        return 2 * (pos + 1); 
    } 
  
   private boolean isLeaf(int pos) { 
       if (pos >= (size / 2) && pos < size) { 
           return true; 
       } 
       return false; 
   } 
   
   private void swap(int firstPos, int secondPos) { 
       int tmp; 
       tmp = Heap[firstPos]; 
       Heap[firstPos] = Heap[secondPos]; 
       Heap[secondPos] = tmp; 
   } 
   
   public void insert(int element) { 
       if (size >= maxsize) { 
           return; 
       } 
       Heap[size++] = element; 
       int current = size -1 ; 
 
       while (Heap[current] < Heap[parent(current)]) { 
           swap(current, parent(current)); 
           current = parent(current); 
       } 
   } 
   
   public void print() { 
       for (int i = 0; i < size / 2; i++) { 
           System.out.print(" PARENT : " + Heap[i]);
           System.out.print(" LEFT CHILD : " + Heap[2*i + 1]);
           if(size > (2 * i + 2)) {
        	   System.out.print(" RIGHT CHILD : " + Heap[2*i + 2]);
           }
            System.out.println();          
       } 
   } 
   
   public void minHeap() { 
       for (int pos = (size / 2); pos > 1; pos--) { 
           minHeapify(pos); 
       } 
   } 
   
   public int remove()  { 
       int popped = Heap[FRONT]; 
       Heap[FRONT] = Heap[--size]; 
       minHeapify(FRONT); 
       return popped; 
   } 
   
	private void minHeapify(int pos) {
		if (!isLeaf(pos)) {
			if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
				if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				}
				else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	} 

}
