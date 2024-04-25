package com.exception;

public class MarksException extends Exception{

	private String message; 
	
	public MarksException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	private static final long serialVersionUID = 106867174289775193L;

	
}
/* Constructors are used to initialize instance variables */