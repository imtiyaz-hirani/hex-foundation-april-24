package com.utility;

public class NameUtility {

	public static String generateName(String fname,
			String lname) {
		return fname.trim().concat(" ")
				.concat(lname.trim());
	}
}
