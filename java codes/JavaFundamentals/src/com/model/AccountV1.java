package com.model;

public class AccountV1 extends Account{ //sub class 
	
	public double rateOfInterest() {
		return 5.5;
	}
	
	public void deposit() {
		System.out.println("Deposit from accountV1 class");
	}
}
