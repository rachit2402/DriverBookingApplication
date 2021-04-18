package com.bookingapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookingapp.dao.AdminDAO;
import com.bookingapp.dao.AdminDAOImpl;
import com.bookingapp.exceptions.DriverDoesNotExistException;
import com.bookingapp.users.Admin;

public class AdminServiceImpl implements AdminService {
	
	AdminDAO adminDAO = new AdminDAOImpl();

	@Override
	public void addDriver(Admin admin) {
		adminDAO.addOneDriver(admin);		
	}

	@Override
	public void updateDriver(double charges ,int driverId) throws DriverDoesNotExistException {
		int result=adminDAO.updateOneDriver(charges, driverId);
		if(result==0)
			throw new DriverDoesNotExistException("Driver Does not exist ");
		System.out.println("Driver details updated");
	}

	@Override
	public void deleteDriver(int driverId) throws DriverDoesNotExistException {
		int result=adminDAO.deleteOneDriver(driverId);
		if(result==0)
			throw new DriverDoesNotExistException("Driver Does not exist ");
		System.out.println("Driver removed");
		
	}

	@Override
	public List<Admin> getAllDriver() {
		return adminDAO.findAllDriver()
				.stream()
				.sorted((b1,b2)->b1.getName().compareToIgnoreCase(b2.getName()))
				.collect(Collectors.toList());
	}
	
	

}
