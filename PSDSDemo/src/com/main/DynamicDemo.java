package com.main;

public class DynamicDemo {
	public static void main(String[] args) {
		B b=new B(); 
		int input = 10; 
		System.out.println(b.m1(input));
	}
}

class B{    
	 
	int m1(int input) {
		int ans = 0;
		if(input == 0)
			return 0;
		ans = 10 * input;
		input = input-2; 
		return ans + m1(input);
	}
}