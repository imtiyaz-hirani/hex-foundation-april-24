package com.controller;

public class FinalSampleDemo {
	public static void main(String[] args) {
		A a=new A(); 
		B b=new B(); 
	}
}

/* final */ class A{
	final int x=10; //0
	/* final */ void m1() {
		// x=10; -- CF
		System.out.println("m1 in A");
		System.out.println(x);
	}
}

class B extends A{
	 void m1() {
		System.out.println("m1 in A");
	}
}