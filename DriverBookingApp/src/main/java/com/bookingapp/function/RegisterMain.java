package com.bookingapp.function;

import java.util.Scanner;

import com.bookingapp.service.RegisterService;
import com.bookingapp.service.RegisterServiceImpl;
import com.bookingapp.users.CustRegister;

public class RegisterMain {

	public static void registerUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details");
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter location");
		String location = sc.next();
		System.out.println("Enter pincode");
		int pincode = sc.nextInt();
		System.out.println("Enter phone number");
		long phone = sc.nextLong();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		CustRegister register = new CustRegister(name, username, location, pincode, phone, email, password);
		RegisterService service = new RegisterServiceImpl();
		service.addUser(register);
		sc.close();
	}

}
