package com.bookingapp.main;

import java.util.Scanner;

import com.bookingapp.function.LoginMain;
import com.bookingapp.function.RegisterMain;

public class BookingMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice to Register or Login"+"\n"
				+ "1.To register Press 1"+"\n"
				+ "2.To Login press 2");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			RegisterMain.registerUser();
			System.out.println("Registration Done");
			break;
		case 2:
			LoginMain.logUser();
			break;
		default:
			System.out.println("Enter correct choice");
		}
		sc.close();

	}

}
