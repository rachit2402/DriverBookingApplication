package com.bookingapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bookingapp.users.CustRegister;

public class RegisterDaoImpl implements RegisterDAO {

	public void addOneUser(CustRegister register) {
		String sql = "insert into Users values(?,?,?,?,?,?,?)";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, register.getName());
			statement.setString(2, register.getUsername());
			statement.setString(3, register.getLocation());
			statement.setInt(4, register.getPincode());
			statement.setLong(5, register.getPhone());
			statement.setString(6, register.getEmail());
			statement.setString(7, register.getPassword());
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

}
