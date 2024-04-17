package com.service;

public class ArithmeticService {

	public int multipleGivenNumbers(int... n) {
	 
	    int res=1;
		for(int e:n) {
			if(e == 0)
				throw new RuntimeException("0 is not allowed");
			res = res * e;
	    }
		return res;
	}

}
//variable arguments : varargs