package com.bookingapp.function;

import java.util.Scanner;
import java.sql.*;
import com.bookingapp.bill.GenerateBill;
import com.bookingapp.dao.DBConnection;
import com.bookingapp.exceptions.DriverDoesNotExistException;

public class SelectDriver {
public static void selectDriver()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id for the selected Driver");
	int id=sc.nextInt();
	Connection connection=DBConnection.openConnection();
	PreparedStatement statement=null;
	String sql="select charges from Drivers where driverId=?";
	try {
		statement=connection.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet rs=statement.executeQuery();
		if(rs.next()) {
			int charge=rs.getInt("charges");
			GenerateBill.generateBill(charge);
		}
		else
			throw new DriverDoesNotExistException("No driver with given id");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	sc.close();	
}
}
