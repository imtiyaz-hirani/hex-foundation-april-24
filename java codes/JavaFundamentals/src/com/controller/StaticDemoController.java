package com.controller;

import java.util.Scanner;

import com.service.StaticDemoService;

public class StaticDemoController {
	public static void main(String[] args) {
		StaticDemoService staticDemoService = new StaticDemoService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter fname");
		String fname=sc.next();
		System.out.println("enter lname");
		String lname=sc.next();
		
		String fullName = staticDemoService.getFullName(fname,lname);
		System.out.println("Your full name: " + fullName);
		sc.close();
	}
}
