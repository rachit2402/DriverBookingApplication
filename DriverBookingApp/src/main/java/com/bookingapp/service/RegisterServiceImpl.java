package com.bookingapp.service;

import com.bookingapp.dao.RegisterDAO;
import com.bookingapp.dao.RegisterDaoImpl;
import com.bookingapp.users.CustRegister;

public class RegisterServiceImpl implements RegisterService {
	RegisterDAO registerDao=new RegisterDaoImpl();
	public void addUser(CustRegister register) {
		registerDao.addOneUser(register);

	}

}
