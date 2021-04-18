package com.bookingapp.service;

import java.util.List;

import com.bookingapp.exceptions.DriverDoesNotExistException;
import com.bookingapp.users.Admin;

public interface AdminService {
	
	void addDriver(Admin admin);
	void updateDriver(double charges,int driverId) throws DriverDoesNotExistException;
	void deleteDriver(int driverId) throws DriverDoesNotExistException;
	List<Admin> getAllDriver();
}
