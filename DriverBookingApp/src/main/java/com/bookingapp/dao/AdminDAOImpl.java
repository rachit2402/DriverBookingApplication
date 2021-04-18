package com.bookingapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookingapp.users.Admin;

public class AdminDAOImpl implements AdminDAO{

	@Override
	public void addOneDriver(Admin admin) {
		String sql = "insert into Drivers values(?,?,?,?,?,?)";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, admin.getDriverid());
			statement.setString(2, admin.getName());
			statement.setInt(3, admin.getRating());
			statement.setString(4, admin.getLocation());
			statement.setDouble(5, admin.getCharges());
			statement.setLong(6,admin.getPhone());
			statement.execute();
		} catch (SQLException e) {
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
		
	}

	@Override
	public int updateOneDriver(double charges , int driverId) {
		String sql = "update Drivers set charges=? where driverId=?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result =0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setDouble(1, charges);
			statement.setInt(2, driverId);
			result = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return result;
	}

	@Override
	public int deleteOneDriver(int driverId) {
		String sql = "delete from Drivers where driverId=?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result =0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, driverId);
			result = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return result;
	}

	@Override
	public List<Admin> findAllDriver() {
		String sql = "select * from Drivers";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		List<Admin> driverList = new ArrayList<Admin>();
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("name");
				int ratings = rs.getInt(3);
				String location = rs.getString("location");
				double charges  = rs.getDouble("charges");
				long phone=rs.getLong(6);
				Admin admin  = new Admin(id, name, ratings, location, charges,phone);
				driverList.add(admin);
			}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}finally {
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
