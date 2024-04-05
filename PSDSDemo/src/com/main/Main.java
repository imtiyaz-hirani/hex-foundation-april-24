package com.main;

public class Main {
	public static void main(String[] args) {
		 System.out.println("========Linear Technique==========");
		 int[] arry = {5,3,7,1,8,4,9};
		 int input = 15;
		 int numComparision=0;
		 boolean isPresent=false; 
		 
		 for(int e : arry) { //e=5, e=3, e=7, e=1..... 
			 numComparision++;
			 if(input == e) {
				 isPresent = true;
				 break; 
			 }
		 }
		 
		 System.out.println(isPresent?"Element Present, Num of Comparision:" + numComparision: "Element Not Present, Num of Comparision: " + numComparision);
	}

}
