package com.controller;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		 /* Working with Arrays */
		int[] arry = new int[5]; //-- giving size is a drawback in arrays 
		
		/* Solution: Work with ArrayList */

		ArrayList alist =new ArrayList<>(); //pure object 
		List plist =new ArrayList<>(); //polymorphic 
	
		//I am going to work with polymorphic object
		List<Integer> list =new ArrayList<>(); // 
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(9);
		list.add(6);
	//	list.add(null); : can add null but do not sort it else u get NullPointerException
		
		System.out.println(list);
		
		/* Sort this list */
		Collections.sort(list);
		System.out.println(list);
		
		/* Search the element in the list  */
		System.out.println(Collections.binarySearch(list, 11)>0 ?"Present": "Not present");
		
		/* Getting individual element from the list */
		System.out.println(list.get(2));
	}

}
