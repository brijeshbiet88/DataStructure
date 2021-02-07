package com.interview.ds.lru;

public class ClientTest {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(3);
		
		cache.setKey(1);
		cache.setKey(2);
		cache.setKey(3);
		
		System.out.println("Print Cache Content :");
		cache.printCache();
		
		cache.setKey(4);
		cache.setKey(5);
		
		System.out.println("Print Cache Content :");
		cache.printCache();
		
		cache.setKey(3);
		
		System.out.println("Print Cache Content :");
		cache.printCache();
		

		cache.setKey(5);
		
		System.out.println("Print Cache Content :");
		cache.printCache();
		
		int data = cache.getKey(6);
		System.out.println("Key Found : "+data);
		
		data = cache.getKey(5);
		System.out.println("Key Found : "+data);
		

		System.out.println("Print Cache Content :");
		cache.printCache();
		
		data = cache.getKey(3);
		System.out.println("Key Found : "+data);
		

		System.out.println("Print Cache Content :");
		cache.printCache();
		
		data = cache.getKey(4);
		System.out.println("Key Found : "+data);
		

		System.out.println("Print Cache Content :");
		cache.printCache();
	}

}
