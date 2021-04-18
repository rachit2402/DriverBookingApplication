package com.bookingapp.service;

import java.util.List;

import com.bookingapp.exceptions.DriverDoesNotExistException;
import com.bookingapp.users.Admin;

public interface UserService {
	List<Admin> getDriverByLocation(String location) throws DriverDoesNotExistException;
	List<Admin> getDriverByCharge(double charge)throws DriverDoesNotExistException;
	List<Admin> getDriverByRatings(int ratings)throws DriverDoesNotExistException;
}
