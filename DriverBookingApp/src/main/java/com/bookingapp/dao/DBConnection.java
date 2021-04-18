package com.bookingapp.dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static Connection connection;

	public static Connection openConnection() {
		try {

			//String sql = "create table Users(name varchar(20), username varchar(20) primary key, location varchar(20),"
			//		+ "pincode integer, phone integer, email varchar(20))";
			//String sql="create table Drivers1(driverId integer primary key,name varchar(20),rating integer , location varchar(20), charges decimal )";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "system";
			connection = DriverManager.getConnection(url, username, password);
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.execute();
//			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return connection;

	}

	public static void closeConnection() {
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		//System.out.println("closeConnecton");
	}

}
