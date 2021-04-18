package com.bookingapp.function;

import java.util.Scanner;

import com.bookingapp.exceptions.DriverDoesNotExistException;
import com.bookingapp.service.UserService;
import com.bookingapp.service.UserServiceImpl;

public class UserMain {

	public static void bookDriver() {
		UserService service = new UserServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter from given numbers for choice:" +"\n"
		+ "1.To get  Driver by location enter 1"+"\n"
		+ "2.To get Driver by charge enter 2" +"\n"
		+ "3.To get Driver by ratings enter 3");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Please enter details to get Driver by location");
			System.out.println("Enter location");
			String location = sc.next();
			try {
				service.getDriverByLocation(location).forEach(System.out::println);
				SelectDriver.selectDriver();
			} catch (DriverDoesNotExistException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("Please enter details to get Driver by charge");
			System.out.println("Enter charge");
			double charge = sc.nextDouble();
			try {
				service.getDriverByCharge(charge).forEach(System.out::println);
			} catch (DriverDoesNotExistException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("Please enter details to get Driver by ratings");
			System.out.println("Enter ratings");
			int rating = sc.nextInt();
			try {
				service.getDriverByRatings(rating).forEach(System.out::println);
			} catch (DriverDoesNotExistException e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("Wrong choice");
		}

		sc.close();
	}

}
