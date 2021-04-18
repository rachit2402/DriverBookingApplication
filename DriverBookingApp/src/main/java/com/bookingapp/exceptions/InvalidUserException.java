package com.bookingapp.exceptions;

public class InvalidUserException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidUserException() {
		super();
	}
	public InvalidUserException(String message) {
		super(message);
	}
}
