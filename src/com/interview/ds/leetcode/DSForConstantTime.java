package com.interview.ds.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DSForConstantTime {

	
	public ArrayList<Integer> list ;
	public HashMap<Integer , Integer> map ;
	
	public DSForConstantTime() {
		list = new ArrayList<Integer>();
		map = new HashMap<Integer, Integer>();
	}
	
	public void insert(int data) {
		
		if(map.containsKey(data)) {
			return;
		}
		else {
			list.add(data);
			map.put(data, list.size()-1);
			System.out.println("Inserted : "+data);
		}
		
	}
	
	public boolean search(int data) {
		boolean found = map.containsKey(data);
		if (found)
			System.out.println("Data : " + data + " Found");
		else
			System.out.println("Data : " + data + " Not Found");
		return found;

	}
	
	public void delete(int data) {
		if(map.containsKey(data)) {
			System.out.println("Size Of List Before Deleting "+data +" is "+list.size());
			int index = map.get(data);
			map.remove(data);
			
			int temp = list.get(index);
			list.set(index, list.get(list.size()-1));
			list.remove(list.size()-1);
			map.put(list.get(index), index);
			System.out.println("Data : "+temp+" Deleted ");
			System.out.println("Size Of List After Deleting "+data+" is "+list.size());
		}else {
			System.out.println("Data : "+data+" Does not exists");
		}
	}
	
	public Integer getRandom() {
		Random random = new Random();
		int randomIndex = random.nextInt(list.size());
		int randomData = list.get(randomIndex);
		System.out.println("Random Data : "+ randomData);
		return randomData;
	}
	
	public static void main(String[] args) {
		
		DSForConstantTime ds = new DSForConstantTime();
		ds.insert(6);
		ds.insert(7);
		ds.insert(8);
		ds.insert(9);
		ds.insert(10);
		ds.insert(9);
		ds.insert(10);
		
		ds.getRandom();
		ds.getRandom();
		ds.getRandom();
		ds.getRandom();
		ds.getRandom();
		ds.getRandom();
		
		ds.getRandom();
		ds.getRandom();
		ds.getRandom();
		ds.getRandom();
		ds.getRandom();
		ds.getRandom();
		
		
		ds.search(10);
		ds.search(11);
		ds.search(12);

		ds.delete(7);
		ds.delete(7);
		ds.delete(11);
		ds.delete(12);
		ds.delete(10);
		ds.search(10);
	}

}
