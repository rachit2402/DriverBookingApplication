package com.bookingapp.function;

import java.util.Scanner;

import com.bookingapp.exceptions.DriverDoesNotExistException;
import com.bookingapp.service.AdminService;
import com.bookingapp.service.AdminServiceImpl;

//import com.bookingapp.dao.DBConnection;

public class AdminMain {

	public static void main(String[] args) {
		//DBConnection.openConnection();
		AdminService service = new AdminServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter from given numbers for choice:"+"\n"
				+ "1.To get all Driver enter 1"+"\n"
				+ "2.To add Driver enter 2"+"\n"
				+ "3.To Update Driver enter 3"+"\n"
				+ "4.To delete Driver enter 4");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			service.getAllDriver().forEach(System.out::println);
			break;
		case 2:
			System.out.println("Want to add Driver");
			System.out.println("Enter yes or no");
			String choice1;
			choice1 = sc.next();
			if (choice1.equalsIgnoreCase("Yes"))
				AddDriver.addDriver();
			break;
		case 3:
			System.out.println("Please enter details to update");
			System.out.println("Enter charge");
			double charge = sc.nextDouble();
			System.out.println("Enter id");
			int id = sc.nextInt();
			try {
				service.updateDriver(charge, id);
			} catch (DriverDoesNotExistException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			System.out.println("Please enter details to delete");
			System.out.println("Enter id");
			int id1 = sc.nextInt();
			try {
				service.deleteDriver(id1);
			} catch (DriverDoesNotExistException e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("Enter the correct choice");

		}
		sc.close();

	}

}
