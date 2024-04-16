package com.controller;
import com.service.*;

public class HelloController {
	public static void main(String[] args) {
		 //controller needs to reach out to service 
		//technically, controller needs to create an object of service class. 
		
		HelloService helloService = new HelloService(); 
		
		/* Reaching out to service for the msg  */
		String msg = helloService.displayMessage();
		System.out.println(msg);
		
		/* Giving 2 int values and expecting summation */
		int ans = helloService.doSum(5,7);
		System.out.println("Sum is " + ans);
	}
}

/* 
 * A a=new A();  : A
 * B b=new B(); : B
 * Person person = new Person();
 * HelloService helloService = new HelloService(); 
 * 
 */