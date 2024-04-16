package com.controller;

import com.model.Account;
import com.model.AccountV1;

public class AccountController {
	public static void main(String[] args) {
		//super-class ref = sub-class obj 
		Account account = new AccountV1(); //poly
		
		System.out.println(account.rateOfInterest()); //5.5
	
		account.deposit();
	}
}
