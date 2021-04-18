package com.bookingapp.function;

import java.util.Scanner;

import com.bookingapp.service.AdminService;
import com.bookingapp.service.AdminServiceImpl;
import com.bookingapp.users.Admin;
public class AddDriver {
	public static void addDriver()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details");
		System.out.println("Enter Driver id ");
		int driverId = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Ratings");
		int ratings = sc.nextInt();
		System.out.println("Enter location");
		String location = sc.next();
		System.out.println("Enter charges");
		double charges = sc.nextDouble();
		System.out.println("Enter phone number");
		long phone=sc.nextLong();
		Admin admain=new Admin(driverId, name, ratings, location, charges, phone);
		AdminService service=new AdminServiceImpl();
		service.addDriver(admain);
		System.out.println("Driver details added");
		sc.close();
	}

}
