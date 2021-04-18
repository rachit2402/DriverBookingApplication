package com.bookingapp.bill;

import java.util.Scanner;

public class GenerateBill {
	public static void generateBill(int charge)
	{
		Scanner sc=new Scanner(System.in);
		double gst=charge+(charge*.12);
		System.out.println("Enter number of days of journey");
		int days=sc.nextInt();
		double totalBill=gst+(charge*days);
		System.out.println("Total Bill of Journery"+totalBill);
		
	}
}
