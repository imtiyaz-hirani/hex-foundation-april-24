package com.controller;

public class SampleController {
	public static void main(String[] args) {
		String name="              john squire           "; //whitespace
		name = name.trim(); //deletes the white space 
		System.out.println(name.length());
		
		System.out.println("Welcome " + name);
	}
}
