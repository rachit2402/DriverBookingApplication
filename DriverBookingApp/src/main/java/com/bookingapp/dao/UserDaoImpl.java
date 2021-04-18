package com.bookingapp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bookingapp.dao.DBConnection;
import com.bookingapp.users.Admin;

public class UserDaoImpl implements UserDao {

	@Override
	public List<Admin> findDriverByLocation(String location) {
		String sql = "select * from Drivers where location=?";
		Connection connection = DBConnection.openConnection();
		List<Admin> driverList = new ArrayList<Admin>();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, location);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("name");
				int rating = rs.getInt(3);
				String location1 = rs.getString("location");
				double charges = rs.getDouble("charges");
				long phone = rs.getLong(6);
				Admin admin = new Admin(id, name, rating, location1, charges, phone);
				driverList.add(admin);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return driverList;

	}

	@Override
	public List<Admin> findDriverByCharge(double charge) {
		String sql = "select * from Drivers where charge<=?";
		Connection connection = DBConnection.openConnection();
		List<Admin> driverList = new ArrayList<Admin>();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setDouble(1, charge);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("name");
				int rating = rs.getInt(3);
				String location = rs.getString("location");
				double charges = rs.getDouble("charges");
				long phone = rs.getLong(6);
				Admin admin = new Admin(id, name, rating, location, charges, phone);
				driverList.add(admin);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return driverList;
	}

	@Override
	public List<Admin> findDriverByRatings(int ratings) {

		String sql = "select * from Drivers where ratings>=?";
		Connection connection = DBConnection.openConnection();
		List<Admin> driverList = new ArrayList<Admin>();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setInt(1, ratings);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("name");
				int rating = rs.getInt(3);
				String location = rs.getString("location");
				double charges = rs.getDouble("charges");
				long phone = rs.getLong(6);
				Admin admin = new Admin(id, name, rating, location, charges, phone);
				driverList.add(admin);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return driverList;
	}

}
