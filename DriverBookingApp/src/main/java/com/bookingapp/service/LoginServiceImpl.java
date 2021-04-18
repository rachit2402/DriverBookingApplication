package com.bookingapp.service;

import com.bookingapp.dao.LoginDAO;
import com.bookingapp.dao.LoginDAOImpl;
import com.bookingapp.exceptions.InvalidUserException;
import com.bookingapp.function.UserMain;

public class LoginServiceImpl implements LoginService{
	LoginDAO cusDao=new LoginDAOImpl();
	@Override
	public void getCustomerbyUserID(String userId,String password) throws InvalidUserException {
		boolean result=cusDao.findCustomerbyUserID(userId,password);
		if(result==false)
			throw new InvalidUserException("Incorrect username or password");
		System.out.println("Login Successful");
		UserMain.bookDriver();
		
	}

	

}
