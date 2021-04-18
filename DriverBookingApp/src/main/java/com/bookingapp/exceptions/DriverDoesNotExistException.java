package com.bookingapp.exceptions;

public class DriverDoesNotExistException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DriverDoesNotExistException() {
		super();
	}
	public DriverDoesNotExistException(String message) {
		super(message);
	}
}
