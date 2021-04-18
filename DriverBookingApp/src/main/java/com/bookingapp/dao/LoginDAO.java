package com.bookingapp.dao;

public interface LoginDAO {
	public boolean findCustomerbyUserID(String userId,String password);
}
