package com.main;

public class FiboSeriesApp {
	public static void main(String[] args) {
		C c=new C(); 
		System.out.print("0 ");
		System.out.println("\n Summation of fibo series first 6 "
				+ "	numbers " +c.m1(0, 1));
	}
}

class C{
	int count=0;
	long m1(long num1,long num2) {
		count++;	
		long ans=0; 
		System.out.print(num2 + " ");
		ans = num1+num2;
		num1=num2;
		num2=ans;
		if(count == 6)
			return 0; 
		return ans + m1(num1,num2);		
	}
}