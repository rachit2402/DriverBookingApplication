package com.bookingapp.dao;

import java.util.List;

import com.bookingapp.users.Admin;

public interface UserDao {
	List<Admin> findDriverByLocation(String location);
	List<Admin> findDriverByCharge(double charge);
	List<Admin> findDriverByRatings(int ratings);
}
