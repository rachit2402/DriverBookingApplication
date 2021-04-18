package com.bookingapp.function;

import java.util.Scanner;

//import com.bookingapp.dao.DBConnection;
import com.bookingapp.exceptions.InvalidUserException;
import com.bookingapp.service.LoginService;
import com.bookingapp.service.LoginServiceImpl;

public class LoginMain {

	public static void logUser() {
		//DBConnection.openConnection();
		LoginService service=new LoginServiceImpl();
		String userId,password;
		System.out.println("Enter Username");
		Scanner sc=new Scanner(System.in);
		userId=sc.next();
		System.out.println("Enter Password");
		password=sc.next();
		try {
			
			service.getCustomerbyUserID(userId,password);
		}  catch (InvalidUserException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}

}
