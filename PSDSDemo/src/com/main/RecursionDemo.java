package com.main;

public class RecursionDemo {
	public static void main(String[] args) {
		A a=new A(); //reaching out to class A 
		int input = 10000; 
		int result = 0; 
		while(input >0) {  //risky code 
			 result = result + a.m1(input);
			 input = input-2; 
		}
		 
		System.out.println(result);		
	}
}

class A{
	int m1(int input) {
		input = 10 * input; 
		return input;
	}
}

/* Convention 1: 
	Never ever write the logical code in main method 
 	always write the logic inside method of service class(A).
 */ 