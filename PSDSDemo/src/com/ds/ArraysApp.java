package com.ds;

public class ArraysApp {

	public static void main(String[] args) {
		/* Data Structure: Array 
		 * In array, data is structured using index values 
		 * */ 
		
		int[] arry = {5,3,6,7,8,2,1,9};
		System.out.println(arry[2]); //6
		arry[0] = 4; 
		System.out.println(arry); //mem location
		//arry[8] = 2; //ArrayIndexOutOfBoundsException
		//System.out.println(arry[8]);
		
		System.out.println(arry.length); //8
		//arry.length = 9; --length is final 
		
		int[] arr = new int[3];  
		System.out.println(arr[1]); //0
	}

}
