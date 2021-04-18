package com.bookingapp.dao;

import java.util.List;

import com.bookingapp.users.Admin;

public interface AdminDAO {
	void addOneDriver(Admin admin);
	int updateOneDriver( double charges ,int driverId );
	int deleteOneDriver(int driverId);
	List<Admin> findAllDriver();

}
