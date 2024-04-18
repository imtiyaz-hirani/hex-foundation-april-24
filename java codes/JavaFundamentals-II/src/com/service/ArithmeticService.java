package com.service;

public class ArithmeticService {

	public int multipleGivenNumbers(int... n) throws Exception {
	   int res=1;
		for(int e:n) {
			if(e == 0)
				throw new Exception("0 is not allowed"); 
			res = res * e;
	    }
		return res;
	}
}
//variable arguments : varargs
