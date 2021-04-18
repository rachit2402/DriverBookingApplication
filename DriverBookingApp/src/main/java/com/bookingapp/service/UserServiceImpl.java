package com.bookingapp.service;

import java.util.List;


import com.bookingapp.dao.UserDao;
import com.bookingapp.dao.UserDaoImpl;
import com.bookingapp.exceptions.DriverDoesNotExistException;
import com.bookingapp.users.Admin;

public class UserServiceImpl implements UserService {
	UserDao userDao=new UserDaoImpl();
	@Override
	public List<Admin> getDriverByLocation(String location) throws DriverDoesNotExistException {
		
		List<Admin> adList = userDao.findDriverByLocation(location);
		if(adList.isEmpty())
			throw new DriverDoesNotExistException("Driver not found of given Location");
		return adList;
	}

	@Override
	public List<Admin> getDriverByCharge(double charge) throws DriverDoesNotExistException {
		List<Admin> adList = userDao.findDriverByCharge(charge);
		if(adList.isEmpty())
			throw new DriverDoesNotExistException("Driver not found of given Location");
		return adList;
		
	}

	@Override
	public List<Admin> getDriverByRatings(int ratings) throws DriverDoesNotExistException {
		
		List<Admin> adList = userDao.findDriverByRatings(ratings);
		if(adList.isEmpty())
			throw new DriverDoesNotExistException("Driver not found of given Location");
		return adList;
	}

}
