package com.controller;

import com.service.CalcService;

public class CalcController {

	public static void main(String[] args) {
		 //reach out to service class 
		 CalcService calService = new CalcService();
		 
		 /* Sum */
		 int result = calService.doSum(2,3);
		 System.out.println("Sum is "+ result);
		 
		 /* Sub */
		 result = calService.doSub(2,3);
		 System.out.println("Sub is " + result);
		 
		 /* Mul */
		 result = calService.doMul(2,3);
		 System.out.println("Mul is " + result);
		 
	}

}
/* crtl + space */