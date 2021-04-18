package com.bookingapp.service;

import com.bookingapp.exceptions.InvalidUserException;
//import com.bookingapp.exceptions.UserAlreadyExistException;

public interface LoginService {
	public void getCustomerbyUserID(String userId,String password) throws InvalidUserException;
}
