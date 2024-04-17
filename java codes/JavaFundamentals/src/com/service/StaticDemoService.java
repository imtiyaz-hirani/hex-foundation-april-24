package com.service;

import com.utility.NameUtility;

public class StaticDemoService {

	public String getFullName(String fname, String lname) {
		String name = NameUtility.generateName(fname, lname);
		return name;
	}

}
