package com.controller;

import com.service.ArithmeticService;

public class ArithmeticController {

	public static void main(String[] args) {
		ArithmeticService arithmeticService = new ArithmeticService();
		
		try {
			int ans = arithmeticService.multipleGivenNumbers(3,0,5,7,2,8);
			System.out.println("Ans is " +ans);
		}
		catch(RuntimeException re) {
			System.out.println(re.getMessage());
		}
	}

}

/* 
 * Validation Rules: 
 * If any given number is 0, 
 * then prompt the user with message "0 is not allowed" 
 * 
 */    