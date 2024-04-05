package com.main;

import java.util.Arrays;

public class BinaryDemo {
	public static void main(String[] args) {
		System.out.println("========Linear Technique==========");
		 int[] arry = {5,3,7,1,8,4,9};
		 int input = 7;
		 //this sorts the array //7
		 Arrays.sort(arry); // {1,3,4,5,7,8,9}

		 for(int e :arry) {
			 System.out.print(e + " ");
		 }
		 
		 System.out.println("\n---");
		 int result = Arrays.binarySearch(arry, input);
		 System.out.println(result<0?"Element not present": "Element Present, index pos: " + result);
	}
}
