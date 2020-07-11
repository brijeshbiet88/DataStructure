package com.interview.ds.list;

public class CloneListWithNextAndRandomPointers {

	public static void main(String[] args) {
		ListNodeNR node  = new ListNodeNR(1);
		ListNodeNR node1 = new ListNodeNR(2);
		ListNodeNR node2 = new ListNodeNR(3);
		ListNodeNR node3 = new ListNodeNR(4);
		ListNodeNR node4 = new ListNodeNR(5);
		
		node.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		node.setRandom(node2);
		node1.setRandom(node3);
		node2.setRandom(node4);
		node3.setRandom(node);
		node4.setRandom(node2);
		
		System.out.println("Print List With Next and Random Pointer ");
		printList(node);
		
		ListNodeNR clonedList = cloneList(node);
		
		System.out.println("\nPrint Cloned List With Next and Random Pointer ");
		printList(clonedList);
		
	}
	
	private static ListNodeNR cloneList(ListNodeNR node) {
		if(node == null) return node;
		
		ListNodeNR clonedStart = new ListNodeNR(node.data);
		ListNodeNR clonedTemp = clonedStart;
		ListNodeNR temp = node.next;
		
		while(temp != null) {
			clonedTemp.setNext(new ListNodeNR(temp.data));
			clonedTemp = clonedTemp.next;
			temp = temp.next;
		}
		
		temp = node;
		clonedTemp = clonedStart;
		
		ListNodeNR originalTempNext;
		while(temp != null) {
			originalTempNext = temp.next;
		    clonedTemp.random = temp;
		    temp.next = clonedTemp;
		    clonedTemp = clonedTemp.next;
		    temp = originalTempNext;
		}
	
		clonedTemp = clonedStart;
		
		while(clonedTemp != null) {
			clonedTemp.random = clonedTemp.random.random.next;
			clonedTemp = clonedTemp.next;
		}
		
		return clonedStart;
		
	}

	private static void printList(ListNodeNR node) {
		ListNodeNR temp = node;
		while (temp != null) {
			System.out.println("Data : " + temp.data + "  next : " + temp.next + "  random : " + temp.random + " ");
			temp = temp.next;
		}

	}

	static class ListNodeNR {
		int data;
		ListNodeNR next;
		ListNodeNR random;

		@Override
		public String toString() {
			return "data=" + data + "";
		}

		public ListNodeNR(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public ListNodeNR getNext() {
			return next;
		}

		public void setNext(ListNodeNR next) {
			this.next = next;
		}

		public ListNodeNR getRandom() {
			return random;
		}

		public void setRandom(ListNodeNR random) {
			this.random = random;
		}
	}

}

/*
Print List With Next and Random Pointer 
Data : 1  next : data=2  random : data=3 
Data : 2  next : data=3  random : data=4 
Data : 3  next : data=4  random : data=5 
Data : 4  next : data=5  random : data=1 
Data : 5  next : null  random : data=3 

Print Cloned List With Next and Random Pointer 
Data : 1  next : data=2  random : data=3 
Data : 2  next : data=3  random : data=4 
Data : 3  next : data=4  random : data=5 
Data : 4  next : data=5  random : data=1 
Data : 5  next : null  random : data=3 

 */
