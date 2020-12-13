package com.interview.ds.list;

public class ListNodeBottom {

		int data;
		ListNodeBottom next;
		ListNodeBottom bottom;
		
		public ListNodeBottom(int data) {
			this.data = data;
		}
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public ListNodeBottom getNext() {
			return next;
		}
		public void setNext(ListNodeBottom next) {
			this.next = next;
		}
		public ListNodeBottom getBottom() {
			return bottom;
		}
		public void setBottom(ListNodeBottom bottom) {
			this.bottom = bottom;
		}

		@Override
		public String toString() {
			return "ListNodeBottom [data=" + data + "]";
		}

}
